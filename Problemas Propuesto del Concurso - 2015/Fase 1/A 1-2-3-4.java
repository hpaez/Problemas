
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        A4();
    }

    public static void A1() {

        int[] mat;
        Scanner teclado = new Scanner(System.in);

        int cantidadBinario = teclado.nextInt();
        // System.out.print("Cuantas columnas tiene la matriz:");
        // int columnas=teclado.nextInt();
        mat = new int[cantidadBinario];
        for (int c = 0; c < cantidadBinario; c++) {

            mat[c] = teclado.nextInt();
        }

        int num = 0;
        for (int f = 0; f < mat.length; f++) {
            String enteroString = Integer.toString(mat[f]);
            num = num + Integer.parseInt(enteroString, 2);
        }

        System.out.println(num);
        // ma.imprimirUltimaFila();
    }

    public static void A2() {
        java.util.Scanner sc = new Scanner(System.in);

        int sumapar = 0, sumimpar = 0;

        while (sc.hasNextInt()) {
            int in = sc.nextInt();
            if (in == 0) {
                break;
            }

            if (in % 2 == 0) {
                sumapar += in;
            } else {
                sumimpar += in;
            }
        }

        if (sumapar > sumimpar) {
            System.out.print("Mandan los pares " + sumapar);
        } else {
            if (sumapar == sumimpar) {
                System.out.println("Nadie manda");
            } else {
                System.out.print("Mandan los impares " + sumimpar);
            }
        }
    }

    public static void A3() {
        Scanner sc = new Scanner(System.in);

        String r = sc.nextLine();
        String text = sc.nextLine();

        String r1 = r.substring(0, (r.length() - 1) / 2);
        String r2 = r.substring((r.length() - 1) / 2 + 1, r.length());

        String replacedtext = text;
        for (int i = 0, largo = r1.length(); i < largo; i++) {
            replacedtext = replacedtext.replace(r1.charAt(i), r2.charAt(i));
        }

        System.out.println(replacedtext);
    }

    public static void A4() {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] strs = line.split("\\s+");
        int[] parsed = new int[strs.length];

        int imax = 0;
        for (int i = 0, largo = strs.length; i < largo; i++) {
            parsed[i] = Integer.parseInt(strs[i]);
            if (parsed[i] % 2 == 0 && parsed[i] >= parsed[imax]) {
                imax = i;
            }
        }

        if (imax == 0 && parsed[0] % 2 == 1) {
            System.out.println("FIN");
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = imax + 1, largo = parsed.length; i < largo; i++) {
            if (parsed[i] % 2 == 0) {
                list.add(parsed[i]);
            }
        }

        Object[] sorted = list.toArray();
        Arrays.sort(sorted);

        String s = "";
        for (Object o : sorted) {
            s += (Integer) o + " ";
        }

        System.out.print(s.trim());
    }

}
