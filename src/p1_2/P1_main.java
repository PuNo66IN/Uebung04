package p1_2;

public class P1_main {

	public static void main(String[] args) {
			// Variablen initialisieren
			int stockwerk = -2;
			
			if (stockwerk == -1) {
				System.out.println("Parkhaus");
			} else if (stockwerk ==0) {
					System.out.println("Angebote");
				} else if (stockwerk == 1) {
					System.out.println("Damenbekleidung");
					System.out.println("Angebote");
				} else if (stockwerk == 2) {
					System.out.println("Herrenbekleidung");
					System.out.println("Damenbekleidung");
					System.out.println("Angebote");
				} else if (stockwerk == 3) {
					System.out.println("Kinderbekleidung");
					System.out.println("Herrenbekleidung");
					System.out.println("Damenbekleidung");
					System.out.println("Angebote");
				} else {
					System.out.println("unbekannt");
				}

			}
	}
