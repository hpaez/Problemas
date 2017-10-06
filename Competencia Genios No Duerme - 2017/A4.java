
import java.util.Scanner;

public class A5 {
    public void A5() {
         Scanner sc = new Scanner(System.in);
        
        int plata=sc.nextInt();
       int[] billetes = {20000, 10000, 5000, 2000, 1000, 500, 100, 50, 10};
        int[] cantbilletes = new int[billetes.length];
        for (int j = 0; j < billetes.length; j++) {
            
            cantbilletes[j] = plata / billetes[j];
            plata = plata % billetes[j];
            
        }
         for (int i = 0; i < cantbilletes.length; i++) {
            if (cantbilletes[i] != 0) {
                if (i <= 4) {
                    System.out.println(billetes[i]);
                    if(cantbilletes[i]==1){
                         System.out.println(cantbilletes[i] + " Billete");  
                    }else{
                     System.out.println(cantbilletes[i] + " Billetes");   
                    }
                    
                } else {
                    System.out.println(billetes[i]);
                    if(cantbilletes[i]==1){
                         System.out.println(cantbilletes[i] + " Moneda");  
                    }else{
                      System.out.println(cantbilletes[i] + " Monedas");  
                    }
                    
                }
                System.out.println();  
            }
            
        }
    }
    
}
