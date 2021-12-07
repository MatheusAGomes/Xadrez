package View;

import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tabuleiro;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Date;
import java.util.Calendar;

public class TelaDeInicio extends JFrame {

	private JPanel contentPane;


	public TelaDeInicio() {
		String nome[] = new String[2];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnNewButton = new JButton("Novo Jogo");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			nome[0] = JOptionPane.showInputDialog("<DIGITE O NOME DO PRIMEIRO JOGADOR>");
			while(nome[0].isEmpty()) {
				nome[0] = JOptionPane.showInputDialog("<DIGITE O NOME DO PRIMEIRO JOGADOR>");
			}
				nome[1] = JOptionPane.showInputDialog("<DIGITE O NOME DO SEGUNDO JOGADOR>");
			while(nome[1].isEmpty()) {
					nome[1] = JOptionPane.showInputDialog("<DIGITE O NOME DO PRIMEIRO JOGADOR>");
				}
			setVisible(false);
			TelaDeCarregamento teladecarregamento = new TelaDeCarregamento();
			teladecarregamento.setVisible(true);
			
			Thread t =new Thread(){
				
				@Override
				public void run() {
					
					for (int i = 0 ; i<=100;i++) {
						try {
							sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(i==100)
						{
							teladecarregamento.setVisible(false);
							Jogo jogo = new Jogo(nome[0],nome[1]);
							jogo.setVisible(true);
						}
						
					}
					
					
				}
				
			};
			t.start();
				
				
				//Zerando o arquivo
				FileWriter arq;
			//	System.out.println(Calendar.getInstance().get(Calendar.YEAR));
				//mes
				 int numero  = Calendar.getInstance().get(Calendar.MONTH) + 1;
			//	System.out.println(numero);
			//	System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
				try {
					arq = new FileWriter("ListaDeJogadas.txt");
					PrintWriter gravaArqvio = new PrintWriter(arq);
					gravaArqvio.println("Data: "+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+" / "+numero+" / "+Calendar.getInstance().get(Calendar.YEAR));
					gravaArqvio.println("PUC CAMPINAS CHAMPIONSHIP");
					gravaArqvio.println(nome[0]+" X "+nome[1]);
					gravaArqvio.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setBounds(105, 254, 269, 51);
		contentPane.add(btnNewButton);
	
		
		
	
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				System.exit(0);

			}
		});
		btnNewButton_1.setBounds(105, 378, 269, 51);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaDeInicio.class.getResource("/View/Imagens/New Project.png")));
		lblNewLabel.setBounds(-390, 12, 1215, 231);
		contentPane.add(lblNewLabel);
		
		JButton btnUltimosJogos = new JButton("Ultimos Jogos");
		btnUltimosJogos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				CarregamentoDeJogo tela = new CarregamentoDeJogo();
				tela.setVisible(true);
			}
		});
		btnUltimosJogos.setBounds(105, 316, 269, 51);
		contentPane.add(btnUltimosJogos);
		
	}
}