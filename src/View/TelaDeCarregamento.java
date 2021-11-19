package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class TelaDeCarregamento extends JFrame {

	private JPanel contentPane;

	public TelaDeCarregamento() {
		
		
		setBounds(100, 100, 495, 479);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		progressBar.setIndeterminate(true);
		progressBar.setBounds(38, 314, 387, 25);
		contentPane.add(progressBar);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaDeCarregamento.class.getResource("/View/gif.gif")));
		lblNewLabel.setBounds(38, 30, 387, 273);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Aguarde enquanto preparamos o seu tabuleiro");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(38, 344, 387, 47);
		contentPane.add(lblNewLabel_1);
	
	}
	
	
	
}
