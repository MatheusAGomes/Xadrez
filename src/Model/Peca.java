package Model;

public abstract class Peca {
	
	private String cor;
	private String imagem;
	private Boolean estado = false;
	private Boolean selecionada =  false;
	private int linha;
	private int coluna;

	public Peca(String imagem, int linha, int coluna,String cor) {
		this.imagem = imagem;
		this.linha = linha;
		this.coluna = coluna;
		this.cor = cor;
	}

	private String getCor() {
		return cor;
	}

	private void setCor(String cor) {
		this.cor = cor;
	}

	private String getImagem() {
		return imagem;
	}

	private void setImagem(String imagem) {
		this.imagem = imagem;
	}

	private Boolean getEstado() {
		return estado;
	}

	private void setEstado(Boolean estado) {
		this.estado = estado;
	}

	private Boolean getSelecionada() {
		return selecionada;
	}

	private void setSelecionada(Boolean selecionada) {
		this.selecionada = selecionada;
	}

	private int getLinha() {
		return linha;
	}

	private void setLinha(int linha) {
		this.linha = linha;
	}

	private int getColuna() {
		return coluna;
	}

	private void setColuna(int coluna) {
		this.coluna = coluna;
	}
	

}
