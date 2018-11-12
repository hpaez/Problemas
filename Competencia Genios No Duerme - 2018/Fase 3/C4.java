
import java.util.Scanner;

public class C4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] todosNumeros = input.split(" ");
        int[] todosNumerosInt = new int[todosNumeros.length];
        for (int i = 0; i < todosNumeros.length; i++) {
            todosNumerosInt[i] = Integer.parseInt(todosNumeros[i]);
            //System.out.print(todosNumerosInt[i] + " ");
        }

        int filas = todosNumerosInt[0];
        int columnas = todosNumerosInt[1];
        int[][] matriz = new int[filas][columnas];

        //Llenar Matriz 
        int cIntIndex = 2;
        int cLlenar = 0;
        for (int f = 0; f < filas; f++) {

            for (int c = 0; c < columnas; c++) {
                matriz[f][cLlenar] = todosNumerosInt[cIntIndex];

                cLlenar++;
                cIntIndex++;

            }
            cLlenar = 0;
        }

        boolean encontrado = false;
        for (int f = 0; f < filas; f++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int c = 0; c < columnas; c++) {
                sumaFila += matriz[f][c];
            }
            //Revisar columnas
            for (int cRevisar = 0; cRevisar < columnas; cRevisar++) {
                sumaColumna = 0;
                for (int fRevisar = 0; fRevisar < filas; fRevisar++) {
                    sumaColumna += matriz[fRevisar][cRevisar];
                }
                if (sumaFila == sumaColumna) {
                    encontrado = true;
                    System.out.print(sumaFila + " = ");
                    for (int cPrint = 0; cPrint < columnas; cPrint++) {
                        System.out.print(matriz[f][cPrint]);
                        if (cPrint < columnas) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print(";");

                    for (int fila = 0; fila < filas; fila++) {
                        if (fila < filas) {
                            System.out.print(" ");
                        }
                        System.out.print(matriz[fila][cRevisar]);
                        
                    }
                    System.out.println("");
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.println("SIN PORCIONES EQUIVALENTES");
        }
    }
}
