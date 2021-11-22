package Model;

public class Peao extends Peca{
	String imagem;

	public Peao(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor = false)
			{
			this.imagem = "P(Preta)";
			}
			else
			{
			this.imagem = "P(Branca)";
			}
			this.id = 1;
			
	}


	public String getImagem() {
		return imagem;
	}
	
	
}
