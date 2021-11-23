package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
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
import Model.Rei;
import Model.Tabuleiro;
import Model.Torre;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.border.BevelBorder;

public class Jogo extends JFrame {

	private JPanel contentPane;
	private Tabuleiro tabuleiro;
	public String jogador1;
	public String jogador2;
	
	
	

	public Jogo(String Player1, String Player2) {
		
		TabuleiroVisualizacao tab =new TabuleiroVisualizacao(new Tabuleiro(this));
		getContentPane().add(tab);
		tab.setBounds(74, 35, 400, 400);
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
		lblVez.setBounds(550, 213, 219, 14);
		getContentPane().add(lblVez);
		
		JLabel lblVezDe = new JLabel("Branco");
		lblVezDe.setBounds(675, 213, 94, 14);
		getContentPane().add(lblVezDe);
		
		if (this.tabuleiro != null ) {
			if(this.tabuleiro.vezdobranco == true  )
			{
				lblVezDe.setText("Branco");
			}
			else
			{
				lblVezDe.setText("Preto");
			}
		
		}
			
		
				
		
		
	}



	
	
	
	
	
	
	}
	
	
	
	