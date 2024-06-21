import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        // AREA DO X
        System.out.println("Xa:");
        x.a = sc.nextDouble();

        System.out.println("Xb:");
        x.b = sc.nextDouble();

        System.out.println("Xc:");
        x.c = sc.nextDouble();
        // FIM X

        // AREA DO Y
        System.out.println("Ya:");
        y.a = sc.nextDouble();
        System.out.println("Yb:");
        y.b = sc.nextDouble();
        System.out.println("Yc:");
        y.c = sc.nextDouble();
        // FIM Y

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area x: %.4f%n", areaX);
        System.out.printf("Area Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Area X maior");

        } else {
            System.out.println("Area y maior.");
        }

        sc.close();
    }
}
