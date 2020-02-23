package batalla;

import java.util.*;

public class Barco {

	private int portavion = 5;
	private int acorazado = 4;
	private int buque = 3;
	private int submarin = 2;
	private int lancha = 1;

	private String pos_barco;
	Scanner leo = new Scanner(System.in);

	public Barco() {

	}

	public void info_barco() {

		System.out.println();
		System.out.println("*************************************************");
		System.out.println();
		System.out.println("       ***** UBICACION DE FLOTA *****");
		System.out.println();
		System.out.println("*************************************************");
		System.out.println("Los barcos a ingresar son los siguientes:");
		System.out.println("*************************************************");
		System.out.println("1.- Portaviones, 5 posiciones, cantidad 1");
		System.out.println("2.- Acorazados, 4 posiciones, cantidad 2");
		System.out.println("3.- Buques, 3 posiciones, cantidad 3");
		System.out.println("4.- Submarino, 2 posiciones, cantidad 4");
		System.out.println("5.- Lancha, 1 pisicion, cantidad 5");
		System.out.println("*************************************************");
		System.out.println("Todos los barcos se ingresaran de forma vertical");
		System.out.println("Para asignar una posicion, debes ingresar la");
		System.out.println("coordenada que corresponde a una letra y un numero.");
		System.out.println("*************************************************");
	}

	public int let_num(String letra) {

		int cord1 = 0;
		switch (letra) {
		case "a":
			cord1 = 1;
			letra = "";
			break;
		case "b":
			cord1 = 2;
			letra = "";
			break;
		case "c":
			cord1 = 3;
			letra = "";
			break;
		case "d":
			cord1 = 4;
			letra = "";
			break;
		case "e":
			cord1 = 5;
			letra = "";
			break;
		case "f":
			cord1 = 6;
			letra = "";
			break;
		case "g":
			cord1 = 7;
			letra = "";
			break;
		case "h":
			cord1 = 8;
			letra = "";
			break;
		case "i":
			cord1 = 9;
			letra = "";
			break;
		case "j":
			cord1 = 10;
			letra = "";
			break;
		}// fin switch

		return cord1;
	}

	public int[] creacion_pa() {

		int cord1 = 0;
		int cord2 = 0;
		int rep = 0;

		System.out.println("Ingresar coordenada para el Portaaviones:");

		/*
		 * repetira en caso de que la letra ingresada deje la nave fuera de la matriz la
		 * letra debe estar siempre dentro de la A y la F en el caso del portaaviones.
		 */
		do {
			cord1 = verif_lcord();
			if (cord1 < 7) {
				rep = 0;
			} else if (cord1 > 4) {
				System.out.println("Nave queda fuera de tablero,");
				System.out.println("Elegir una letra menor");
				rep = 1;
			}
		} while (rep == 1);
		cord2 = verif_ncord();
		int[] cord = { cord1, cord2 };

		return cord;
	}

	public int[] creacion_ac() {

		int cord1 = 0;
		int cord2 = 0;
		int rep = 0;

		System.out.println("Ingresar coordenada para los Acorazados:");
		do {
			cord1 = verif_lcord();
			if (cord1 < 8) {
				rep = 0;
			} else if (cord1 > 3) {
				System.out.println("Nave queda fuera de tablero,");
				System.out.println("Elegir una letra menor");
				rep = 1;
			}
		} while (rep == 1);
		cord2 = verif_ncord();
		int[] cord = { cord1, cord2 };

		return cord;
	}

	public int[] creacion_bq() {

		int cord1 = 0;
		int cord2 = 0;
		int rep=0;

		System.out.println("Ingresar coordenada para los Buques:");
		do {
			cord1 = verif_lcord();
			if (cord1 < 9) {
				rep = 0;
			} else if (cord1 > 2) {
				System.out.println("Nave queda fuera de tablero,");
				System.out.println("Elegir una letra menor");
				rep = 1;
			}
		} while (rep == 1);
		cord2 = verif_ncord();
		int[] cord = { cord1, cord2 };

		return cord;
	}

	public int[] creacion_sm() {

		int cord1 = 0;
		int cord2 = 0;
		int rep=0;

		System.out.println("Ingresar coordenada para los Submarinos:");
		do {
			cord1 = verif_lcord();
			if (cord1 < 10) {
				rep = 0;
			} else if (cord1 > 1) {
				System.out.println("Nave queda fuera de tablero,");
				System.out.println("Elegir una letra menor");
				rep = 1;
			}
		} while (rep == 1);
		cord2 = verif_ncord();
		int[] cord = { cord1, cord2 };

		return cord;
	}

	public int[] creacion_lc() {

		int cord1 = 0;
		int cord2 = 0;
		int rep = 0;

		System.out.println("Ingresar coordenada para las Lanchas:");
		do {
			cord1 = verif_lcord();
			if (cord1 < 11) {
				rep = 0;
			} else if (cord1 > 0) {
				System.out.println("Nave queda fuera de tablero,");
				System.out.println("Elegir una letra menor");
				rep = 1;
			}
		} while (rep == 1);
		cord2 = verif_ncord();
		int[] cord = { cord1, cord2 };

		return cord;
	}

	public int verif_lcord() {

		int valor = 0;
		int rep = 0;
		String[] verif = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

		do {
			System.out.println("Ingresar letra:");
			String letra = leo.next();

			for (int i = 0; i < verif.length; i++) {
				if (letra.equals(verif[i])) {
					valor = let_num(letra);
					rep = 0;
					break;
				} else {
					rep = 1;
				}
			}
			if (rep == 1) {
				System.out.println("Letra ingresasa invalida");
			}

		} while (rep == 1);
		return valor;
	}

	public int verif_ncord() {

		int rep = 0;
		int valor = 0;
		String num = "";
		String[] verif = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		do {
			System.out.println("Ingresar numero:");
			num = leo.next();
			for (int i = 0; i < verif.length; i++) {
				if (num.equals(verif[i])) {
					valor = Integer.parseInt(num);
					rep = 0;
					break;
				} else {
					rep = 1;
				}
			}
			System.out.println("Numero ingresado no valido");
		} while (rep == 1);
		return valor;
	}

}
