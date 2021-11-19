package Model;

public class Rei extends Peca{
	String imagem;

	public Rei(int linha, int coluna,String cor) {
			super(linha,  coluna, cor);
			if(cor.equals("Black"))
			{
			this.imagem = "R(Preta)";
			}
			else
			{
			this.imagem = "R(Branca)";
			}
	}
	public String getImagem() {
		return imagem;
	}

}
