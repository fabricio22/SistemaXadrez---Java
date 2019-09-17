package br.com.jogoxadrez.application;

import br.com.jogoxadrez.xadrez.PecaXadrez;

public class UI {
	
	public static void exibirTabulerio(PecaXadrez[][] pecas) {
		
		for(int linha = 0; linha < pecas.length; linha++) {
			System.out.print((8 - linha) + " ") ;
			for(int coluna = 0; coluna < pecas.length; coluna++) {
				exibirPeca(pecas[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	public static void exibirPeca(PecaXadrez peca) {
		
		if(peca == null) {
			System.out.print("-");
		}
		else {
			System.out.print(peca);
		}
		
		System.out.print(" ");
		
	}
	
}
