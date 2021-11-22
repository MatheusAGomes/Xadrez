package Model;

import View.TabuleiroVisualizacao;

public class Dama extends Peca{

		String imagem;
	
	public Dama( int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor = false)
			{
			this.imagem = "D(Preta)";
			}
			else
			{
			this.imagem = "D(Branca)";
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
