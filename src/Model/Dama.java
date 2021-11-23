package Model;

import java.awt.Image;

import View.TabuleiroVisualizacao;

public class Dama extends Peca{


	
	public Dama( int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor == false)
			{
			this.imagem = "Dama(P)";
			}
			else
			{
			this.imagem = "Dama(B)";
			}
			this.id = 4;
	}
	public String getImagem() {
		return imagem;
	}
	
	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		// TODO Auto-generated method stub
		return null;
	}

}
