package Model;

import java.awt.Image;

import View.TabuleiroVisualizacao;

public class Rei extends Peca{
		
	

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
	public void EscreverMovimento(int numerodejogadas) {
		// TODO Auto-generated method stub
		
		String text = numerodejogadas+"."+"R"+this.linha+this.coluna+"\n";
		System.out.print(text);
		Arquivo.Write("ListaDeJogadas.txt",text);
		
		
	}
	

}
