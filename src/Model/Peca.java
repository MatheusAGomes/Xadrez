package Model;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class Peca extends JButton{
	
	public int id;
	public Boolean branco;
	public String imagem;
	public Boolean eliminado;
	public Boolean selecionada; 
	public int linha;
	public int coluna;
	public Tabuleiro tab;


	



	
	public Peca(int linha, int coluna,Boolean branco) {
		this.linha = linha;
		this.coluna = coluna;
		this.branco = branco;
		this.selecionada = false;
					
	}
	
	public Tabuleiro getTab() {
		return tab;
	}

	public void setTab(Tabuleiro tab) {
		this.tab = tab;
	}


	public String getImagem() {
		return imagem;
	}


	public int getLinha() {
		return linha;
	}

	private void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	private void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public Boolean getEliminado() {
		return eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}
	
	public void setOpostoofselecionada(){
		if(this.selecionada == true) {
		this.selecionada = false;}
		else
		{
			this.selecionada = true; 
		}
		
		
	}
	

}
