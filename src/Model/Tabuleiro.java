package Model;

import java.awt.Color;

import javax.swing.border.BevelBorder;

public class Tabuleiro {
	
	private Peca[][] peca;
	private Peca selecionada = null;
	public Boolean vezdobranco = true;
	
	public Tabuleiro()
	{
		this.peca = new Peca[8][8];
			//posicionando pecas
		//peoes
		//brancos
		Peao peao1B = new Peao(6,0,true);
		this.addnotab(peao1B);
		Peao peao2B = new Peao(6,1,true);
		this.addnotab(peao2B);
		Peao peao3B = new Peao(6,2,true);
		this.addnotab(peao3B);
		Peao peao4B = new Peao(6,3,true);
		this.addnotab(peao4B);
		Peao peao5B = new Peao(6,4,true);
		this.addnotab(peao5B);
		Peao peao6B = new Peao(6,5,true);
		this.addnotab(peao6B);
		Peao peao7B = new Peao(6,6,true);
		this.addnotab(peao7B);
		Peao peao8B = new Peao(6,7,true);
		this.addnotab(peao8B);
		//Pretos
		Peao peao1P = new Peao(1,0,false);
		this.addnotab(peao1P);
		Peao peao2P = new Peao(1,1,false);
		this.addnotab(peao2P);
		Peao peao3P = new Peao(1,2,false);
		this.addnotab(peao3P);
		Peao peao4P = new Peao(1,3,false);
		this.addnotab(peao4P);
		Peao peao5P = new Peao(1,4,false);
		this.addnotab(peao5P);
		Peao peao6P = new Peao(1,5,false);
		this.addnotab(peao6P);
		Peao peao7P = new Peao(1,6,false);
		this.addnotab(peao7P);
		Peao peao8P = new Peao(1,7,false);
		this.addnotab(peao8P);
		
		//Torres
		//Brancas
		Torre Torre1B = new Torre(7,0,true);this.addnotab(Torre1B);
		Torre Torre2B = new Torre(7,7,true);this.addnotab(Torre2B);
		//Preta
		Torre Torre1P = new Torre(0,0,false);this.addnotab(Torre1P);
		Torre Torre2P = new Torre(0,7,false);this.addnotab(Torre2P);
		
		// Cavalos
		// Brancos
		Cavalo Cabalo1B = new Cavalo(7,1,true);this.addnotab(Cabalo1B);
		Cavalo Cabalo2B = new Cavalo(7,6,true);this.addnotab(Cabalo2B);
		// Preto
		Cavalo Cabalo1P = new Cavalo(0,1,false);this.addnotab(Cabalo1P);
		Cavalo Cabalo2P = new Cavalo(0,6,false);this.addnotab(Cabalo2P);
		
		//Bispo
		//Branco
		Bispo Bispo1B = new Bispo(7,2,true);this.addnotab(Bispo1B);
		Bispo Bispo2B = new Bispo(7,5,true);this.addnotab(Bispo2B);
		//Preto
		Bispo Bispo1P = new Bispo(0,2,false);this.addnotab(Bispo1P);
		Bispo Bispo2P = new Bispo(0,5,false);this.addnotab(Bispo2P);
		
		//Dama
		Dama DamaB= new Dama(7,3,true);this.addnotab(DamaB);
		Dama DamaP = new Dama(0,3,false);this.addnotab(DamaP);
		//Rei
		Rei ReiB = new Rei(7,4,true);this.addnotab(ReiB);
		Rei ReiP = new Rei(0,4,true);this.addnotab(ReiP);
		
		
	}
	
	public Peca getPeca(int linha, int coluna)
	{
		return this.peca[linha][coluna];
	}
	public void addnotab(Peca peca)
	{
		this.peca[peca.linha][peca.coluna] = peca;
		peca.setTab(this);
	}

	
	public void trocarAvez() {
		
		if(vezdobranco = true)
		{
			this.vezdobranco = false;
		}
		else
		{
			this.vezdobranco = true;
		}
		
	}

	public void jogar(int linha, int coluna) {
		
		Peca peca = this.getPeca(linha, coluna); 
		
		if(peca != null)
		{
			this.selecionada = peca;
		}
		
	}

}
