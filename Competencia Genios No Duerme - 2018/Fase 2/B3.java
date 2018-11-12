
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bibliols
 */
public class B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String line = sc.nextLine().trim();
 
        line = line.substring(0, line.length() - 1);
        
  
        
        line = line.substring(1);
        line = line.replace("},{", ";");
        
        
        
        String[] array = line.split(";");
        
        
        for (int i = 0; i <= array.length; i++) {
            for (int j = i+1; j <= array.length-1; j++) {
                //System.out.println(array[i].equals(array[j])); 
                if (array[i].equals(array[j]) ) {
                   //System.out.println("Se repite el num: " + array[j]);
                   array[j] = "x";
                }

            }
        }
        
        String a = "";
        int cant = 0;
        for (int i = 0; i < array.length; i++) { 
            if(array[i] != "x" ){
               a += "{"+array[i]+"},"; 
               cant++;
            }
        }
        
        a = a.substring(0, a.length() - 1);
 
        System.out.println(cant+" "+a);
    }
}
