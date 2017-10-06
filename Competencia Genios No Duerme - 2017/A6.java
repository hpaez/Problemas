
import java.util.Scanner;

public class A6 {
    public void A6(){
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine().trim();

        string = string.replace("Rgb", "Bl");
        string = string.replace("Rg", "Am");
        string = string.replace("Rb", "Ma");
        string = string.replace("Gb", "Ci");
        string = string.replace("R", "Ro");
        string = string.replace("G", "Ve");
        string = string.replace("B", "Az");

        System.out.println(string);
    }
}
