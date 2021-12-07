package Model;

import java.awt.Image;

import View.TabuleiroVisualizacao;

public class Rei extends Peca{
			 public boolean p1;
			 public boolean p2;
			 public boolean p3;
			 public boolean p4;
			 public boolean p5;
		
			public boolean p6;
			 public boolean p7;
			 public boolean p8;
			
	

	public Rei(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			this.Check = false;
			if(cor == false)
			{
			this.imagem = "/View/Imagens/ReiPreto.png";
			}
			else
			{
			this.imagem = "/View/Imagens/ReiBranco.png";
			}
			this.id = 5;
			this.quantidadedemovimento = 0;
			 this.p1 = false;
			 this.p2 = false;
			 this.p3 = false;
			 this.p4 = false;
			 this.p5 = false;
			 this.p6 = false;
			 this.p7 = false;
			 this.p8 = false;
	}
	
	@Override
	public void resetarreiafogado() {
		 this.p1 = false;
		 this.p2 = false;
		 this.p3 = false;
		 this.p4 = false;
		 this.p5 = false;
		 this.p6 = false;
		 this.p7 = false;
		 this.p8 = false;
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
		//System.out.print(text);
		Arquivo.Write("ListaDeJogadas.txt",text);
		
		
	}
	@Override
	 public void setP1(boolean p1) {
			this.p1 = p1;
		}
	
	@Override
		public void setP2(boolean p2) {
			this.p2 = p2;
		}
	@Override
		public void setP3(boolean p3) {
			this.p3 = p3;
		}
	@Override
		public void setP4(boolean p4) {
			this.p4 = p4;
		}
	@Override
		public void setP5(boolean p5) {
			this.p5 = p5;
		}
	@Override
		public void setP6(boolean p6) {
			this.p6 = p6;
		}
	@Override
		public void setP7(boolean p7) {
			this.p7 = p7;
		}
	@Override
		public void setP8(boolean p8) {
			this.p8 = p8;
		}
	
	@Override
	public boolean Vempate() {
		
		


		if(this.p1 == true && this.p2 == true && this.p3== true && this.p4== true && this.p5== true && this.p6== true && this.p7== true && this.p8 == true)
		{
			return true;
		}
		return false;
	}
	
	
	
	
	
	}


