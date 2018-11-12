
import java.util.Scanner;

/**
 *
 * @author bibliols
 */
public class A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String line = sc.nextLine().trim();
        
        if(line.length() > 3 && line.length() <= 20){
            for (int i = line.length()-1; i >= 0; i--) {
                System.out.print(line.charAt(i));
            }
        }
    }
}
