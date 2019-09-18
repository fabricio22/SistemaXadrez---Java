package br.com.jogoxadrez.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.jogoxadrez.xadrez.ExcecaoXadrez;
import br.com.jogoxadrez.xadrez.PartidaXadrez;
import br.com.jogoxadrez.xadrez.PecaXadrez;
import br.com.jogoxadrez.xadrez.PosicaoXadrez;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();

		while (true) {
			try {
				UI.limpaTela();
				UI.exibirTabulerio(partidaXadrez.getPecas());
				System.out.println();
				System.out.print("Digite a posicao da peca que voce deseja mover: ");
				PosicaoXadrez origem = UI.leituraPosicaoPecaXadrez(sc);

				System.out.println();
				System.out.print("Digite a posição de destino: ");
				PosicaoXadrez destino = UI.leituraPosicaoPecaXadrez(sc);

				PecaXadrez pecaCapturada = partidaXadrez.executaMudancaPeca(origem, destino);
			} catch (ExcecaoXadrez e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}

}
