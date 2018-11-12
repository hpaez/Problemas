
import java.util.Scanner;
import javax.script.ScriptException;

public class D2 {

    public static void main(String[] args) throws ScriptException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] girosString = input.split(",");

        int limit20 = 15;
        int limit10 = 10;
        int limit5 = 20;
        int suma = 0;
        
        for (int i = 0; i < girosString.length; i++) {
            if(Integer.parseInt(girosString[i]) % 5000 == 0 && Integer.parseInt(girosString[i]) <= 200000){
                suma += Integer.parseInt(girosString[i]);
                suma = 500001;
            } else {
                suma = 500001;
            }
        }
        
        if(suma <= 500000){
            for (int giro = 0; giro < girosString.length; giro++) {
                int cant20 = 0;
                int cant10 = 0;
                int cant5 = 0;

                int montoInicial = Integer.parseInt(girosString[giro]);
                System.out.println("Giro" + (giro + 1));
                
                while (montoInicial / 20000 >= 1 && limit20 > 0) {
                    montoInicial -= 20000;
                    cant20++;
                    limit20--;
                }

                while (montoInicial / 10000 >= 1 && limit10 > 0) {
                    montoInicial -= 10000;
                    cant10++;
                    limit10--;
                }

                while (montoInicial / 5000 >= 1 && limit5 > 0) {
                    montoInicial -= 5000;
                    cant5++;
                    limit5--;
                }

                System.out.println("Billetes de 20 mil=" + cant20);
                System.out.println("Billetes de 10 mil=" + cant10);
                System.out.println("Billetes de 5 mil=" + cant5);
            }
        }
    }
}
