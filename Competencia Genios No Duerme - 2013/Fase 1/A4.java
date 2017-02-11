
import java.util.Scanner;

public class A4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = sc.nextLine();
        String palabraInvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida = palabraInvertida + palabra.charAt(i);
        }

        if (palabra.equals(palabraInvertida)) {
            System.out.println("ES PALINDROMO");
        } else {
            System.out.println("NO ES PALINDROMO");
        }
    }
}
