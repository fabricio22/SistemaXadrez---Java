package br.com.jogoxadrez.tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(Integer linhas, Integer colunas) {
		if(linhas < 1 || colunas < 1) {
			throw new ExcecaoTabuleiro("Erro ao criar o Tabuleiro: Deve conter pelo menos 1 linha e 1 coluna.");
		}
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca peca(Integer linha, Integer coluna) {
		if(!posicaoExistente(linha, coluna)) {
			throw new ExcecaoTabuleiro("Posição não existe no tabuleiro.");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPecaNoTabuleiro(Peca peca, Posicao posicao) {
		if(haUmaPecaNaPosicao(posicao)) {
			throw new ExcecaoTabuleiro("Já existe uma peça na posição " + posicao);
		}
		
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean haUmaPecaNaPosicao(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new ExcecaoTabuleiro("Posição não existe no tabuleiro.");
		}
		
		return peca(posicao) != null;
	}
	
}