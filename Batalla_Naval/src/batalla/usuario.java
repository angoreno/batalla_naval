package batalla;

import java.util.*;

/**
 * Clase principal
 * 
 * @author Isaac Pizarro C.
 * @version 1.0.0.v
 */

public class usuario {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		int cord1 = 0;
		int cord2 = 0;
		int info = 0;

		String n_jug;
		String letra;
		int[] cord;
		String[][] tab_at;
		String[][] tab_nv = null;
		String[][] tab = { { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" },
				{ "A", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
				{ "B", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
				{ "C", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
				{ "D", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
				{ "E", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
				{ "F", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
				{ "G", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
				{ "H", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
				{ "I", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
				{ "J", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" } };

		Scanner leo = new Scanner(System.in);
		jugador user = new jugador();
		tablero tabla = new tablero();
		user.asigna_tablas(tab);
		Barco barco = new Barco();

		System.out.println("        *****************************");
		System.out.println("        *****                   *****");
		System.out.println("        *****   BATALLA NAVAL   *****");
		System.out.println("        *****                   *****");
		System.out.println("        *****************************");

		System.out.println();

		// se le asigna el nombre a los jugadores
		user.asigna_nombre();

		for (int j = 1; j < 3; j++) {

			if (j == 1) {
				// Intrucciones jugador 1
				System.out.println("ALMIRANTE " + user.muestra_nombre(1));
				barco.info_barco();
				// se trae tabla para asignar barcos
				tab_nv = user.toma_tab_nav1();
			} else if (j == 2) {
				// Intrucciones jugador 2
				System.out.println("ALMIRANTE " + user.muestra_nombre(2));
				barco.info_barco();
				// se trae tabla para asignar barcos
				tab_nv = user.toma_tab_nav2();
			}

			// entrega la tabla a tablero para modificar
			tabla.as_tab(tab_nv);
			// muestra tablero
			tabla.muestra_tabla();
			// creacion de portaaviones en tablero
			cord = barco.creacion_pa();
			tabla.modifica_tabla(cord[0], cord[1], "pa");
			// creacion de 2 acorazados en tablero
			for (int i = 0; i < 2; i++) {
				cord = barco.creacion_ac();
				tabla.modifica_tabla(cord[0], cord[1], "ac");
			}
			// creacion de 3 buques en tablero
			for (int i = 0; i < 3; i++) {
				cord = barco.creacion_bq();
				tabla.modifica_tabla(cord[0], cord[1], "bq");
			}
			// creacion de 4 submarinos en tablero
			for (int i = 0; i < 4; i++) {
				cord = barco.creacion_sm();
				tabla.modifica_tabla(cord[0], cord[1], "sm");
			}
			// creacion de 5 lanchas en tablero
			for (int i = 0; i < 5; i++) {
				cord = barco.creacion_lc();
				tabla.modifica_tabla(cord[0], cord[1], "lc");
			}
			// guardar tablero
			tab_nv = tabla.save_tab();
			user.save_tab_nav1(tab_nv);
		} // fin for j

	}

}
