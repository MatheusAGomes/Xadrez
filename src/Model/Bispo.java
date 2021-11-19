package Model;

public class Bispo extends Peca{

	String imagem;
	
	public Bispo(int linha, int coluna,String cor) {
			super(linha,  coluna, cor);
			if(cor.equals("Black"))
			{
			this.imagem = "B(Preta)";
			}
			else
			{
			this.imagem = "B(Branca)";
			}
	}
	public String getImagem() {
		return imagem;
	}

}
