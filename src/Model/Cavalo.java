package Model;

public class Cavalo extends Peca{
	
	String imagem;

	public Cavalo(int linha, int coluna,String cor) {
			super(linha,  coluna, cor);
			if(cor.equals("Black"))
			{
			this.imagem = "C(Preta)";
			}
			else
			{
			this.imagem = "C(Branca)";
			}
	}
	public String getImagem() {
		return imagem;
	}

}
