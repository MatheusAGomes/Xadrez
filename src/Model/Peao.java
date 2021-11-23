package Model;

import java.awt.Color;

import View.Quadrado;
import View.TabuleiroVisualizacao;

public class Peao extends Peca{
	

	public Peao(int linha, int coluna,Boolean cor) {
			super(linha,coluna,cor);
			if(cor == false)
			{
			this.imagem = "Peao(P)";
			}
			else
			{
			this.imagem = "Peao(B)";
			}
			this.id = 1;
			
	}


	public String getImagem() {
		return imagem;
	}


	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		
		if(selecionada.branco == true) {
			if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
				return true;
			}
			if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
				return true;
			}
		}
			else
			{
				if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado) {
					return true;
				}
				if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado) {
					return true;
				}
			}
			return false;
	}
	
	
}
