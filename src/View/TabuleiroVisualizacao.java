package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.JPanel;

import Model.Peca;
import Model.Tabuleiro;

public class TabuleiroVisualizacao extends JPanel implements MouseListener {

	private Tabuleiro tabuleiro;
	
	
	
	public TabuleiroVisualizacao(Tabuleiro tabuleiro)
	{
		this.tabuleiro = tabuleiro;
		this.criarTab();
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
					quadrado = new Quadrado(i,j);
				}
				else
				{
					quadrado = new Quadrado(new PecaVisualizada(peca));
					
				}
				if((i+j)%2 == 0)
				{
					
					quadrado.setBackground(Color.WHITE);
					quadrado.setBounds(i*50,j*50,50,50);
				}
				else
				{
					quadrado.setBackground(Color.BLACK);
					quadrado.setBounds(i*50,j*50,50,50);

				}
				//adicionando o quadrado ao tabuleiro
				this.add(quadrado);
				quadrado.addMouseListener(this);
				
			}
			this.revalidate();
			this.repaint();
		}
		
		
		
	}
	public Tabuleiro getTab(){
		return this.tabuleiro;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Quadrado quadrado = (Quadrado) e.getSource();
		System.out.print(quadrado.getPeca().getPeca().selecionada);
		this.tabuleiro.jogar(quadrado.linha,quadrado.coluna);
		this.criarTab();
		
		
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
