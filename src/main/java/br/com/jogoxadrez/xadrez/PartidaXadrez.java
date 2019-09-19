package br.com.jogoxadrez.xadrez;

import br.com.jogoxadrez.pecasxadrez.Rei;
import br.com.jogoxadrez.pecasxadrez.Torre;
import br.com.jogoxadrez.tabuleiro.Peca;
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
	
	public PecaXadrez executaMudancaPeca(PosicaoXadrez origemPosicao, PosicaoXadrez destinoPosicao) {
		Posicao origem = origemPosicao.toPosicao();
		Posicao destino = destinoPosicao.toPosicao();
		validaPosicaoDeOrigem(origem);
		Peca pecaCapturada = moverPeca(origem, destino);
		return (PecaXadrez) pecaCapturada;
		
	}
	
	private Peca moverPeca(Posicao origem, Posicao destino) {
		Peca peca = tabuleiro.removerPeca(origem);
		Peca pecaCapturada = tabuleiro.removerPeca(destino);
		tabuleiro.colocarPecaNoTabuleiro(peca, destino);
		return pecaCapturada;
	}
	
	private void validaPosicaoDeOrigem(Posicao posicao) {
		if(!tabuleiro.haUmaPecaNaPosicao(posicao)) {
			throw new ExcecaoXadrez("Nao existe peça na posição informada.");
		}
		
		if(!tabuleiro.peca(posicao).haAlgumPosivelMovimento()) {
			throw new ExcecaoXadrez("Nao ha movimentos possiveis para essa peca.");
		}
	}
	
	private void novoPosicaoPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.colocarPecaNoTabuleiro(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}
	
	private void configuracaoInicial() {
		novoPosicaoPeca('e', 7, new Torre(tabuleiro, Color.BRANCO));
		novoPosicaoPeca('e', 8, new Rei(tabuleiro, Color.PRETO));
		novoPosicaoPeca('e', 1, new Rei(tabuleiro, Color.BRANCO));
		
		/*
		 * novoPosicaoPeca('c', 1, new Torre(tabuleiro, Color.BRANCO));
		 * novoPosicaoPeca('c', 2, new Torre(tabuleiro, Color.BRANCO));
		 * novoPosicaoPeca('d', 2, new Torre(tabuleiro, Color.BRANCO));
		 * novoPosicaoPeca('e', 2, new Torre(tabuleiro, Color.BRANCO));
		 * novoPosicaoPeca('e', 1, new Torre(tabuleiro, Color.BRANCO));
		 * novoPosicaoPeca('d', 1, new Rei(tabuleiro, Color.BRANCO));
		 * 
		 * novoPosicaoPeca('c', 7, new Torre(tabuleiro, Color.PRETO));
		 * novoPosicaoPeca('c', 8, new Torre(tabuleiro, Color.PRETO));
		 * novoPosicaoPeca('d', 7, new Torre(tabuleiro, Color.PRETO));
		 * novoPosicaoPeca('e', 7, new Torre(tabuleiro, Color.PRETO));
		 * novoPosicaoPeca('e', 8, new Torre(tabuleiro, Color.PRETO));
		 * novoPosicaoPeca('d', 8, new Rei(tabuleiro, Color.PRETO));
		 */
	}
	
}
