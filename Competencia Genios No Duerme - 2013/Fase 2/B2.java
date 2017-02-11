
import java.util.Scanner;

public class B2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int numeroActual = 0;
        int anterior = 1;
        int temporal;
        int cont = 0;

        while (true) {
            if (numeroActual % 2 == 0) {
                System.out.print(numeroActual + " ");
                cont++;
            }

            temporal = numeroActual;
            numeroActual = numeroActual + anterior;
            anterior = temporal;

            if (cont == numero) {
                break;
            }
        }
    }
}
