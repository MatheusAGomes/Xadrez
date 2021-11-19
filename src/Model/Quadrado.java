package Model;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import View.Tabuleiro;

public class Quadrado extends JPanel {
	
	private int largura;
	private int altura;
	private boolean ocupado = false;
	private JLabel labeldaimagem;

	
	public Quadrado(Color cor, int largura, int altura) {
		// TODO Auto-generated constructor stub
		this.setBackground(cor);
		this.altura = altura;
		this.largura = largura;
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		
	}
	
	

	public void setImagem(String imagem) {
	
		labeldaimagem = new JLabel(imagem);
		labeldaimagem.setForeground(Color.CYAN);
		this.add(labeldaimagem);
	}


	public int getLargura() {
		return largura;
	}

	private void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	private void setAltura(int altura) {
		this.altura = altura;
	}


	public void OcuparQuadrado() {
		this.ocupado = true;
	}
	public void DesocuparQuadrado() {
		this.ocupado = false;
	}
	

}
