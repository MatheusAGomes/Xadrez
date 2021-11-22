package Model;

import View.TabuleiroVisualizacao;

public class Rei extends Peca{
	String imagem;

	public Rei(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor = false)
			{
			this.imagem = "R(Preta)";
			}
			else
			{
			this.imagem = "R(Branca)";
			}
			this.id = 5;
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
