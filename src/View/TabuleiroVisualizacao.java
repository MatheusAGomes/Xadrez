package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import Model.Peca;
import Model.Tabuleiro;

public class TabuleiroVisualizacao extends JPanel implements MouseListener {

	private Tabuleiro tabuleiro;
	private Quadrado[][] quadrado;
	public Boolean finalizado;
	public Boolean empatado;
	public int jogadasdoBranco;
	public int jogadasdoPreto;
	
	public TabuleiroVisualizacao(Tabuleiro tabuleiro)
	{
		this.quadrado = new Quadrado[8][8];
		
		this.tabuleiro = tabuleiro;
		this.criarTab();
		this.finalizado = false;
		this.empatado = false;
		this.jogadasdoBranco = 20;
		this.jogadasdoPreto = 20;
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
					this.quadrado[i][j].setBackground(Color.BLACK);
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
	
	


	@Override
	public void mouseClicked(MouseEvent e) {
		Object[] options = { "Voltar ao tabuleiro", "Voltar ao menu" };
		int resposta;
		if(this.finalizado == true || this.empatado == true) {
			JOptionPane.showMessageDialog(null, "JOGO JA FINALIZADO");
		}
		else
		{
			
			Quadrado quadrado = (Quadrado) e.getSource();	
			this.tabuleiro.jogar(quadrado.linha,quadrado.coluna);
			this.criarTab();
			System.out.printf("\n %d ",this.jogadasdoBranco);
			System.out.printf(" %d \n",this.jogadasdoPreto);
			//caso dentro da movimentacao ocorra a o mate entao o tabuleiro sera finalizado
			if(this.finalizado == true )
				{
				
						if(!this.tabuleiro.vezdobranco)
						{
							
									resposta  = JOptionPane.showOptionDialog(null,"As brancas ganharam !","XEQUE-MATE",
									          JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
									              null, options, options[0]);
									
						}
						else
						{
							
									resposta  = JOptionPane.showOptionDialog(null,"As pretas ganharam !","XEQUE-MATE",
									          JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
									              null, options, options[0]);
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
								System.out.print(resposta);
							
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
