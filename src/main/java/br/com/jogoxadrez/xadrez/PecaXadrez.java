package br.com.jogoxadrez.xadrez;

import br.com.jogoxadrez.tabuleiro.Peca;
import br.com.jogoxadrez.tabuleiro.Tabuleiro;

public abstract class PecaXadrez extends Peca{
	
	private Color color;

	public PecaXadrez(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
