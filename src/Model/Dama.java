package Model;

public class Dama extends Peca{

		String imagem;
	
	public Dama( int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor = false)
			{
			this.imagem = "D(Preta)";
			}
			else
			{
			this.imagem = "D(Branca)";
			}
			this.id = 4;
	}
	public String getImagem() {
		return imagem;
	}

}
