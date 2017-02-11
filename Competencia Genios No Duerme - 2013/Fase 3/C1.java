
import java.util.Scanner;

public class C1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int columna = sc.nextInt();
        int fila = sc.nextInt();
        int ceros = 0;

        for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                int datos = sc.nextInt();

                if (datos == 0) {
                    ceros++;
                }
            }
        }

        System.out.println(ceros);
    }
}
