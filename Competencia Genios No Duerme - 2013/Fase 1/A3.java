
import java.util.Scanner;

public class A3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        String delimitador = " ";
        String[] numero = entrada.split(delimitador);

        int numero1 = Integer.parseInt(numero[0]);
        int numero2 = Integer.parseInt(numero[1]);

        if (numero1 > numero2) {
            for (int i = numero2; i <= numero1; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
