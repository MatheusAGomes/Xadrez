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

import Model.Arquivo;
import Model.Bispo;
import Model.Cavalo;
import Model.Dama;
import Model.Peao;
import Model.Peca;
import Model.Rei;
import Model.Tabuleiro;
import Model.Torre;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CarregamentoDeJogo extends JFrame {
	

	private JPanel contentPane;
	private Tabuleiro tabuleiro;
	public String jogador1;
	public String jogador2;
	public TabuleiroVisualizacao tab;
	public Peca[][] pecaseliminados;
	public int QuantidadeDePecasEliminadasBrancas;
	public int QuantidadeDePecasEliminadasPretas;
	public int rodada = 3;
	
	
	public CarregamentoDeJogo() {
		
		Arquivo leitura = new Arquivo();
		String[] cabecario = leitura.ReadCabecario();
		String Vencedor = leitura.LerResultado();
		
		this.QuantidadeDePecasEliminadasBrancas = 0;
		this.QuantidadeDePecasEliminadasPretas = 0;
		
		this.pecaseliminados = new Peca[2][16];
		
		TabuleiroVisualizacao tab = new TabuleiroVisualizacao(new Tabuleiro());
		getContentPane().add(tab);
		tab.setBounds(74, 35, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 811, 587);
		getContentPane().setLayout(null);
		this.tab = tab;
		this.tab.finalizado = true;
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new TelaDeInicio().setVisible(true);;
			}
		});
		btnNewButton.setBounds(354, 446, 120, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("| >");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tab.tabuleiro.reproduzirjogada(rodada);
				rodada = rodada + 1;
				tab.criarTab();
			}
		});
		btnNewButton_1.setBounds(74, 446, 120, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel(cabecario[0]);
		lblNewLabel.setBounds(508, 35, 247, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(cabecario[1]);
		lblNewLabel_1.setBounds(508, 82, 247, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(cabecario[2]);
		lblNewLabel_2.setBounds(508, 124, 247, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(Vencedor);
		lblNewLabel_3.setBounds(508, 173, 247, 14);
		getContentPane().add(lblNewLabel_3);
				
		
		
	}
	}
	
	
	
	
	