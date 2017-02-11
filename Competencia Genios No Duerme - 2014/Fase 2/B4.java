
import java.util.Scanner;

public class B4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();
        String delimitador = " ";
        String[] numero = cadena.split(delimitador);
        int vectora[][] = new int[Integer.parseInt(numero[0])][Integer.parseInt(numero[1])];
        int vectorb[][] = new int[1][Integer.parseInt(numero[1])];
        int a = 2, b = 0;

        for (int i = 0; i < vectora.length; i++) {
            for (int j = 0; j < vectora[i].length; j++) {
                if (Integer.parseInt(numero[a]) == -1) {
                    vectorb[1][b] = Integer.parseInt(numero[a + 1]);
                    b++;
                } else {
                    vectora[i][j] = Integer.parseInt(numero[a]);
                }

                a++;
            }
        }

        for (int i = 0; i < vectorb.length; i++) {
            for (int j = 0; j < vectorb[i].length; j++) {
                System.out.println(vectorb[1][b]);
                b++;
            }
        }
    }
}
