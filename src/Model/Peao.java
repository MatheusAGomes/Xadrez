package Model;

import java.awt.Color;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import View.Quadrado;
import View.TabuleiroVisualizacao;

public class Peao extends Peca{
	

	public Peao(int linha, int coluna,Boolean cor) {
			super(linha,coluna,cor);
			if(cor == false)
			{
			this.imagem = "/View/Imagens/PeaoPreto.png";
			}
			else
			{
			this.imagem = "/View/Imagens/PeaoBranco.png";
			}
			this.id = 1;
			this.quantidadedemovimento = 0;
			
	}


	public String getImagem() {
		return imagem;
	}


	@Override
	public Boolean mostrarquadrado(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado){
		
		
		
		if(this.quantidadedemovimento == 0)
		{
			if(selecionada.branco == true) {
				if(selecionada.getColuna() == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
					return true;
				}
				if(selecionada.getColuna()  == colunadoquadradoverificado && selecionada.getLinha()  - 2   == linhadoquadradoverificado) {
					return true;
				}
			}
				else
				{
					if(selecionada.getColuna() == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado) {
						return true;
					}
					if(selecionada.getColuna()  == colunadoquadradoverificado && selecionada.getLinha()  + 2   == linhadoquadradoverificado) {
						return true;
					}
				}
			
		}
		else
		{
			if(selecionada.branco == true) {
				if(selecionada.getColuna() == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado) {
					return true;
				}
				
			}
				else
				{
					if(selecionada.getColuna() == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado) {
						return true;
					}
					
				}
			
		}
			return false;
		
	}
	@Override
	public Boolean MostrarComida(Peca selecionada, int linhadoquadradoverificado, int colunadoquadradoverificado) {
		
		
		if(selecionada.branco == true) {
			if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado && this.tab.peca[selecionada.getLinha() - 1][selecionada.getColuna() - 1] != null)  {
				return true;
			}
			if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha()  - 1  == linhadoquadradoverificado && this.tab.peca[selecionada.getLinha() - 1][selecionada.getColuna() + 1] != null)  {
				return true;
			}
		}
			else
			{
				if(selecionada.getColuna() - 1 == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado && this.tab.peca[selecionada.getLinha() + 1][selecionada.getColuna() - 1] != null)  {
				return true;
				}
				if(selecionada.getColuna() + 1 == colunadoquadradoverificado && selecionada.getLinha()  + 1  == linhadoquadradoverificado && this.tab.peca[selecionada.getLinha() + 1][selecionada.getColuna() + 1] != null)  {
				return true;
				}
			}
				
			return false;
		}



	@Override
	public void EscreverMovimento(int numerodejogadas,int linhaanterior,int colunaanterior) {
		// TODO Auto-generated method stub
		
		String text = numerodejogadas+"."+" "+linhaanterior+colunaanterior+this.linha+this.coluna+"\n";
		System.out.print(text);
		Arquivo.Write("ListaDeJogadas.txt",text);
		
		
	}
	
	@Override
	public void resetarreiafogado() {
		
	}


	


	
	
	
	
}
