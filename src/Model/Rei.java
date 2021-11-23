package Model;

import java.awt.Image;

import View.TabuleiroVisualizacao;

public class Rei extends Peca{
	

	public Rei(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor == false)
			{
			this.imagem = "Rei(P)";
			}
			else
			{
			this.imagem = "Rei(B)";
			}
			this.id = 5;
	}
	public String getImagem() {
		return imagem;
	}
	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		// TODO Auto-generated method stub
		
		return false;
	}
	

}
