package Model;

public class Torre extends Peca{
	String imagem;

	public Torre(int linha, int coluna,String cor) {
			super(linha,  coluna, cor);
			if(cor.equals("Black"))
			{
			this.imagem = "Torre(Preta)";
			}
			else
			{
			this.imagem = "Torre(Branca)";
			}
	}
	public String getImagem() {
		return imagem;
	}

}
