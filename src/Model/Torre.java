package Model;

public class Torre extends Peca{
	String imagem;

	public Torre(int linha, int coluna,Boolean cor) {
			super(linha,  coluna, cor);
			if(cor = false)
			{
			this.imagem = "Torre(Preta)";
			}
			else
			{
			this.imagem = "Torre(Branca)";
			}
			this.id = 2;
	}
	public String getImagem() {
		return imagem;
	}

}
