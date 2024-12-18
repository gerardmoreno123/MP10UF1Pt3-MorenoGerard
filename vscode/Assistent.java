import java.util.Scanner;

public class Assistent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número no pot ser negatiu.");
            scanner.close();
            return;
        }

        String binari = Integer.toBinaryString(numero);
        System.out.println("La versió binàri del número és: " + binari);
        scanner.close();
    }
}
