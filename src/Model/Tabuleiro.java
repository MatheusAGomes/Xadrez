package Model;

import java.awt.Color;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;

import View.Jogo;
import View.TelaDeInicio;

public class Tabuleiro {
	
	public Peca[][] peca;
	public Peca selecionada = null;
	public Boolean vezdobranco;
	public Jogo jogo;
	
	
	public Tabuleiro(Jogo jogo)
	{
	
		this.vezdobranco = true;
		this.peca = new Peca[8][8];
		this.jogo = jogo;
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
		Rei ReiP = new Rei(0,4,false);this.addnotab(ReiP);
		
		
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

	
	public void trocarAvez(Boolean var) {
		
		
			this.vezdobranco = !var;
		
		
		
	}

	public void jogar(int linha, int coluna) {
		
		Peca peca = this.getPeca(linha, coluna); 
		if(this.selecionada == null) {
			//caso nao exista nenhuma peca selecionada
					if(peca.branco == true && vezdobranco == true && peca!= null) {
						//seleciona
						this.selecionada = peca;
						peca.setOpostoofselecionada();
						
					}
					else {
						if(peca.branco == false && vezdobranco == false && peca!= null) {
							this.selecionada = peca;
							peca.setOpostoofselecionada();
						}
		}
		}else
			{
			// caso ja exista peca selecionada e a posicao que estao selecionando seja a da peca selecionada
			if(this.selecionada == peca) {
				//entao retira a selecao da peca
			this.selecionada.selecionada = false;
			this.selecionada = null;
		
			
			}
			else {
				if(peca == null)
				{
					
					//caso haja uma peca selecionada e o click é em uma posicao sem peca ou peca adversaria ocorre o movimento(retira a peca da casa e coloca em outra)
					if(this.selecionada.mostrarquadrado(this.selecionada,linha,coluna)) {
					
					int antigalinha = this.selecionada.linha;
					int antigaColuna = this.selecionada.coluna;
					if(selecionada.id == 1)
					{
						if(selecionada.branco == true)
						{
							this.jogo.tab.jogadasdoBranco = 0;	
						}
						else
						{
							this.jogo.tab.jogadasdoPreto = 0;
						}
						
						
					}
						if(selecionada.branco == true)
						{
							this.jogo.tab.jogadasdoBranco = this.jogo.tab.jogadasdoBranco + 1;
							this.jogo.tab.quantidadedejogadas = this.jogo.tab.quantidadedejogadas + 1;
						}
						else
						{
							this.jogo.tab.jogadasdoPreto = this.jogo.tab.jogadasdoPreto + 1;
							this.jogo.tab.quantidadedejogadas = this.jogo.tab.quantidadedejogadas + 1;
						}
										this.selecionada.mover(linha, coluna);
					this.selecionada.quantidadedemovimento = this.selecionada.quantidadedemovimento + 1;
					this.addnotab(this.selecionada);
					this.selecionada.EscreverMovimento(this.jogo.tab.quantidadedejogadas);
					this.peca[antigalinha][antigaColuna] = null;
					this.selecionada.selecionada = false;
					this.selecionada = null;
					
					//trocar a vez
					this.trocarAvez(this.vezdobranco);
					this.jogo.trocarvez(vezdobranco);
					//VERIFICACAO DE EMPATE E XEQUE
					this.Verificar_Xeque();
					this.Validar_Empate_Por_Peca();
					
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Voce nao pode fazer este movimento");
					}
					
				}
				else
				{
					if(!peca.branco.equals(this.selecionada.branco)) {
						if(this.selecionada.MostrarComida(this.selecionada,linha,coluna)) {
							int antigalinha = this.selecionada.linha;
							int antigaColuna = this.selecionada.coluna;
							this.selecionada.mover(linha, coluna);
							this.addnotab(this.selecionada);
							this.peca[antigalinha][antigaColuna] = null;
							this.selecionada.selecionada = false;
							this.selecionada = null;
							//trocar a vez
							this.trocarAvez(this.vezdobranco);
							this.jogo.trocarvez(vezdobranco);
							
							//eliminacao da peca
							
							this.ValidarVitoria(peca.id);
							
							if(!this.vezdobranco)
							{
								
								
								this.jogo.QuantidadeDePecasEliminadasBrancas = this.jogo.QuantidadeDePecasEliminadasBrancas + 1;
							}
							else
							{
								
								this.jogo.QuantidadeDePecasEliminadasPretas = this.jogo.QuantidadeDePecasEliminadasPretas + 1;
							}
						
							this.Validar_Empate_Por_Peca();
							
							
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Voce nao pode fazer este movimento");
							}
					}
					else {
					JOptionPane.showMessageDialog(null, "Voce nao pode fazer este movimento");
					}
				}
				
				}
			}
		
	}
	
	
	public void ValidarVitoria(int id){
		
		if(id == 5)
		{
			
				this.jogo.tab.finalizado = true;
				
			
		}
			
			
		
	}
	
	public void Verificar_Xeque()
	{
		for(int i = 0; i <8; i++)
		{
			for(int j = 0; j <8; j++)
			{
				try {
					if(this.peca[i][j].id != 5 && this.peca[i][j].branco == false) {
						//fazer 8 verificacoes por rei
						if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiBranco().linha,this.acharReiBranco().coluna))
						{
							
							this.acharReiBranco().Check = true;
						
						
						}
						else
						{
							this.acharReiBranco().Check = false;
						}
					}
						
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}
	}
	
	public void Validar_Empate_Por_Peca()
	{
		
		
		if(this.jogo.QuantidadeDePecasEliminadasPretas == 15 && this.jogo.QuantidadeDePecasEliminadasBrancas == 15){
			this.jogo.tab.empatado = true;
		}
		
		
	}
	
	public Peca acharReiBranco()
	{
		for(int i = 0; i <8; i++)
		{
			for(int j = 0; j <8; j++)
			{
				try {
					if(this.peca[i][j].id == 5 && this.peca[i][j].branco == true) {
						return this.peca[i][j];
						}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}
			
		
		return null;
		
	}
	public Peca acharReiPreto()
	{
		for(int i = 0; i <8; i++)
		{
			for(int j = 0; j <8; j++)
			{
				try {
					if(this.peca[i][j].id == 5 && this.peca[i][j].branco == false) {
						return this.peca[i][j];
						}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}
			
		
		return null;
		
	}
	
	

	private void mover(Peca selecionada2, int linha, int coluna) {
		selecionada2.mover(linha, coluna);
		
	}

}
