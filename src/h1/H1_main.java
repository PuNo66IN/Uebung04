package h1;

public class H1_main {

	public static void main(String[] args) {
        int zone = 3;           // beliebiger Wert für Zone, z. B. 3
        double price;
        
               switch (zone) {
            case 1:
                price = 2.00;
                break;
            case 2:
                price = 2.00 + 0.35; // 0,35 Zuschlag
                break;
            case 3:
            case 4:
                price = 2.00 + 0.35 + 0.50; // 0.50 Zuschlag
                break;
            case 5:
                price = 2.00 + 0.35 + 0.50 + 0.70; // 0.70 Zuschlag
                break;
            default:
                price = 4.00;
                break;
            }
            System.out.printf("Für Zone %d beträgt der Ticketpreis: %.2f €%n", zone, price);
         }
	}

