package Model;

import java.awt.Color;

import javax.swing.JPanel;

public class Quadrado extends JPanel {
	
	private int largura;
	private int altura;
	private boolean ocupado = false;

	public Quadrado(Color cor, int largura, int altura) {
		// TODO Auto-generated constructor stub
		this.setBackground(cor);
		this.altura = altura;
		this.largura = largura;
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

	private boolean isOcupado() {
		return ocupado;
	}

	private void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

}
