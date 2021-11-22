package View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;


public class Quadrado extends JPanel {

	public PecaVisualizada peca;
	public int linha;
	public int coluna;


	public Quadrado(int linha,int coluna) {

		this.linha = linha;
		this.coluna = coluna;
		
	}
	
	public Quadrado(PecaVisualizada peca)
	{
		this.peca = peca;
		this.linha = peca.getPeca().linha;
		this.coluna = peca.getPeca().coluna;
		this.add(peca);
		if(peca.getPeca() != null && peca.getPeca().selecionada == true)
		{
			this.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		}
		this.revalidate();
		this.repaint();
		
	}

	public PecaVisualizada getPeca() {
		return peca;
	}
	
	
	
	
	
	
	





}
