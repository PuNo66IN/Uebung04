package p2;

public class P2_main {

	public static void main(String[] args) {
	// Variabledeklaration
		int a=3,b=5,c=6;
		int intResult_a, intResult_b, intResult_c;
		double x=1.5,y=2.678;
		double doubleResult_d, doubleResult_e, doubleResult_f;
		
		//Rechnung (a)
		intResult_a = c-a*3;
		
		//Rechnung (b)
		intResult_b = c/b;

		
		//Rechnung (c)
		intResult_c = a+b/c;
		
		//Rechnung (d)
		doubleResult_d = c/b;
		
		//Rechnung (e)
		doubleResult_e = c+a/b;
		
		//Rechnung (f)
		doubleResult_f = (x+y*b);
		
		System.out.println("Ergebnis für Rechnung (a) ist: " + intResult_a);
		System.out.println("Ergebnis für Rechnung (b) ist: " + intResult_b);
		System.out.println("Ergebnis für Rechnung (c) ist: " + intResult_c);
		System.out.println("Ergebnis für Rechnung (d) ist: " + doubleResult_d);
		System.out.println("Ergebnis für Rechnung (e) ist: " + doubleResult_e);
		System.out.println("Ergebnis für Rechnung (f) ist: " + doubleResult_f);

	}

}
