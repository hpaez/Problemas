import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author bibliols
 */
public class C5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String[][] matriz = new String [7][7];
        
        Scanner sc = new Scanner(System.in);        
        String line = sc.nextLine().trim();
        String[] array = line.split(" "); 
        int giro = parseInt(array[0]);
        int n_f = parseInt(array[1]);
        int n_c = parseInt(array[2]);
        
        int Pos_s_1 = 0;
        int Pos_s_2 = 0;
        String[][] matriz = new String [n_f][n_c];
        for (int i = 0; i < n_f; i++) {  
            line = sc.nextLine().trim();
            array = line.split(" ");
            for (int j = 0; j < array.length; j++) {
                matriz[i][j]=array[j];
               
                if(array[j].equals("S") || array[j].equals("s") ){
                    Pos_s_1 = i;
                    Pos_s_2 = j;
                }
            }            
        }
        
        int suma = 0;
        String text = "";
        if(giro == 360 ){
            suma += parseInt(matriz[Pos_s_1][Pos_s_2-1]);
            suma += parseInt(matriz[Pos_s_1][Pos_s_2+1]);            
            suma += parseInt(matriz[Pos_s_1+1][Pos_s_2]);
            suma += parseInt(matriz[Pos_s_1-1][Pos_s_2]);
              suma += parseInt(matriz[Pos_s_1-1][Pos_s_2-1]);
            suma += parseInt(matriz[Pos_s_1-1][Pos_s_2+1]);            
            suma += parseInt(matriz[Pos_s_1+1][Pos_s_2-1]);
            suma += parseInt(matriz[Pos_s_1+1][Pos_s_2+1]);
            
            suma += parseInt(matriz[Pos_s_1][Pos_s_2-2]);
            suma += parseInt(matriz[Pos_s_1][Pos_s_2+2]);

            suma += parseInt(matriz[Pos_s_1-2][Pos_s_2]);
            suma += parseInt(matriz[Pos_s_1+2][Pos_s_2]);  
            
             text =  parseInt(matriz[Pos_s_1-2][Pos_s_2]) +" "+
                    parseInt(matriz[Pos_s_1-1][Pos_s_2-1]) +" "+
                    parseInt(matriz[Pos_s_1-1][Pos_s_2]) +" "+
                    parseInt(matriz[Pos_s_1-1][Pos_s_2+1]) +" "+
                    
                    parseInt(matriz[Pos_s_1][Pos_s_2-2]) +" "+
                    parseInt(matriz[Pos_s_1][Pos_s_2-1]) +" "+
                    parseInt(matriz[Pos_s_1][Pos_s_2+1]) +" "+
                    parseInt(matriz[Pos_s_1][Pos_s_2+2]) +" "+
                    
                    parseInt(matriz[Pos_s_1+1][Pos_s_2-1]) +" "+
                    parseInt(matriz[Pos_s_1+1][Pos_s_2]) +" "+
                    parseInt(matriz[Pos_s_1+1][Pos_s_2+1]) +" "+
                    parseInt(matriz[Pos_s_1+2][Pos_s_2]);
        }
        
        if(giro == 180 ){
            
            suma += parseInt(matriz[Pos_s_1-1][Pos_s_2-1]);
            suma += parseInt(matriz[Pos_s_1-1][Pos_s_2+1]);            
            suma += parseInt(matriz[Pos_s_1+1][Pos_s_2-1]);
            suma += parseInt(matriz[Pos_s_1+1][Pos_s_2+1]);
            
            suma += parseInt(matriz[Pos_s_1][Pos_s_2-2]);
            suma += parseInt(matriz[Pos_s_1][Pos_s_2+2]);

            suma += parseInt(matriz[Pos_s_1-2][Pos_s_2]);
            suma += parseInt(matriz[Pos_s_1+2][Pos_s_2]);         
                              
            text =  parseInt(matriz[Pos_s_1+2][Pos_s_2]) +" "+
                    parseInt(matriz[Pos_s_1+1][Pos_s_2+1]) +" "+
                    parseInt(matriz[Pos_s_1+1][Pos_s_2-1]) +" "+
                    parseInt(matriz[Pos_s_1][Pos_s_2+2]) +" "+
                    parseInt(matriz[Pos_s_1][Pos_s_2-2]) +" "+
                    parseInt(matriz[Pos_s_1-1][Pos_s_2+1]) +" "+
                    parseInt(matriz[Pos_s_1-1][Pos_s_2-1])+" "+
                    parseInt(matriz[Pos_s_1-2][Pos_s_2]);
            
        }
        
        if(giro == 90 ){           
            suma += parseInt(matriz[Pos_s_1][Pos_s_2-1]);
            suma += parseInt(matriz[Pos_s_1][Pos_s_2+1]);            
            suma += parseInt(matriz[Pos_s_1+1][Pos_s_2]);
            suma += parseInt(matriz[Pos_s_1-1][Pos_s_2]);
            
            text =  parseInt(matriz[Pos_s_1][Pos_s_2+1]) +" "+
                     parseInt(matriz[Pos_s_1-1][Pos_s_2]) +" "+ 
                     parseInt(matriz[Pos_s_1+1][Pos_s_2]) +" "+ 
                     parseInt(matriz[Pos_s_1][Pos_s_2-1]);            
        }
        
        
        
         System.out.println(suma+" "+text);
         
        
        
    }
    
}