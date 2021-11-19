package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Bispo;
import Model.Cavalo;
import Model.Dama;
import Model.Peao;
import Model.Peca;
import Model.Quadrado;
import Model.Rei;
import Model.Torre;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tabuleiro extends JFrame {

	private JPanel contentPane;
	
	Peca pecasBrancas[] =  new Peca[17];
	Peca pecasPretas[] =  new Peca[17];
	Quadrado quadrado[][] = new Quadrado[8][8];

	public Tabuleiro(String Player1, String Player2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 795, 550);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jogador 1 :");
		lblNewLabel.setBounds(540, 277, 208, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNomeJogador1 = new JLabel(Player1);
		lblNomeJogador1.setBounds(611, 277, 137, 14);
		getContentPane().add(lblNomeJogador1);
		
		JLabel lblNewLabel_1 = new JLabel("Cor :");
		lblNewLabel_1.setBounds(540, 302, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblBranco = new JLabel("Branco");
		lblBranco.setBounds(569, 302, 179, 14);
		getContentPane().add(lblBranco);
		
		JLabel lblJogador = new JLabel("Jogador 2 :");
		lblJogador.setBounds(540, 51, 208, 14);
		getContentPane().add(lblJogador);
		
		JLabel lblNomeJogador2 = new JLabel(Player2);
		lblNomeJogador2.setBounds(611, 51, 137, 14);
		getContentPane().add(lblNomeJogador2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cor :");
		lblNewLabel_1_1.setBounds(540, 77, 46, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblBranco_1 = new JLabel("Preto");
		lblBranco_1.setBounds(569, 77, 179, 14);
		getContentPane().add(lblBranco_1);
		
		JButton btnDesistirBranco = new JButton("Desistir");
		btnDesistirBranco.setBounds(540, 333, 208, 23);
		getContentPane().add(btnDesistirBranco);
		
		JButton btnProporBranco = new JButton("Propor empate");
		btnProporBranco.setBounds(540, 367, 208, 23);
		getContentPane().add(btnProporBranco);
		
		JButton btnDesistirPreto = new JButton("Desistir");
		btnDesistirPreto.setBounds(540, 102, 208, 23);
		getContentPane().add(btnDesistirPreto);
		
		JButton btnProporEmpatePreto = new JButton("Propor empate");
		btnProporEmpatePreto.setBounds(540, 136, 208, 23);
		getContentPane().add(btnProporEmpatePreto);
		
		JLabel lblVez = new JLabel("A vez \u00E9 das pe\u00E7as :");
		lblVez.setBounds(550, 213, 94, 14);
		getContentPane().add(lblVez);
		
		JLabel lblVezDe = new JLabel("");
		lblVezDe.setBounds(654, 213, 94, 14);
		getContentPane().add(lblVezDe);
		
		JPanel panel = new JPanel();
		panel.setBounds(74, 35, 400, 400);
		getContentPane().add(panel);
		panel.setLayout(null);

		
		
		Construir_tabuleiro(panel,quadrado);	
		Criando_pecas(pecasBrancas,pecasPretas);
		Colocar_pecas_no_tabuleiro(pecasBrancas,pecasPretas,quadrado);
		
		
		
	}
	
	public void Criando_pecas(Peca pecasBrancas[],Peca pecasPretas[]){
		int i;
		int j;
		//Peoes
		for(i=0; i<8;i++)
		{
			pecasBrancas[i] = new Peao(6,i,"White");
		}
		for(i=0; i<8;i++)
		{
			pecasPretas[i] = new Peao(1,i,"Black");
		}
		
		//torre
		
		  pecasBrancas[8] = new Torre(7,0,"White");
		  pecasBrancas[9] = new Torre(7,7,"White");
		  
		  pecasPretas[8] = new Torre(0,0,"Black");
		  pecasPretas[9] = new Torre(0,7,"Black");
		  
		//cavalos
		 
		  pecasBrancas[10] = new Cavalo(7,1,"White");
		  pecasBrancas[11] = new Cavalo(7,6,"White");
		  
		  pecasPretas[10] = new Cavalo(0,1,"Black");
		  pecasPretas[11] = new Cavalo(0,6,"Black");
		  
		  //Bispo
		  
		  pecasBrancas[12] = new Bispo(7,2,"White");
		  pecasBrancas[13] = new Bispo(7,5,"White");
		  
		  pecasPretas[12] = new Bispo(0,2,"Black");
		  pecasPretas[13] = new Bispo(0,5,"Black");
		  
		  //rainha
		  pecasBrancas[14] = new Dama(7,3,"White");
		  pecasPretas[14] = new Dama(0,3,"Black");
		  
		  //rei
		  
		  pecasBrancas[15] = new Rei(7,4,"White");
		  pecasPretas[15] = new Rei(0,4,"Black");
		
		
		
		
	}
	public void Colocar_pecas_no_tabuleiro(Peca pecasBrancas[],Peca pecasPretas[],Quadrado quadrado[][]) {
		//Peoes Brancos
		int i;
		int j;
		for ( i = 0; (pecasPretas[i]!= null); i++ ) {
			  
				 //printando
				  quadrado[pecasBrancas[i].getLinha()][pecasBrancas[i].getColuna()].setImagem(pecasBrancas[i].getImagem());
				  //mudando estado quadrado para ocupado
				  quadrado[pecasBrancas[i].getLinha()][pecasBrancas[i].getColuna()].OcuparQuadrado();
				  //mesmacoisa para as pretas
				  quadrado[pecasPretas[i].getLinha()][pecasPretas[i].getColuna()].setImagem(pecasPretas[i].getImagem());
				  quadrado[pecasPretas[i].getLinha()][pecasPretas[i].getColuna()].OcuparQuadrado();	  
		}
				
		
		}
	public void Construir_tabuleiro(JPanel panel,Quadrado quadrado[][]) {
		
		int i ;
		int j ;
		for ( i = 0; i<8; i++ ) {
			  for ( j=0; j<8; j++ )
			  {
				  
				  if((i % 2) == 0) {
					  if(j%2 == 0) {
					  System.out.print(j);
					  quadrado[i][j] = new Quadrado(Color.WHITE,50,50);
					  panel.add(quadrado[i][j]);
					  quadrado[i][j].setBounds(j*50,i*50,quadrado[i][j].getLargura(),quadrado[i][j].getAltura());
					  
					  }
					  else {
						  
						  quadrado[i][j] = new Quadrado(Color.BLACK,50,50);
						  panel.add(quadrado[i][j]);
						  quadrado[i][j].setBounds(j*50,i*50,quadrado[i][j].getLargura(),quadrado[i][j].getAltura());
						  
					  }
				  }
				  else
				  {
					  if(j%2 == 1) {
						  System.out.print(j);
						  quadrado[i][j] = new Quadrado(Color.WHITE,50,50);
						  panel.add(quadrado[i][j]);
						  quadrado[i][j].setBounds(j*50,i*50,quadrado[i][j].getLargura(),quadrado[i][j].getAltura());
						  }
						  else {
							  
							  quadrado[i][j] = new Quadrado(Color.BLACK,50,50);
							  panel.add(quadrado[i][j]);
							  quadrado[i][j].setBounds(j*50,i*50,quadrado[i][j].getLargura(),quadrado[i][j].getAltura());
							  
						  }
				  }
			  }
		}
	}
	
	
	}
	
	
	
	