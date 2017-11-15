package test;

import javax.imageio.IIOException;

public class Assert {

	public static void main(String[] args) {
		
		
		// asert(200);
		diaSemana(12);
	}

	private static void asert(double salario) {

		assert (salario < 100): "Salário incorreto";
		// if(salario < 100) {
		//
		// } else {
		//
		// }
	}
	public static void diaSemana (int dia) {
		
		switch(dia) {
		
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
			default: assert false;
		}
	}
}
