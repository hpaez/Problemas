
import java.util.ArrayList;
import java.util.Scanner;

public class A7 {
    public void A7() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras1 = new ArrayList<>();
        ArrayList<String> palabras2 = new ArrayList<>();
        String[] palabra = {};
        int count = 0;
        
        while (true) {
            String line = sc.nextLine();
            if (line.equals("FIN")) {
                break;
            }
            palabra = line.split(" ");

            palabras1.add(palabra[0]);
            palabras2.add(palabra[0]);
        }
        
        for (int i = 0; i < palabra.length; i++) {
            count = 0;
            for (int j = 0; j < palabras2.size(); j++) {
                if(palabras1.get(i).equals(palabras2.get(j))){
                    count++;
                }
            }
            System.out.println(palabras1.get(i) + " " + count);
        }
    }
}
