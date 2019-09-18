package br.com.jogoxadrez.xadrez;

import br.com.jogoxadrez.pecasxadrez.Rei;
import br.com.jogoxadrez.pecasxadrez.Torre;
import br.com.jogoxadrez.tabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configuracaoInicial();
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez [][] matrizPeca = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		
		for(int linha =0; linha < tabuleiro.getLinhas(); linha++) {
			
			for(int coluna =0; coluna < tabuleiro.getColunas(); coluna++) {
				 matrizPeca[linha][coluna] = (PecaXadrez) tabuleiro.peca(linha, coluna);
			}
		}
		
		return matrizPeca;
		
	}
	
	private void novoPosicaoPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.colocarPecaNoTabuleiro(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}
	
	private void configuracaoInicial() {
		novoPosicaoPeca('b', 6, new Torre(tabuleiro, Color.BRANCO));
		novoPosicaoPeca('e', 8, new Rei(tabuleiro, Color.PRETO));
		novoPosicaoPeca('e', 1, new Rei(tabuleiro, Color.BRANCO));
	}
}
