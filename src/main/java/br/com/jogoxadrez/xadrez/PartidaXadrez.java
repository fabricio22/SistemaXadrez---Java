package br.com.jogoxadrez.xadrez;

import br.com.jogoxadrez.tabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
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
}
