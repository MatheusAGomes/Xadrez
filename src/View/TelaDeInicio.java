package View;

import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

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
				nome[1] = JOptionPane.showInputDialog("<DIGITE O NOME DO SEGUNDO JOGADOR>");
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
								Tabuleiro tab = new Tabuleiro(nome[0],nome[1]);
								tab.setVisible(true);
							}
							
						}
						
						
					}
					
				};
				t.start();
				
				
			}
		});
		btnNewButton.setBounds(105, 254, 269, 51);
		contentPane.add(btnNewButton);
	
		
		
	
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setBounds(105, 378, 269, 51);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaDeInicio.class.getResource("/View/New Project.png")));
		lblNewLabel.setBounds(-390, 12, 1215, 231);
		contentPane.add(lblNewLabel);
		
		JButton btnUltimosJogos = new JButton("Ultimos Jogos");
		btnUltimosJogos.setBounds(105, 316, 269, 51);
		contentPane.add(btnUltimosJogos);
		
	}
}
