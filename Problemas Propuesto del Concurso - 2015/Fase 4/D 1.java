
import java.util.Arrays;
import java.util.Scanner;

public class Ronda3 {

    public static void main(String[] args) {
        int[] dato = new int[25];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < dato.length; i++) {
            dato[i] = sc.nextInt();
        }

        Arrays.sort(dato);

        int[][] matr = new int[5][5];

        int dir = 0, px = 2, py = 2;

        for (int suma = 1, contdato = 0; contdato < dato.length; suma += 1) {
            for (int a = 0; a < 2 || contdato < dato.length; a++, contdato++) {
                matr[py][px] = dato[contdato];
                
                switch (dir) {
                    case 0:
                        dir = 1;
                        px -= suma;
                        break;
                    case 1:
                        dir = 2;
                        py += suma;
                        break;
                    case 2:
                        dir = 3;
                        px += suma;
                        break;
                    case 3:
                        dir = 0;
                        py -= suma;
                        break;
                }
                System.out.println("x" + px + "y" + py);
            }
        }

        for (int i = 0; i < matr.length; i++) {
            for (int e = 0; e < matr[i].length; e++) {
                System.out.print(matr[i][e] + " ");
            }
            System.out.println();
        }
    }

}
