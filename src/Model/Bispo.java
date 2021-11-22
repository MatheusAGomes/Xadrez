package Model;

public class Bispo extends Peca{

	String imagem;
	
	public Bispo(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor = false)
			{
			this.imagem = "B(Preta)";
			}
			else
			{
			this.imagem = "B(Branca)";
			}
			this.id = 3;
	}
	public String getImagem() {
		return imagem;
	}

}
