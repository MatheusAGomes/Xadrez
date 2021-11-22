package View;

import javax.swing.JLabel;

import Model.Peca;

public class PecaVisualizada extends JLabel {
			
	
		private Peca pecas;
		
	
		public PecaVisualizada(Peca peca)
		{
		 this.pecas = peca;
		 this.setText(Integer.toString(pecas.id));
		}
		
		
		public Peca getPeca()
		{
			return this.pecas;
		}
	
}
