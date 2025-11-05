import java.util.Scanner;

public class Utils {
    static Scanner sc;
    public static int validaInt() {
        while (!sc.hasNextInt()) {
            System.out.println("Eso no es un número válido.");
            sc.next(); // IMPORTANTE!
        }
        return sc.nextInt();
    }

    public static double validaDouble() {
        while (!sc.hasNextDouble()) {
            System.out.println("Eso no es un número válido.");
            sc.next(); // IMPORTANTE!
        }
        return sc.nextDouble();
    }
}