
import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        String vector[][] = new String[numero][numero];
        int i, j;

        for (i = 0; i < numero; i++) {
            for (j = 0; j < numero; j++) {
                if (i == 0 || i == (numero - 1)) {
                    vector[i][j] = "*";
                } else if (j == 0 || j == (numero - 1)) {
                    vector[i][j] = "*";
                } else {
                    vector[i][j] = " ";
                }
            }
        }

        for (i = 0; i < numero; i++) {
            for (j = 0; j < numero; j++) {
                System.out.print(vector[i][j]);
            }
            System.out.println("");
        }
    }
}
