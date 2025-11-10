package p1_1;

public class P1_main {

	public static void main(String[] args) {
	// Variablen initialisieren
	int stockwerk = 2;
	
	if (stockwerk == -1) {
		System.out.println("Parkhaus");
	} else if (stockwerk ==0) {
			System.out.println("Angebote");
		} else if (stockwerk == 1) {
			System.out.println("Damenbekleidung");
		} else if (stockwerk == 2) {
			System.out.println("Herrenbekleidung");
		} else if (stockwerk == 3) {
			System.out.println("Kinderbekleidung");
		} else {
			System.out.println("unbekannt");
		}

	}

}
