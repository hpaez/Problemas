import static java.lang.Integer.parseInt;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author bibliols
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String line = sc.nextLine().trim();
        String[] array = line.split(" ");
        
        int y = calcular(new GregorianCalendar(parseInt(array[2]),parseInt(array[1]),parseInt(array[0])));
        
        if(y == -1){
            System.out.println("ERROR");
        }else{
            System.out.println(y);
        }
    }
    
     public static int calcular(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();
 
        // Cálculo de las diferencias.
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
 
        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.
 
        if(months < 0 // Aún no es el mes de su cumpleaños
           || (months==0 && days < 0)) { // o es el mes pero no ha llegado el día.
            years--;
        }
        
        return years;
    }
}
