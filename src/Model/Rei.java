package Model;

import java.awt.Image;

import View.TabuleiroVisualizacao;

public class Rei extends Peca{
			public boolean mov1;
			public boolean mov2;
			public boolean mov3;
			public boolean mov4;
			public boolean mov5;
			public boolean mov6;
			public boolean mov7;
			public boolean mov8;
	

	public Rei(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			this.Check = false;
			if(cor == false)
			{
			this.imagem = "Rei(P)";
			}
			else
			{
			this.imagem = "Rei(B)";
			}
			this.id = 5;
			this.quantidadedemovimento = 0;
	}
	public String getImagem() {
		return imagem;
	}
	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		// TODO Auto-generated method stub
		
		if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha() == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha() == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() == colunadoquadradoverificado && selecionada.getLinha() + 1 == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() == colunadoquadradoverificado && selecionada.getLinha() - 1 == linhadoquadradoverificado) {
			return true;
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
		
		String text = numerodejogadas+"."+"R"+linhaanterior+colunaanterior+this.linha+this.coluna+"\n";
		System.out.print(text);
		Arquivo.Write("ListaDeJogadas.txt",text);
		
		
	}
	

}
