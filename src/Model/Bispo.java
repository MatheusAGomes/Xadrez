package Model;

import java.awt.Image;

import View.TabuleiroVisualizacao;

public class Bispo extends Peca{

	
	
	public Bispo(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor == false)
			{
			this.imagem = "/View/Imagens/BispoPreto.png";
			}
			else
			{
			this.imagem = "/View/Imagens/BispoBranco.png";
			}
			this.id = 3;
			this.quantidadedemovimento = 0;
	}
	public String getImagem() {
		return imagem;
	}
	
	
	
	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		
		
			
			for(int j = selecionada.getColuna() - 1,i = selecionada.getLinha() - 1;(j<8 && j>=0&&i<8 && i>=0);i--,j--) {
				if(this.tab.getPeca(i, j) == null || this.tab.getPeca(i, j).branco == !this.branco) {
					if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
					{
						return true;
					}
				}
				else {
					break;
				}
				
			}
			
			for(int j = selecionada.getColuna() + 1,i = selecionada.getLinha() - 1;(j<8 && j>=0&&i<8 && i>=0);i--,j++) {
				if(this.tab.getPeca(i, j) == null || this.tab.getPeca(i, j).branco == !this.branco) {
					if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
					{
						return true;
					}
				}
				else {
					break;
				}
			}
			for(int j = selecionada.getColuna() + 1,i = selecionada.getLinha() + 1;(j<8 && j>=0&&i<8 && i>=0);i++,j++) {
				if(this.tab.getPeca(i, j) == null || this.tab.getPeca(i, j).branco == !this.branco) {
					if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
					{
						return true;
					}
				}
				else {
					break;
				}
				
			}
			for(int j = selecionada.getColuna() - 1,i = selecionada.getLinha() + 1;(j<8 && j>=0&&i<8 && i>=0);i++,j--) {
				
				if(this.tab.getPeca(i, j) == null || this.tab.getPeca(i, j).branco == !this.branco) {
					if(i == linhadoquadradoverificado && j == colunadoquadradoverificado)
					{
						return true;
					}
				}
				else {
					break;
				}
				}
			

			
			
			
		
		
		
		return false;
	}
	@Override
	public Boolean MostrarComida(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado) {
		return this.mostrarquadrado(selecionada, linhadoquadradoverificado, colunadoquadradoverificado);
	}
	@Override
	public void EscreverMovimento(int numerodejogadas, int linhaanterior,int colunaanterior) {
		// TODO Auto-generated method stub
		
		String text = numerodejogadas+"."+"B"+linhaanterior+colunaanterior+this.linha+this.coluna+"\n";
		System.out.print(text);
		Arquivo.Write("ListaDeJogadas.txt",text);
		
		
	}

	

}
