package br.com.jogoxadrez.pecasxadrez;

import br.com.jogoxadrez.tabuleiro.Tabuleiro;
import br.com.jogoxadrez.xadrez.Color;
import br.com.jogoxadrez.xadrez.PecaXadrez;

public class Torre extends PecaXadrez{

	public Torre(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
