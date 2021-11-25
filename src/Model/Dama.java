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
			this.quantidadedemovimento = 0;
	}
	public String getImagem() {
		return imagem;
	}
	
	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		// TODO Auto-generated method stub
		
		
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
		if(selecionada.getColuna() == colunadoquadradoverificado) {
			return true;
		}
		if(selecionada.getLinha() == linhadoquadradoverificado) {
			return true;
		}
		
		return false;
	}
	@Override
	public Boolean MostrarComida(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado) {
		return this.mostrarquadrado(selecionada, linhadoquadradoverificado, colunadoquadradoverificado);
	}

}
