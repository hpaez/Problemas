
public class A1 {

    public static void main(String[] args) {
        String cadena = "GENIOS NO DUERMEN";
        char[] texto = cadena.toCharArray();

        for (int i = texto.length - 1; i > -1; i--) {
            System.out.println(espacios(i) + texto[i]);
        }
    }

    static String espacios(int cantidad) {
        StringBuffer a = new StringBuffer();
        for (int i = 0; i < cantidad; i++) {
            a.append(' ');
        }
        return a.toString();
    }
}
