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
	public TabuleiroVisualizacao tab;
	public Peca[][] pecaseliminados;
	public int QuantidadeDePecasEliminadasBrancas;
	public int QuantidadeDePecasEliminadasPretas;
	public JLabel lblVezDe = new JLabel();
	
	
	
	

	public Jogo(String Player1, String Player2) {
		
		this.QuantidadeDePecasEliminadasBrancas = 0;
		this.QuantidadeDePecasEliminadasPretas = 0;
		
		this.pecaseliminados = new Peca[2][16];
		
		TabuleiroVisualizacao tab =new TabuleiroVisualizacao(new Tabuleiro(this));
		getContentPane().add(tab);
		tab.setBounds(74, 35, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 795, 550);
		getContentPane().setLayout(null);
		this.tab = tab;
		
		
		
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
		lblVez.setBounds(550, 213, 119, 14);
		getContentPane().add(lblVez);
		
		
		this.lblVezDe.setText("Branco");
		this.lblVezDe.setBounds(675, 213, 94, 14);
		getContentPane().add(lblVezDe);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new TelaDeInicio().setVisible(true);;
			}
		});
		btnNewButton.setBounds(540, 449, 208, 23);
		getContentPane().add(btnNewButton);
		
		
		
		
			
		
				
		
		
	}
	public void trocarvez(Boolean vezdobranco) {
		if(vezdobranco == true) {
			System.out.print("a");
		this.lblVezDe.setText("Branco");
		this.lblVezDe.setBounds(675, 213, 94, 14);
		getContentPane().add(lblVezDe);
		}
		else
		{
			System.out.print("a");
		this.lblVezDe.setText("Preto");
		this.lblVezDe.setBounds(675, 213, 94, 14);
		getContentPane().add(lblVezDe);
		
		}
	}
	}
	
	
	
	