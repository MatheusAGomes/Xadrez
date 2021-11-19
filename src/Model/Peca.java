package Model;

import javax.swing.ImageIcon;

public abstract class Peca {
	
	private String cor;
	private String imagem;
	private Boolean eliminado = false;
	private Boolean selecionada =  false;
	private int linha;
	private int coluna;

	public Peca(int linha, int coluna,String cor) {
		this.linha = linha;
		this.coluna = coluna;
		this.cor = cor;
				
	}



	public String getImagem() {
		return imagem;
	}

	private Boolean getSelecionada() {
		return selecionada;
	}

	private void setSelecionada(Boolean selecionada) {
		this.selecionada = selecionada;
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
	

}
