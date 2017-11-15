package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		try {
			aprovacao();
		} catch (ArgumentoInvalidoException e) {
			System.out.println("Deu Ruim");
			e.printStackTrace();
		}
	}

	public static void aprovacao() throws ArgumentoInvalidoException {

		Scanner in = new Scanner(System.in);

		String goku = "GOKU";
		int power = 8000;

		System.out.println("Quem é você ?");
		String nome = in.next();

		System.out.println("Qual seu poder ?");
		int poder = in.nextInt();

		in.close();

		if (nome.toUpperCase().equals(goku) == false && poder <= power) {
			
			throw new ArgumentoInvalidoException();

		} else {
			System.out.println("Kakaroto!!!!!!");
		}
	}
}
