import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A3 {
    public void A3() {
        Scanner sc = new Scanner(System.in);
        
        String line1 = sc.nextLine().trim();
        String line2 = sc.nextLine().trim();
        String line3 = sc.nextLine().trim();
        
        List<String> linea = new ArrayList<String>();
        
        int index = 0;
        while (index < line1.length()) {
            linea.add(line1.substring(index, Math.min(index + 2,line1.length())));
            linea.add(line2.substring(index, Math.min(index + 2,line2.length())));
            linea.add(line3.substring(index, Math.min(index + 2,line3.length())));
            index += 2;
        }
        
        int ro = 0, ve = 0, az = 0, na = 0, am = 0, bl = 0;
        
        for (int i = 0; i < linea.size(); i++) {
            if(linea.get(i).equals("RO") ){
                ro++;
            }
            
            if (linea.get(i).equals("VE")) {
                ve++;
            }
            
            if (linea.get(i).equals("AZ")) {
                az++;
            }
            
            if (linea.get(i).equals("NA")) {
                na++;
            }
            
            if (linea.get(i).equals("AM")) {
                am++;
            }
            
            if(linea.get(i).equals("BL")) {
                bl++;
            }
        }
        
        if(ro > 0){
            System.out.println("ROJO: " + ro);
        }
        if(ve > 0){
            System.out.println("VERDE: " + ve);
        }
        if(az > 0){
            System.out.println("AZUL: " + az);
        }
        if(na > 0){
            System.out.println("NARANJO: " + na);
        }
        if(am > 0){
            System.out.println("AMARILLO: " + am);
        }
        if(bl > 0){
            System.out.println("BLANCO: " + bl);
        }
    }
}
