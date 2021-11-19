package Model;

public class Dama extends Peca{

		String imagem;
	
	public Dama( int linha, int coluna,String cor) {
			super(linha,  coluna, cor);
			if(cor.equals("Black"))
			{
			this.imagem = "D(Preta)";
			}
			else
			{
			this.imagem = "D(Branca)";
			}
	}
	public String getImagem() {
		return imagem;
	}

}
