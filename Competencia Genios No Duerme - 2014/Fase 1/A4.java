
import java.util.Scanner;

public class A4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        entrada = entrada.replaceAll("a", "@").replaceAll("A", "@");
        entrada = entrada.replaceAll("e", "3").replaceAll("E", "3");
        entrada = entrada.replaceAll("i", "1").replaceAll("I", "1");
        entrada = entrada.replaceAll("o", "X").replaceAll("O", "X");
        entrada = entrada.replaceAll("u", "V").replaceAll("U", "V");

        System.out.println(entrada);
    }
}
