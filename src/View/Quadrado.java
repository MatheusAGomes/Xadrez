package View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import Model.Peca;


public class Quadrado extends JPanel {

	public PecaVisualizada peca;
	public int linha;
	public int coluna;
	


	public Quadrado(int linha,int coluna,Peca selecionada) {

		this.linha = linha;
		this.coluna = coluna;
		
		try {
			if(selecionada.mostrarquadrado(selecionada,this.linha,this.coluna))
			{
				
				this.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	public Quadrado(PecaVisualizada peca)
	{
		this.peca = peca;
		this.linha = peca.getPeca().linha;
		this.coluna = peca.getPeca().coluna;
		this.add(peca);
		
		try {
		if((peca.getPeca() != null && peca.getPeca().selecionada == true))
		{
			this.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		}
		if(peca.getPeca().tab.selecionada.mostrarquadrado(peca.getPeca().tab.selecionada,this.linha,this.coluna) && peca.getPeca().branco != peca.getPeca().tab.selecionada.branco)
		{
			this.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		this.revalidate();
		this.repaint();
		
	}

	public PecaVisualizada getPeca() {
		return peca;
	}
	
	
	
	
	
	
	
	





}
