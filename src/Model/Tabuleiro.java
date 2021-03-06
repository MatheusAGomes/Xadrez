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
	
	public Tabuleiro()
	{
		this.vezdobranco = true;
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
	
	public void reproduzirjogada(int i)
	{

		Arquivo leituradoArquivo = new Arquivo();
		char[] vetor = leituradoArquivo.Read(i);
		
		if(vetor != null) {
		int tamanhodochar = vetor.length;
		int linhaanterior = Integer.parseInt(String.valueOf(vetor[tamanhodochar - 4]));
		int colunaanterior = Integer.parseInt(String.valueOf(vetor[tamanhodochar - 3]));
		int proximalinha = Integer.parseInt(String.valueOf(vetor[tamanhodochar - 2]));
		int proximacoluna = Integer.parseInt(String.valueOf(vetor[tamanhodochar - 1]));
		this.selecionada = getPeca(linhaanterior, colunaanterior);
		this.selecionada.mover(proximalinha, proximacoluna);
		this.addnotab(this.selecionada);
		this.peca[linhaanterior][colunaanterior] = null;
		this.selecionada = null;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Jogo finalizado");
		}
		
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
				try {
				if(peca == null && this.jogo.tab.finalizado == false)
				{
					
					//caso haja uma peca selecionada e o click ? em uma posicao sem peca ou peca adversaria ocorre o movimento(retira a peca da casa e coloca em outra)
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
						}
						else
						{
							this.jogo.tab.jogadasdoPreto = this.jogo.tab.jogadasdoPreto + 1;
						}
					this.selecionada.mover(linha, coluna);
					this.selecionada.quantidadedemovimento = this.selecionada.quantidadedemovimento + 1;
					this.addnotab(this.selecionada);
					this.selecionada.EscreverMovimento(this.jogo.tab.quantidadedejogadas,antigalinha,antigaColuna);
					this.jogo.tab.quantidadedejogadas = this.jogo.tab.quantidadedejogadas + 1;
					this.peca[antigalinha][antigaColuna] = null;
					this.selecionada.selecionada = false;
					this.selecionada = null;
					this.jogo.tab.criarTab();
					//trocar a vez
					this.trocarAvez(this.vezdobranco);
					this.jogo.trocarvez(vezdobranco);
					//VERIFICACAO DE EMPATE E XEQUE
					
						this.Verificar_Xeque();
						this.Validar_Empate_Por_Peca();
						this.ValidarEmpatePorAfogamento();
						

					
					
					
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
							this.selecionada.EscreverMovimento(this.jogo.tab.quantidadedejogadas,antigalinha,antigaColuna);
							this.jogo.tab.quantidadedejogadas = this.jogo.tab.quantidadedejogadas + 1;
							this.peca[antigalinha][antigaColuna] = null;
							this.selecionada.selecionada = false;
							this.selecionada = null;
							//trocar a vez
							this.trocarAvez(this.vezdobranco);
							this.jogo.trocarvez(vezdobranco);
							
							
							//eliminacao da peca
							this.jogo.tab.criarTab();
							System.out.print(peca.id);
							this.ValidarVitoria(peca.id,this.vezdobranco);
							
							
							
							if(!this.vezdobranco)
							{
								
								
								this.jogo.QuantidadeDePecasEliminadasBrancas = this.jogo.QuantidadeDePecasEliminadasBrancas + 1;
							}
							else
							{
								
								this.jogo.QuantidadeDePecasEliminadasPretas = this.jogo.QuantidadeDePecasEliminadasPretas + 1;
							}
							
							//validar empates
							
							this.ValidarEmpatePorAfogamento();
						
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
			}catch (Exception e) {
				// TODO: handle exception
			}
				this.jogo.tab.criarTab();
				}
			}
		
	}
	
	
	public void ValidarVitoria(int id,boolean vez){
		
		if(id == 5)
		{
			
				this.jogo.tab.finalizado = true;
				System.out.print(this.jogo.tab.finalizado);
				
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
	
	
	public void ValidarEmpatePorAfogamento()
	{
		
		Arquivo escritaderesultado = new Arquivo();
		int contadordepossibilidadesB=0;
		int contadordepossibilidadesP=0;
		
		try {
		acharReiBranco().resetarreiafogado();
		acharReiPreto().resetarreiafogado();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
				// Rei Branco	
			for(int i = 0; i <8; i++)
			{
				
				for(int j = 0; j <8; j++)
				{
					if(this.verificarRei(true) == true) {
					try {
						//validacao ocorre dps da troca da vez
						
						if(this.peca[i][j].id != 5 && this.peca[i][j].branco == false && this.acharReiBranco().Check == false && this.vezdobranco == true){
							//fazer 8 verificacoes por rei
							
							
							if(this.acharReiBranco().linha + 1 <= 7) {
							
								if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiBranco().linha + 1,this.acharReiBranco().coluna))	
								{
								//	System.out.println("1");
									
									acharReiBranco().setP7(true);
									
									
								}
							}
							if(this.acharReiBranco().linha + 1 <= 7 && this.acharReiBranco().coluna - 1 >=0) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiBranco().linha + 1,this.acharReiBranco().coluna - 1))
							{
								// + -
							//	System.out.println("2");

								acharReiBranco().setP6(true);

							}
							}
							if(this.acharReiBranco().linha + 1 <= 7 && this.acharReiBranco().coluna + 1 <= 7 ) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiBranco().linha + 1,this.acharReiBranco().coluna + 1))
							{
								// + +
								//System.out.println("3");

								acharReiBranco().setP8(true);


							}
							}

							
							if(this.acharReiBranco().coluna - 1 >=0) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiBranco().linha,this.acharReiBranco().coluna - 1))
							{
								// = - 
							//	System.out.println("4");

								acharReiBranco().setP4(true);


							}
							}
							if(this.acharReiBranco().coluna + 1 <= 7) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiBranco().linha,this.acharReiBranco().coluna + 1))
							{
								// = +
								//System.out.println("5");

								acharReiBranco().setP5(true);


							}
							}
							
							//
							if(this.acharReiBranco().linha - 1 >=0 && this.acharReiBranco().coluna - 1 >=0) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiBranco().linha - 1,this.acharReiBranco().coluna - 1))
							{
								// - -
							//	System.out.println("6");

								acharReiBranco().setP1(true);

							}
							}
							if( this.acharReiBranco().linha - 1 >=0 && this.acharReiBranco().coluna + 1 <= 7) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiBranco().linha - 1,this.acharReiBranco().coluna + 1))
							{
								// - +
							//	System.out.println("7");

								acharReiBranco().setP3(true);

							}
							}
							if(this.acharReiBranco().linha - 1 >=0) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiBranco().linha - 1,this.acharReiBranco().coluna))
							{
								// - =
							//	System.out.println("8");

								acharReiBranco().setP2(true);

							}
							}
							
							// seja fora do tabuleiro soma tambem
							
							//coluna
							
							
							
							
							
						
						}
						
						
							
					} catch (Exception e) {
						// TODO: handle exception
					}
					}
					
				}
			}
			
			if(this.acharReiBranco().coluna == 0 && this.acharReiBranco().linha >= 1 && this.acharReiBranco().linha <= 6 )
			{
			//	System.out.println("8");
				acharReiBranco().setP1(true);
				acharReiBranco().setP4(true);
				acharReiBranco().setP6(true);


			}
			if(this.acharReiBranco().coluna == 7 && this.acharReiBranco().linha >= 1 && this.acharReiBranco().linha <= 6 )
			{
			//	System.out.println("9");
				acharReiBranco().setP3(true);
				acharReiBranco().setP5(true);
				acharReiBranco().setP8(true);

			}
			//corner
			if(this.acharReiBranco().coluna == 0 && this.acharReiBranco().linha == 0)
			{
			//	System.out.println("10");

				acharReiBranco().setP6(true);
				acharReiBranco().setP4(true);
				acharReiBranco().setP1(true);
				acharReiBranco().setP3(true);
				acharReiBranco().setP2(true);

			}
			if(this.acharReiBranco().coluna == 7 && this.acharReiBranco().linha == 7)
			{
			//	System.out.println("11");

				acharReiBranco().setP3(true);
				acharReiBranco().setP5(true);
				acharReiBranco().setP8(true);
				acharReiBranco().setP6(true);
				acharReiBranco().setP7(true);

			}
			if(this.acharReiBranco().coluna == 0 && this.acharReiBranco().linha == 7)
			{
			//	System.out.println("12");

				acharReiBranco().setP1(true);
				acharReiBranco().setP4(true);
				acharReiBranco().setP6(true);
				acharReiBranco().setP7(true);
				acharReiBranco().setP8(true);

			}
			if(this.acharReiBranco().coluna == 7 && this.acharReiBranco().linha == 0)
			{
			//	System.out.println("13");

				acharReiBranco().setP1(true);
				acharReiBranco().setP2(true);
				acharReiBranco().setP3(true);
				acharReiBranco().setP5(true);
				acharReiBranco().setP8(true);

			}
			
			if(this.acharReiBranco().linha == 0 && this.acharReiBranco().coluna >= 1 && this.acharReiBranco().coluna <= 6 )
			{
			//	System.out.println("14");

				acharReiBranco().setP1(true);
				acharReiBranco().setP2(true);
				acharReiBranco().setP3(true);

			}
			if(this.acharReiBranco().linha == 7 && this.acharReiBranco().coluna >= 1 && this.acharReiBranco().coluna <= 6 )
			{
			//	System.out.println("15");

				acharReiBranco().setP6(true);
				acharReiBranco().setP7(true);
				acharReiBranco().setP8(true);

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// Rei 	
			for(int i = 0; i <8; i++)
			{
				
				for(int j = 0; j <8; j++)
				{
					if(this.verificarRei(false) == true) {
					try {
						
						//validacao ocorre dps da troca da vez
						if(this.peca[i][j].id != 5 && this.peca[i][j].branco == true && this.acharReiPreto().Check == false && this.vezdobranco == false){
							//fazer 8 verificacoes por rei
							
							
							if(this.acharReiPreto().linha + 1 <= 7) {
							
								if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiPreto().linha + 1,this.acharReiPreto().coluna))	
								{
			//						System.out.println("101");

									acharReiPreto().setP7(true);
									// + = 
									
								}
							}
							if(this.acharReiPreto().linha + 1 <= 7 && this.acharReiPreto().coluna - 1 >=0) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiPreto().linha + 1,this.acharReiPreto().coluna - 1))
							{
								// + -
			//					System.out.println("102");

								acharReiPreto().setP6(true);

							}
							}
							if(this.acharReiPreto().linha + 1 <= 7 && this.acharReiPreto().coluna + 1 <= 7 ) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiPreto().linha + 1,this.acharReiPreto().coluna + 1))
							{
								// + +
				//				System.out.println("103");

								acharReiPreto().setP8(true);



							}
							}

							
							if(this.acharReiPreto().coluna - 1 >=0) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiPreto().linha,this.acharReiPreto().coluna - 1))
							{
				//				// = - 
				//				System.out.println("104");

								acharReiPreto().setP4(true);


							}
							}
							if(this.acharReiPreto().coluna + 1 <= 7) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiPreto().linha,this.acharReiPreto().coluna + 1))
							{
								// = +
				//				System.out.println("105");

								acharReiPreto().setP5(true);


							}
							}
							
							//
							if(this.acharReiPreto().linha - 1 >=0 && this.acharReiPreto().coluna - 1 >=0) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiPreto().linha - 1,this.acharReiPreto().coluna - 1))
							{
								// - -
				//				System.out.println("106");

								acharReiPreto().setP1(true);


							}
							}
							if( this.acharReiPreto().linha - 1 >=0 && this.acharReiPreto().coluna + 1 <= 7) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiPreto().linha - 1,this.acharReiPreto().coluna + 1))
							{
								// - +
				//				System.out.println("107");

								acharReiPreto().setP3(true);


							}
							}
							if(this.acharReiPreto().linha - 1 >=0) {
							if(this.peca[i][j].mostrarquadrado(this.peca[i][j],this.acharReiPreto().linha - 1,this.acharReiPreto().coluna))
							{
								// - =
				//				System.out.println("108");

								acharReiPreto().setP2(true);


							}
							}
							
							// seja fora do tabuleiro soma tambem
							
							//coluna
							
							
							
							
							
						
						}
						
						
							
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					}
				}
			}
			
			try {
			if(this.acharReiPreto().coluna == 0 && this.acharReiPreto().linha >= 1 && this.acharReiPreto().linha <= 6 )
			{
			//	System.out.println("109");

				acharReiPreto().setP1(true);
				acharReiPreto().setP4(true);
				acharReiPreto().setP6(true);


			}
			if(this.acharReiPreto().coluna == 7 && this.acharReiPreto().linha >= 1 && this.acharReiPreto().linha <= 6 )
			{
			//	System.out.println("110");

				acharReiPreto().setP3(true);
				acharReiPreto().setP5(true);
				acharReiPreto().setP8(true);

			}
			//corner
			if(this.acharReiPreto().coluna == 0 && this.acharReiPreto().linha == 0)
			{
			//	System.out.println("111");

				acharReiPreto().setP6(true);
				acharReiPreto().setP4(true);
				acharReiPreto().setP1(true);
				acharReiPreto().setP3(true);
				acharReiPreto().setP2(true);

			}
			if(this.acharReiPreto().coluna == 7 && this.acharReiPreto().linha == 7)
			{
				//System.out.println("112");

				acharReiPreto().setP3(true);
				acharReiPreto().setP5(true);
				acharReiPreto().setP8(true);
				acharReiPreto().setP6(true);
				acharReiPreto().setP7(true);

				//
				
			}
			if(this.acharReiPreto().coluna == 0 && this.acharReiPreto().linha == 7)
			{
				//System.out.println("113");

				acharReiPreto().setP1(true);
				acharReiPreto().setP4(true);
				acharReiPreto().setP6(true);
				acharReiPreto().setP7(true);
				acharReiPreto().setP8(true);

			}
			if(this.acharReiPreto().coluna == 7 && this.acharReiPreto().linha == 0)
			{
			//	System.out.println("114");

				acharReiPreto().setP1(true);
				acharReiPreto().setP2(true);
				acharReiPreto().setP3(true);
				acharReiPreto().setP5(true);
				acharReiPreto().setP8(true);

			}
			
			if(this.acharReiPreto().linha == 0 && this.acharReiPreto().coluna >= 1 && this.acharReiPreto().coluna <= 6 )
			{
				//System.out.println("115");

				acharReiPreto().setP1(true);
				acharReiPreto().setP2(true);
				acharReiPreto().setP3(true);
			}
			if(this.acharReiPreto().linha == 7 && this.acharReiPreto().coluna >= 1 && this.acharReiPreto().coluna <= 6 )
			{
				//System.out.println("116");

				acharReiPreto().setP6(true);
				acharReiPreto().setP7(true);
				acharReiPreto().setP8(true);

			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
			
			
			
			
			
			
		//	System.out.printf("\n \n \n \n \n \n");
			
			try{
			if(acharReiBranco().Vempate() == true)
			{
				
				this.jogo.tab.empatado = true;
				
			}
			if(acharReiPreto().Vempate() == true)
			{
				
				this.jogo.tab.empatado = true;
			}
			}
			catch (Exception e) {
				// TODO: handle exception
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
	
	public boolean verificarRei(boolean cor){
		int quantidadedepecas = 0;
		int reib = 0;
		int reip = 0;
		
		if(cor == true) {
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j <8; j++)
			{
				try {
					if(this.peca[i][j].branco == true) {
						quantidadedepecas = quantidadedepecas + 1; 
						}
					
					if(this.peca[i][j].id == 5 && this.peca[i][j].branco == true)
					{
						
						
						reib = 1;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}
		
		if(quantidadedepecas == 1 && reib == 1)return true;
			
		}
		else
		{
			for(int i = 0; i < 8; i++)
			{
				for(int j = 0; j <8; j++)
				{
					try {
						if(this.peca[i][j].branco == false) {
							quantidadedepecas = quantidadedepecas + 1; 
							}
						
						if(this.peca[i][j].id == 5 && this.peca[i][j].branco == false)
						{
							reip = 1;
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				//System.out.print(quantidadedepecas);
			}
			
			if(quantidadedepecas == 1 && reip == 1)return true;
			
			
		}
		
		
		//System.out.println(quantidadedepecas);
		
		
		return false;
		
	}
	
	
	
	

	private void mover(Peca selecionada2, int linha, int coluna) {
		selecionada2.mover(linha, coluna);
		
	}

}
