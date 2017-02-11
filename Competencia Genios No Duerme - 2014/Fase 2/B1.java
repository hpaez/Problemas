
import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();
        String delimitador = " ";
        String[] numero = cadena.split(delimitador);
        int vector[][] = new int[Integer.parseInt(numero[0])][Integer.parseInt(numero[1])];
        int a = 2;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = Integer.parseInt(numero[a]);
                a++;
            }
        }

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.print(vector[i][j] + " ");
            }
            System.out.println();
        }
    }
}
