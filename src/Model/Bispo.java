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
		
		
			
			for(int j = selecionada.getColuna(),i = selecionada.getLinha();j>=0 && i>=0;i--,j--) {
				
				if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
				{
					return true;
				}
				
			}
			
			for(int j = selecionada.getColuna(),i = selecionada.getLinha();(j>=0 && i>=0);i--,j++) {
				
				if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
				{
					return true;
				}
				
			}
			for(int j = selecionada.getColuna(),i = selecionada.getLinha();(j<8 && i<8);i++,j++) {
				
				if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
				{
					return true;
				}
				
			}
			for(int j = selecionada.getColuna(),i = selecionada.getLinha();(j<8 && i<8);i++,j--) {
				
				if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
				{
					return true;
				}
				
			}

			
			
			
		
		
		
		return false;
	}
	

}
