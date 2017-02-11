
import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        entrada = entrada.replaceAll("\\\\t", "    ").replaceAll("\\\\n", "\r\n");

        System.out.println(entrada);
    }
}
