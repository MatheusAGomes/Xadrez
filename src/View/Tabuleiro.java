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

import Model.Quadrado;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Tabuleiro extends JFrame {

	private JPanel contentPane;

	public Tabuleiro(String Player1, String Player2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 795, 590);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jogador 1 :");
		lblNewLabel.setBounds(550, 45, 208, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNomeJogador1 = new JLabel(Player1);
		lblNomeJogador1.setBounds(619, 45, 160, 14);
		getContentPane().add(lblNomeJogador1);
		
		JLabel lblNewLabel_1 = new JLabel("Cor :");
		lblNewLabel_1.setBounds(550, 70, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblBranco = new JLabel("Branco");
		lblBranco.setBounds(579, 70, 179, 14);
		getContentPane().add(lblBranco);
		
		JLabel lblJogador = new JLabel("Jogador 2 :");
		lblJogador.setBounds(550, 282, 208, 14);
		getContentPane().add(lblJogador);
		
		JLabel lblNomeJogador2 = new JLabel(Player2);
		lblNomeJogador2.setBounds(621, 282, 137, 14);
		getContentPane().add(lblNomeJogador2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cor :");
		lblNewLabel_1_1.setBounds(550, 308, 46, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblBranco_1 = new JLabel("Preto");
		lblBranco_1.setBounds(579, 308, 179, 14);
		getContentPane().add(lblBranco_1);
		
		JButton btnDesistirBranco = new JButton("Desistir");
		btnDesistirBranco.setBounds(550, 101, 208, 23);
		getContentPane().add(btnDesistirBranco);
		
		JButton btnProporBranco = new JButton("Propor empate");
		btnProporBranco.setBounds(550, 135, 208, 23);
		getContentPane().add(btnProporBranco);
		
		JButton btnDesistirPreto = new JButton("Desistir");
		btnDesistirPreto.setBounds(550, 333, 208, 23);
		getContentPane().add(btnDesistirPreto);
		
		JButton btnProporEmpatePreto = new JButton("Propor empate");
		btnProporEmpatePreto.setBounds(550, 367, 208, 23);
		getContentPane().add(btnProporEmpatePreto);
		
		JLabel lblVez = new JLabel("A vez \u00E9 das pe\u00E7as :");
		lblVez.setBounds(550, 213, 94, 14);
		getContentPane().add(lblVez);
		
		JLabel lblVezDe = new JLabel("");
		lblVezDe.setBounds(654, 213, 94, 14);
		getContentPane().add(lblVezDe);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 400, 400);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		
		
		Quadrado quadrado[][] = new Quadrado[8][8];
		int i ;
		int j ;
		for ( i = 0; i<8; i++ ) {
			  for ( j=0; j<8; j++ )
			  {
				  
				  if((j % 2) == 0) {
					System.out.print(j);
				  quadrado[i][j] = new Quadrado(Color.WHITE,50,50);
				  panel.add(quadrado[i][j]);
				  quadrado[i][j].setBounds(j*50,i*50,quadrado[i][j].getLargura(),quadrado[i][j].getAltura());
				  
				  }
				  else
				  {
					  quadrado[i][j] = new Quadrado(Color.BLACK,50,50);
					  panel.add(quadrado[i][j]);
					  quadrado[i][j].setBounds(j*50,i*50,quadrado[i][j].getLargura(),quadrado[i][j].getAltura());
				  }
			  }
		}
		
		
	}
}
