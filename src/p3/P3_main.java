package p3;

public class P3_main {

	public static void main(String[] args) {
        boolean[] values = {true, false};

        System.out.printf("%-8s %-8s %-22s %-14s %-14s %-22s%n", "x", "y", "!(x!=y && x==y)", "x || true", "x && false", "(x&&!y)||(!x)");
        for (boolean x : values) {
            for (boolean y : values) {
                boolean a = !(x != y && x == y);
                boolean b = x || true;
                boolean c = x && false;
                boolean d = (x && !y) || (!x);
                System.out.printf("%-8s %-8s %-22s %-14s %-14s %-22s%n", x, y, a, b, c, d);
            }
        }
	}
}
