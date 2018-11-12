import java.util.Scanner;

/**
 *
 * @author hugo paez
 */
public class A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine().trim();
        String[] array = line.split(",");
        int count = 1;
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(count % 3 == 0){
                System.out.println("");
            } else {
                System.out.print(" ");
            }
            count++;
        }
    }
    
}
