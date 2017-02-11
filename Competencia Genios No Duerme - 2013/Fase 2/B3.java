
import java.util.Scanner;

public class B3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String busqueda = sc.nextLine();
        String parrafo = "";

        while (true) {
            String texto = sc.nextLine();

            if (texto.equals("FIN")) {
                System.out.println(parrafo);
                break;
            }

            if (texto.contains(" " + busqueda + " ")) {
                parrafo = parrafo.concat("\n" + texto);
            }
        }
    }
}
