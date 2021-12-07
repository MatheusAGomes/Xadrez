package Model;

import java.awt.Image;

import View.TabuleiroVisualizacao;

public class Cavalo extends Peca{
	


	public Cavalo(int linha, int coluna,Boolean cor) {
			super(linha, coluna,cor);
			this.branco = cor;
			if(cor == false)
			{
			this.imagem = "/View/Imagens/CavaloPreto.png";
			}
			else
			{
			this.imagem = "/View/Imagens/CavaloBranco.png";
			}
			this.id = 4;
			this.quantidadedemovimento = 0;
	}
	public String getImagem() {
		return imagem;
	}
	
	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		
		
		if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha()  + 2   == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha()  + 2   == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() - 2 == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() + 2 == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado) {
			return true;
		}
		
		
		
		
		if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha()  - 2   == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha()  - 2   == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() - 2 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
			return true;
		}
		if(selecionada.getColuna() + 2 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
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
		
		String text = numerodejogadas+"."+"C"+linhaanterior+colunaanterior+this.linha+this.coluna+"\n";
		System.out.print(text);
		Arquivo.Write("ListaDeJogadas.txt",text);
		
		
	}
	@Override
	public void resetarreiafogado() {
	}
	

}
