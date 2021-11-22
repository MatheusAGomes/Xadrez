package Model;

import java.awt.Color;

import View.Quadrado;
import View.TabuleiroVisualizacao;

public class Peao extends Peca{
	String imagem;

	public Peao(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor = false)
			{
			this.imagem = "P(Preta)";
			}
			else
			{
			this.imagem = "P(Branca)";
			}
			this.id = 1;
			
	}


	public String getImagem() {
		return imagem;
	}


	@Override
	public Boolean mostrarquadrado(int linha,int coluna,Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		
		if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
			return true;
		}
		return false;
	}
	
	
}
