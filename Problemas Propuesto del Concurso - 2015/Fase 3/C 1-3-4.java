
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ronda3 {

    public static void main(String[] args) {
        C4();
    }

    static void C1() {
        String abc = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";
        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();
        int avance = sc.nextInt();

        String generated = "";

        for (int i = 0, largo = texto.length(); i < largo; i++) {
            int idx = abc.indexOf(texto.charAt(i));

            if (idx + avance >= abc.length() || idx + avance < 0) {
                idx = idx + (avance % abc.length());
            } else {
                idx = idx + avance;
            }

            generated += abc.charAt(idx) + "";
        }

        System.out.println(generated);
    }

    static void C3() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            String t = sc.nextLine();
            if ("null".equals(t)) {
                break;
            } else {
                lista.add(t);
            }
        }

        String[] days = {"nadajeje", "DOMINGO", "LUNES", "MARTES", "MIERCOLES",
            "JUEVES", "VIERNES", "SABADO"};
        for (int i = 0, largo = lista.size(); i < largo; i++) {
            String[] fecha = lista.get(i).split("/");

            Calendar c = Calendar.getInstance();
            c.clear();

            c.set(Integer.parseInt(fecha[0]),
                    Integer.parseInt(fecha[1]),
                    Integer.parseInt(fecha[2]), 12, 0, 0);

            System.out.println(days[c.get(Calendar.DAY_OF_WEEK)]);
        }
    }

    static void C4() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Boolean> arr = new ArrayList<>();

        while (true) {
            int num1 = sc.nextInt();
            if (num1 == -1) {
                break;
            }

            int num2 = sc.nextInt();

            // num1
            int maxD = (int) Math.sqrt(num1);
            int sum = 1;
            for (int i = 2; i <= maxD; i++) {
                if (num1 % i == 0) {
                    sum += i;
                    int d = num1 / i;
                    if (d != i) {
                        sum += d;
                    }
                }
            }

            // num2
            int maxD2 = (int) Math.sqrt(num2);
            int sum2 = 1;
            for (int i = 2; i <= maxD2; i++) {
                if (num2 % i == 0) {
                    sum2 += i;
                    int d = num2 / i;
                    if (d != i) {
                        sum2 += d;
                    }
                }
            }

            arr.add(sum == num2 && sum2 == num1);
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)) {
                System.out.println("SON NUMEROS AMIGOS");
            } else {
                System.out.println("FALLO");
            }
        }
    }
}
