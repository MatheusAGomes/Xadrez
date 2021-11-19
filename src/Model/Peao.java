package Model;

public class Peao extends Peca{
	String imagem;

	public Peao(int linha, int coluna,String cor) {
			super(linha,  coluna, cor);
			if(cor.equals("Black"))
			{
			this.imagem = "P(Preta)";
			}
			else
			{
			this.imagem = "P(Branca)";
			}
			
	}
	
	

	public String getImagem() {
		return imagem;
	}
}
