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
			portaavion(a, b);
			break;
		case "ac":
			acorazado(a, b);
			break;
		case "bq":
			buque(a, b);
			break;
		case "sm":
			submarin(a, b);
			break;
		case "lc":
			lancha(a,b);
			break;
		}// fin switch

		muestra_tabla();

	}

	// Asigna lancha a tablero
	public void lancha(int a, int b) {

		if (tab[a][b].equals("~")) {
			tab[a][b] = "L";
		}
	}

	// Asigna submarino a tablero
	public void submarin(int a, int b) {

		if (tab[a][b].equals("~") && tab[a + 1][b].equals("~")) {
			tab[a][b] = "S";
			tab[a + 1][b] = "S";
		}
	}

	// Asigna buque a tablero
	public void buque(int a, int b) {

		if (tab[a][b].equals("~") && tab[a + 1][b].equals("~") && tab[a + 2][b].equals("~")) {
			tab[a][b] = "B";
			tab[a + 1][b] = "B";
			tab[a + 2][b] = "B";
		}
	}

	//Asigna acorazado a tablero
	public void acorazado(int a, int b) {

		if (tab[a][b].equals("~") && tab[a + 1][b].equals("~") && tab[a + 2][b].equals("~")
				&& tab[a + 3][b].equals("~")) {
			tab[a][b] = "A";
			tab[a + 1][b] = "A";
			tab[a + 2][b] = "A";
			tab[a + 3][b] = "A";
		}
	}
	//asigna portaaviones a tablero
	public void portaavion(int a, int b) {

		if (tab[a][b].equals("~") && tab[a + 1][b].equals("~") && tab[a + 2][b].equals("~") 
				&& tab[a + 3][b].equals("~")&& tab[a + 4][b].equals("~")) {

			tab[a][b] = "P";
			tab[a + 1][b] = "P";
			tab[a + 2][b] = "P";
			tab[a + 3][b] = "P";
			tab[a + 4][b] = "P";
		}
	}
	//entrega tabla para el guardado por jugador
	public String [][] save_tab(){
		return tab;
	}

	public void limpiar_pantalla() {
		for (int i = 0; i < 80; i++) {
			System.out.println();
		}
	}

}
