package br.com.jogoxadrez.tabuleiro;

public abstract class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public abstract boolean[][] possivelMovimento();

	public boolean possivelMovimento(Posicao posicao) {
		return possivelMovimento()[posicao.getLinha()][posicao.getColuna()];
	}

	public boolean haAlgumPosivelMovimento() {
		boolean[][] matriz = possivelMovimento();
		
		for(int l = 0; l < matriz.length; l++) {
			
			for(int c = 0; c < matriz.length; c++) {
			
				if(matriz[l][c]) {
					return true;
				}
			}
		}
		
		return false;
	}
}
