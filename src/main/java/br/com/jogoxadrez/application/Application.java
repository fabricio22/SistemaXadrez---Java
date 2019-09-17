package br.com.jogoxadrez.application;

import br.com.jogoxadrez.tabuleiro.Posicao;
import br.com.jogoxadrez.tabuleiro.Tabuleiro;

public class Application {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(3, 3);

		System.out.println(tabuleiro);
	}

}
