package Model;

import View.TabuleiroVisualizacao;

public class Cavalo extends Peca{
	
	String imagem;

	public Cavalo(int linha, int coluna,Boolean cor) {
			super(linha, coluna,cor);
			this.branco = cor;
			if(cor = false)
			{
			this.imagem = "C(Preta)";
			}
			else
			{
			this.imagem = "C(Branca)";
			}
			this.id = 4;
	}
	public String getImagem() {
		return imagem;
	}
	@Override
	public Boolean mostrarquadrado(int linha,int coluna,Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		// TODO Auto-generated method stub
		return null;
	}

}
