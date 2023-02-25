import java.util.*;

class Gravitacija {
    public static void main(String args[]) {
        System.out.println("OIS je zakonis");

        Scanner sc = new Scanner(System.in);

        final double C = 6.674e-11;
        final double M = 5.972e24;
        final double r = 6.371e6;
        double v = sc.nextDouble(); // visina

        double a = (C * M) / ((r + v) * (r + v));

        System.out.println(v + ", " + a);

    }
}
