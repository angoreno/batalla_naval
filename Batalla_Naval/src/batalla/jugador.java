package batalla;

import java.util.*;

public class jugador {

	int lanchas = 5;

	private String jug1;
	private String[][] tab_ataque1;
	private String[][] tab_naves1;
	private String jug2;
	private String[][] tab_ataque2;
	private String[][] tab_naves2;

	Scanner leo = new Scanner(System.in);

	public jugador() {

	}

	public void asigna_tablas(String[][] tab) {

		this.tab_ataque1 = tab;
		this.tab_ataque2 = tab;
		this.tab_naves1 = tab;
		this.tab_naves2 = tab;

	}

	// solicita y asigna nombre de los jugadores
	public void asigna_nombre() {

		for (int i = 1; i < 3; i++) {
			if (i == 1) {
				System.out.println("*******************************************");
				System.out.println("Ingrese nombre del Jugador " + i + ":");
				this.jug1 = leo.next();
				this.jug1=jug1.toUpperCase();
			} else if (i == 2) {
				System.out.println("*******************************************");
				System.out.println("Ingrese nombre del Jugador " + i + ":");
				this.jug2 = leo.next();
				this.jug2=jug2.toUpperCase();
			}
		}
	}

	// muestra nombre de jugador
	public String muestra_nombre(int jugador) {

		String jug = "";

		if (jugador == 1) {
			jug = this.jug1;
		} else if (jugador == 2) {
			jug = this.jug2;
		}

		return jug;
	}

	// entrega la tabla de ataque del jugador 1
	public String[][] toma_tab_ata1() {

		String[][] tab = this.tab_ataque1;
		return tab;
	}

	// guarda la tabla de ataque de jugador 1
	public void save_tab_ata1(String[][] tab) {
		this.tab_ataque1 = tab;
	}

	// entrega la tabla de ataque del jugador 2
	public String[][] toma_tab_ata2() {

		String[][] tab = this.tab_ataque2;
		return tab;
	}

	// guarda la tabla de ataque de jugador 2
	public void save_tab_ata2(String[][] tab) {
		this.tab_ataque1 = tab;
	}

	// entrega la tabla con las naves del jugador 1
	public String[][] toma_tab_nav1() {

		String[][] tab = this.tab_naves1;
		return tab;
	}

	// guarda la tabla de naves de jugador 1
	public void save_tab_nav1(String[][] tab) {
		this.tab_ataque1 = tab;
	}

	// entrega la tabla con las naves del jugador 2
	public String[][] toma_tab_nav2() {

		String[][] tab = this.tab_naves2;
		return tab;
	}

	// guarda la tabla de naves de jugador 2
	public void save_tab_nav2(String[][] tab) {
		this.tab_ataque1 = tab;
	}
}
