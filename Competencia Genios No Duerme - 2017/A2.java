
import java.util.Scanner;

public class A2 {
    public void A2() {
        Scanner sc = new Scanner(System.in);
          int x;
        
        do{
         x =sc.nextInt();
        }while(x<10||x>30);
        
        int altura=8;
        dibujaEscalera(altura,x);
       
   }
    public static void dibujaEscalera (int altura,int x){
        int cont=1;
        for (int j=1;j<=altura;j++){
            for(int i=0;i<j;i++){
                System.out.print(x+cont+" ");
                cont++;
            }
            System.out.println(x+cont+" ");
            cont++;
        }
    }
}