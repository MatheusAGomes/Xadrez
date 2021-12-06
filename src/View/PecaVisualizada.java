package View;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Model.Peca;

public class PecaVisualizada extends JLabel {
			
	
		private Peca pecas;
		
	
		public PecaVisualizada(Peca peca)
		{
		 this.pecas = peca;
		 	ImageIcon imagem = new ImageIcon(getClass().getResource(this.pecas.getImagem()));
			this.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		
			 
		
		 
		 
		 
		}
		
		
		public Peca getPeca()
		{
			return this.pecas;
		}
	
}
