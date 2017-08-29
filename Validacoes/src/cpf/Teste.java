package cpf;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String cpf;
		System.out.println("Digite se cpf:\n");
		cpf = in.next();

		if (ValidaCPF.isCPF(cpf) == true) {
			System.out.println(ValidaCPF.imprimeCPF(cpf));
		} else {
			System.out.println("CPF inválido\n	");
		}
	}
}
