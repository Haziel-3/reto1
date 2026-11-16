package reto1;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Elige la operación:\n" + "1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir\n"
				+ "5. Par\n" + "6. Impar\n" + "7. Positivo\n" + "8. Negativo\n" + "0. Salir");
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 1:
			System.out.println("Dime 2 numeros");
			int numsum = Integer.parseInt(sc.nextLine());
			int numsum2 = Integer.parseInt(sc.nextLine());
			System.out.println(Funciones1.suma(numsum, numsum2));
			break;
		case 2:
			System.out.println("Dime 2 numeros");
			int numres = Integer.parseInt(sc.nextLine());
			int numres2 = Integer.parseInt(sc.nextLine());
			System.out.println(Funciones2.resta(numres, numres2));
			break;

		case 3:
			System.out.println("Dime 2 numeros");
			int nummul = Integer.parseInt(sc.nextLine());
			int nummul2 = Integer.parseInt(sc.nextLine());
			System.out.println(Funciones2.multiplicar(nummul, nummul2));
			break;

		case 4:

			System.out.println("Dime 2 numeros");
			int numdiv = Integer.parseInt(sc.nextLine());
			int numdiv2 = Integer.parseInt(sc.nextLine());
			System.out.println(Funciones2.dividir(numdiv, numdiv2));
			break;

		case 5:
			System.out.println("Dime un numero");
			int numpar = Integer.parseInt(sc.nextLine());
			if (Funciones1.esPar(numpar) == true) {
				System.out.println("Es par");
			}

			else {
				System.out.println("No es par");
			}
			break;

		case 6:
			System.out.println("Dime un numero");
			int numImpar = Integer.parseInt(sc.nextLine());
			if (Funciones1.esPar(numImpar) == true) {
				System.out.println("Es impar");
			} else {
				System.out.println("No es impar");
			}
			break;

		case 7:
			System.out.println("Dime un numero");
			int numpos = Integer.parseInt(sc.nextLine());
			if (Funciones2.esPositivo(numpos) == true) {
				System.out.println("Es positivo");
			} else {
				System.out.println("No es positivo");
			}
			break;

		case 8:

			System.out.println("Dime un numero");
			int numneg = Integer.parseInt(sc.nextLine());
			if (Funciones2.esNegativo(numneg) == true) {
				System.out.println("Es negativo");
			} else {
				System.out.println("No es negativo");
			}
			break;

		default:
			System.out.println("Has salido");
			break;
		}

		while (num != 0)
			;

		sc.close();
	}

}
