package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import Model.Arquivo;
import Model.Peca;
import Model.Tabuleiro;

public class TabuleiroVisualizacao extends JPanel implements MouseListener {

	public Tabuleiro tabuleiro;
	private Quadrado[][] quadrado;
	public Boolean finalizado;
	public Boolean empatado;
	public Boolean desistir;
	public int jogadasdoBranco;
	public int jogadasdoPreto;
	public int vencedor;
	public int quantidadedejogadas;
	//vencedor = 0 BRANCAS
	//vencedor = 1 PRETAS
	public Jogo jogo;
	Arquivo escritaderesultado = new Arquivo();
	
	public TabuleiroVisualizacao(Tabuleiro tabuleiro,Jogo jogo)
	{
		this.quadrado = new Quadrado[8][8];
		
		this.tabuleiro = tabuleiro;
		this.criarTab();
		this.finalizado = false;
		this.empatado = false;
		this.desistir = false;
		this.jogadasdoBranco = 0;
		this.jogadasdoPreto = 0;
		this.quantidadedejogadas = 0;
		this.jogo = jogo;
	}
	
	public TabuleiroVisualizacao(Tabuleiro tabuleiro)
	{
		this.quadrado = new Quadrado[8][8];
		
		this.tabuleiro = tabuleiro;
		this.criarTab();
		this.finalizado = false;
		this.empatado = false;
		this.desistir = false;
		this.jogadasdoBranco = 0;
		this.jogadasdoPreto = 0;
		this.quantidadedejogadas = 0;
		
	}
	
	
	public void criarTab()
	{
		this.removeAll();
		this.setLayout(new GridLayout(8,8));
		
		for (int i = 0; i < 8;i++) {
			for (int j = 0; j < 8;j++) {
				//quadrado do tabuleiro
				Quadrado quadrado;
				//passando o valor da peca conforme foi informado a posicao no tabuleiro
				Peca peca = this.tabuleiro.getPeca(i,j);
				if(peca == null)
				{
					//se nao existir peca na posicao retorna null entao quadrado sem peca
					quadrado = new Quadrado(i,j,tabuleiro.selecionada);
					this.addnoTab(quadrado);
					
				}
				else
				{
					quadrado = new Quadrado(new PecaVisualizada(peca));
					this.addnoTab(quadrado);
					
				}
				if((i+j)%2 == 0)
				{
					
					this.quadrado[i][j].setBackground(Color.WHITE);
				//	quadrado.setBounds(i*50,j*50,50,50);
				}
				else
				{
					this.quadrado[i][j].setBackground(Color.GRAY);
				//	quadrado.setBounds(i*50,j*50,50,50);

				}
				
				
				//adicionando o quadrado ao tabuleiro
				this.add(this.quadrado[i][j]);
				quadrado.addMouseListener(this);
				
			}
			this.revalidate();
			this.repaint();
		}
		
		
		
	}
	
	public Tabuleiro getTab(){
		return this.tabuleiro;
	}
	public void addnoTab(Quadrado quadrado)
	{
		this.quadrado[quadrado.linha][quadrado.coluna] = quadrado;
	}
	public Quadrado getQuadrado(int linha, int coluna)
	{
		return this.quadrado[linha][coluna];
	}
	public void ProporEmpate()
	{
		Object[] options = { "Aceitar", "Recusar" };
		int resposta  = JOptionPane.showOptionDialog(null,"O jogador adversario esta propando empate:","Empate?",
		          JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
		              null, options, options[0]);
		if(resposta == 0)
		{
				this.empatado = true;
				this.jogo.btnDesistirPreto.setEnabled(false);
				this.jogo.btnDesistirBranco.setEnabled(false);
				this.jogo.btnProporBranco.setEnabled(false);
				this.jogo.btnProporPreto.setEnabled(false);
				escritaderesultado.Write("ListaDeJogadas.txt","Empate");

		}
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Arquivo escritaderesultado = new Arquivo();
		Object[] options = { "Voltar ao tabuleiro", "Voltar ao menu" };
		int resposta;
		if(this.finalizado == true || this.empatado == true || this.desistir == true) {
			JOptionPane.showMessageDialog(null, "JOGO JA FINALIZADO");
			
		}
		else
		{
			
			Quadrado quadrado = (Quadrado) e.getSource();	
			this.tabuleiro.jogar(quadrado.linha,quadrado.coluna);
			this.criarTab();
			
			//caso dentro da movimentacao ocorra a o mate entao o tabuleiro sera finalizado
			if(this.finalizado == true )
				{
				
						if(!this.tabuleiro.vezdobranco)
						{
							
									resposta  = JOptionPane.showOptionDialog(null,"As brancas ganharam !","XEQUE-MATE",
									          JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
									              null, options, options[0]);
									this.jogo.btnDesistirPreto.setEnabled(false);
									this.jogo.btnDesistirBranco.setEnabled(false);
									this.jogo.btnProporBranco.setEnabled(false);
									this.jogo.btnProporPreto.setEnabled(false);
									this.vencedor = 0;
									
									escritaderesultado.Write("ListaDeJogadas.txt","Brancas Venceram");
									
						}
						else
						{
							
									resposta  = JOptionPane.showOptionDialog(null,"As pretas ganharam !","XEQUE-MATE",
									          JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
									              null, options, options[0]);
									this.jogo.btnDesistirPreto.setEnabled(false);
									this.jogo.btnDesistirBranco.setEnabled(false);
									this.jogo.btnProporBranco.setEnabled(false);
									this.jogo.btnProporPreto.setEnabled(false);
									this.vencedor = 1;
									
									escritaderesultado.Write("ListaDeJogadas.txt","Pretas Venceram");
						}
									if(resposta == 1)
									{
										this.tabuleiro.jogo.setVisible(false);
										new TelaDeInicio().setVisible(true);;
									}
						
				
				}
			
					if(this.empatado == true || (this.jogadasdoBranco + this.jogadasdoPreto) == 50)
					{
					
					
						
								resposta  = JOptionPane.showOptionDialog(null,"Jogo empatado !","EMPATE",
								          JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
								              null, options, options[0]);
								
								escritaderesultado.Write("ListaDeJogadas.txt","Empate");
							
							if(resposta == 1)
							{
										this.tabuleiro.jogo.setVisible(false);
										new TelaDeInicio().setVisible(true);;
									
							
							}
					}
			}
		}
	
	
		
	


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
