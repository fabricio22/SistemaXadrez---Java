package br.com.jogoxadrez.xadrez;

import br.com.jogoxadrez.pecasxadrez.Rei;
import br.com.jogoxadrez.pecasxadrez.Torre;
import br.com.jogoxadrez.tabuleiro.Posicao;
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
	
	private void configuracaoInicial() {
		tabuleiro.colocarPecaNoTabuleiro(new Torre(tabuleiro, Color.BRANCO), new Posicao(2, 1));
		tabuleiro.colocarPecaNoTabuleiro(new Rei(tabuleiro, Color.PRETO), new Posicao(0, 4));
		tabuleiro.colocarPecaNoTabuleiro(new Rei(tabuleiro, Color.BRANCO), new Posicao(7, 4));
	}
}
