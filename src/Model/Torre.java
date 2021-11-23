package Model;

import java.awt.Image;

import View.TabuleiroVisualizacao;

public class Torre extends Peca{
	

	public Torre(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor == false)
			{
			this.imagem = "Torre(P)";
			}
			else
			{
			this.imagem = "Torre(B)";
			}
			this.id = 2;
	}
	public String getImagem() {
		return imagem;
	}
	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		if(selecionada.getColuna() == colunadoquadradoverificado ) {
			return true;
		}
		if(selecionada.getLinha()    == linhadoquadradoverificado) {
			return true;
		}
		return false;
	}

}
