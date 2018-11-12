
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author bibliols
 */
public class A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] mes = new String[13];
        mes[1] = "January";
        mes[2] = "February";
        mes[3] = "March";
        mes[4] = "April";
        mes[5] = "May";
        mes[6] = "June";
        mes[7] = "July";
        mes[8] = "August";
        mes[9] = "September";
        mes[10] = "October";
        mes[11] = "November";
        mes[12] = "December";

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] array = line.split("-");
        String dia = array[0];
        int mess = parseInt(array[1]);
        String ano = array[2];

        System.out.print(mes[mess] + " " + dia + ", " + ano);
    }

}
