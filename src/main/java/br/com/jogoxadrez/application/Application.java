package br.com.jogoxadrez.application;

import br.com.jogoxadrez.xadrez.PartidaXadrez;

public class Application {

	public static void main(String[] args) {

       PartidaXadrez partidaXadrez = new PartidaXadrez();
       UI.exibirTabulerio(partidaXadrez.getPecas());
	}

}
