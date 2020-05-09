package br.com.bootcamp.jogo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Forca {
	public static void main(String[] args) throws IOException {
		System.out.println("Bem vindo ao jogo!");
		Scanner in = new Scanner(System.in);
		char dificuldadeJogo = 'a';
		while (dificuldadeJogo != 'S') {

			System.out.print("Qual dificuldade do jogo?: F(Fácil); N(Normal); D(Difícil); S(Sair) -->");
			dificuldadeJogo = in.next().toString().charAt(0);

			switch (dificuldadeJogo) {
			case 'F':
				System.out.println(listaPalavraFacil());
				break;
			case 'N':
				System.out.println(listaPalavraNormal());
				break;
			case 'D':
				System.out.println(listaPalavraDificil());
				break;

			case 'X':
				break;

			default:
				System.out.println("Opção inválida!");
				break;

			}
		}

		in.close();
	}

	public static String listaPalavraDificil() {
		String[] palavras = { "carambola", "lichia", "jatoba" };
		Random random = new Random();
		return palavras[random.nextInt(palavras.length - 1)];
	}

	public static String listaPalavraNormal() {
		String[] palavras = { "abacaxi", "melancia", "melao" };
		Random random = new Random();
		return palavras[random.nextInt(palavras.length - 1)];
	}

	public static String listaPalavraFacil() {
		String[] palavras = { "banana", "uva", "maca" };
		Random random = new Random();
		return palavras[random.nextInt(palavras.length - 1)];
	}
}
