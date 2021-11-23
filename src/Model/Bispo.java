package Model;

import java.awt.Image;

import View.TabuleiroVisualizacao;

public class Bispo extends Peca{

	
	
	public Bispo(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor == false)
			{
			this.imagem = "Bispo(P)";
			}
			else
			{
			this.imagem = "Bispo(B)";
			}
			this.id = 3;
	}
	public String getImagem() {
		return imagem;
	}
	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		for (int i = selecionada.getLinha(); i < 8;) {
			for(int j = selecionada.getColuna();j<8;) {
				if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
				{
					return true;
				}
				
				i++;
				j++;
			}
			
			
		}
		
		for (int i = selecionada.getLinha(); i >= 0;) {
			for(int j = selecionada.getColuna();j<8;) {
				if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
				{
					return true;
				}
				
				i--;
				j++;
			}
			
			
		}
		
		
		return false;
	}
	

}
