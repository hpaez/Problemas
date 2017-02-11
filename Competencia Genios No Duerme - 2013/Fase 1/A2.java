
public class A2 {

    public static void main(String[] args) {
        for (int i = 99; i >= 0; i--) {
            if (i > 1) {
                System.out.println(i + " botellas de cerveza en la pared,");
                System.out.println(i + " botellas de cerveza.");
                System.out.println("Una se cayó");
                System.out.println("y quedaron " + (i - 1) + " botellas de cerveza en la pared.\n");
            } else if (i == 1) {
                System.out.println(i + " botellas de cerveza en la pared,");
                System.out.println(i + " botellas de cerveza.");
                System.out.println("Una se cayó");
                System.out.println("y no hay más botellas de cerveza en la pared.\n");
            } else {
                System.out.println("No hay botellas de cerveza en la pared,");
                System.out.println("no hay botellas de cerveza.");
                System.out.println("Hay que ir a la tienda y comprar más,");
                System.out.println("99 botellas de cerveza en la pared.");
                System.out.println("FIN");
            }
        }
    }
}
