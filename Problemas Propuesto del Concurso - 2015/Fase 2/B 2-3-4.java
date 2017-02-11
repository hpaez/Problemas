
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class JavaApplication1 {

    public static void main(String[] args) {
        B4();
    }

    public static void B2() {
        Scanner sc = new Scanner(System.in);
        int cant = Integer.parseInt(sc.nextLine().trim());
        String[] palabras = new String[cant];

        for (int i = 0; i < cant; i++) {
            palabras[i] = sc.nextLine().trim();
        }

        String texto = sc.nextLine().trim();
        int count = 0;
        for (int i = 0; i < palabras.length; i++) {
            int lastIndex = 0;
            

            while (lastIndex != -1) {

                lastIndex = texto.indexOf(palabras[i], lastIndex);

                if (lastIndex != -1) {
                    count++;
                    lastIndex += palabras[i].length();
                }
            }
            
        }

        System.out.println(count);
    }

    static void B3() {
        Scanner sc = new Scanner(System.in);

        String[] instrucciones = sc.nextLine().split("\\s+");
        String[] numeros = sc.nextLine().split("\\s+");

        Stack<Integer> st = new Stack<>();

        for (int i = 0, largo = instrucciones.length; i < largo; i++) {
            int num = Integer.parseInt(numeros[i]);
            switch (instrucciones[largo - i - 1].trim()) {
                case "L":
                    st.push(num);
                    break;
                case "N":
                    break;
                case "E":
                    st.push(num + 2);
                    break;
                case "I":
                    st.push(num - 1);
                    break;
            }
        }

        String out = "";
        for (int i = 0, largo = st.size(); i < largo; i++) {
            out += st.pop() + " ";
        }

        System.out.println(out.trim());
    }

    static void B4() {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[sc.nextInt()][sc.nextInt()];
        for (int[] matriz1 : matriz) {
            for (int e = 0; e < matriz.length; e++) {
                matriz1[e] = sc.nextInt();
            }
        }

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int enc = -1;
        for (int i = 0; i < matriz.length; i++) {
            if (Arrays.equals(matriz[i], arr)) {
                enc = i;
                break;
            }
        }

        if (enc > -1) {
            System.out.println("FILA " + enc);
            return;
        }

        for (int i = 0; i < matriz[0].length; i++) {
            boolean a = true;
            for (int e = 0; e < matriz.length || e < arr.length; e++) {
                if (matriz[e][i] != arr[e]) {
                    a = false;
                }
            }
            if (a == true) {
                enc = i;
                break;
            }
        }

        if (enc > -1) {
            System.out.println("COLUMNA " + enc);
        }
    }

}
