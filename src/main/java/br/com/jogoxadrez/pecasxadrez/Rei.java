package br.com.jogoxadrez.pecasxadrez;

import br.com.jogoxadrez.tabuleiro.Tabuleiro;
import br.com.jogoxadrez.xadrez.Color;
import br.com.jogoxadrez.xadrez.PecaXadrez;

public class Rei extends PecaXadrez{

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possivelMovimento() {
		boolean[][] matriz = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return matriz;
	}

}
