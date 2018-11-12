
import java.util.Scanner;

public class C3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] matriz = new String[10][10];
        //Llenar
        for (int f = 0; f < 10; f++) {
            String input = sc.nextLine();
            String[] numerosString = input.split(" ");
            for (int c = 0; c < 10; c++) {
                matriz[f][c] = numerosString[c];
            }
        }
        //Calcular
        for (int i = 0; i < 5; i++) {
            //Cinco vueltas, cinco caminos
            boolean abajo = true;
            boolean primero = true;
            boolean necesitoEspacio = false;

            int f = i * 2;
            int c = 0;

            for (int j = 0; j < 10; j++) {
                if (primero) {
                    primero = false;

                    int numero = 0;
                    try {
                        numero = Integer.parseInt(matriz[f][c]);
                        if (numero >= 0) {
                            if (necesitoEspacio) {
                                System.out.print(" ");
                            } else {
                                necesitoEspacio = true;
                            }
                            System.out.print(numero);
                        }
                    } catch (Exception e) {

                    }
                } else {
                    if (abajo) {
                        abajo = false;
                        f++;
                        c++;
                        int numero = 0;
                        try {
                            numero = Integer.parseInt(matriz[f][c]);
                            if (numero >= 0) {
                                if (necesitoEspacio) {
                                    System.out.print(" ");
                                } else {
                                    necesitoEspacio = true;
                                }
                                System.out.print(numero);
                            }
                        } catch (Exception e) {

                        }
                    } else {
                        abajo = true;
                        f--;
                        c++;
                        int numero = 0;
                        try {
                            numero = Integer.parseInt(matriz[f][c]);
                            if (numero >= 0) {
                                if (necesitoEspacio) {
                                    System.out.print(" ");
                                } else {
                                    necesitoEspacio = true;
                                }
                                System.out.print(numero);
                            }
                        } catch (Exception e) {

                        }
                    }
                }
            }
            System.out.println("");
        }
    }
}
