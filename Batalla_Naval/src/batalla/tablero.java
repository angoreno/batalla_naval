package batalla;

public class tablero {

	private String[][] tab;
	private int cord1 = 0;
	private int cord2 = 0;

	public tablero() {
	}

	public void as_tab(String[][] tab) {

		this.tab = tab;

	}

	// imprime el tablero en pantalla
	public void muestra_tabla() {

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				System.out.print("[" + tab[i][j] + "]");
			}
			System.out.println();
		}
	}

	// modifica la cordenada ingresada por el usuario
	public void modifica_tabla(int a, int b, String tipo) {

		switch (tipo) {
		case "pa":
			if (tab[a][b].equals("~") && tab[a + 1][b].equals("~") && tab[a + 2][b].equals("~")
					&& tab[a + 3][b].equals("~") && tab[a + 4][b].equals("~")) {
				//asignacion de portaaviones al tablero
				tab[a][b] = "P";
				tab[a + 1][b] = "P";
				tab[a + 2][b] = "P";
				tab[a + 3][b] = "P";
				tab[a + 4][b] = "P";
			}
			break;
		case "ac":
			if (tab[a][b].equals("~") && tab[a + 1][b].equals("~") && tab[a + 2][b].equals("~")
					&& tab[a + 3][b].equals("~")) {
				//asignacion de acorazado al tablero
				tab[a][b] = "A";
				tab[a + 1][b] = "A";
				tab[a + 2][b] = "A";
				tab[a + 3][b] = "A";
			}
			break;
		case "bq":
			if (tab[a][b].equals("~") && tab[a + 1][b].equals("~") && tab[a + 2][b].equals("~")) {
				//asignacion de buque al tablero
				tab[a][b] = "B";
				tab[a + 1][b] = "B";
				tab[a + 2][b] = "B";
			}
			break;
		case "sm":
			if (tab[a][b].equals("~") && tab[a + 1][b].equals("~")) {
				//asignacion de submarino al tablero
				tab[a][b] = "S";
				tab[a + 1][b] = "S";
			}
			break;
		case "lc":
			if (tab[a][b].equals("~")) {
				//asignacion de lancha al tablero
				tab[a][b] = "L";
			}
			break;
		}// fin switch

		muestra_tabla();

	}

	// entrega tabla para el guardado por jugador
	public String[][] save_tab() {
		return tab;
	}

	public void limpiar_pantalla() {
		for (int i = 0; i < 80; i++) {
			System.out.println();
		}
	}

}
