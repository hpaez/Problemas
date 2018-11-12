import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bibliols
 */
public class C1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        ArrayList<Codigo> codigos = new ArrayList<Codigo>();
        codigos.add(new Codigo("A",".-"));
        codigos.add(new Codigo("B","-..."));
        codigos.add(new Codigo("C","-.-."));
        codigos.add(new Codigo("D","-.."));
        codigos.add(new Codigo("E","."));
        codigos.add(new Codigo("F","..-."));
        codigos.add(new Codigo("G","--."));
        codigos.add(new Codigo("H","...."));
        codigos.add(new Codigo("I",".."));
        codigos.add(new Codigo("J",".---"));
        codigos.add(new Codigo("K","-.-"));
        codigos.add(new Codigo("L",".-.."));
        codigos.add(new Codigo("M","--"));
        codigos.add(new Codigo("N","-."));
        codigos.add(new Codigo("Ñ","--.--"));
        codigos.add(new Codigo("O","---"));
        codigos.add(new Codigo("P",".--."));
        codigos.add(new Codigo("Q","--.-"));
        
        codigos.add(new Codigo("R",".-."));
        codigos.add(new Codigo("S","..."));
        codigos.add(new Codigo("T","-"));
        codigos.add(new Codigo("U","..-"));
        codigos.add(new Codigo("V","...-"));
        codigos.add(new Codigo("W",".--"));
        codigos.add(new Codigo("X","-..-"));
        codigos.add(new Codigo("Y","-.--"));
        codigos.add(new Codigo("Z","--.."));
        
        codigos.add(new Codigo("1",".----"));
        codigos.add(new Codigo("2","..---"));
        codigos.add(new Codigo("3","...--"));
        codigos.add(new Codigo("4","....-"));
        codigos.add(new Codigo("5","....."));
        codigos.add(new Codigo("6","-...."));
        codigos.add(new Codigo("7","--..."));
        codigos.add(new Codigo("8","---.."));
        codigos.add(new Codigo("9","----."));
        codigos.add(new Codigo("0","-----"));
        
        String[] palabras = input.split("\\*");
       
        String salida = "";
        int palabraIndex = 0;
        for (String palabra : palabras) {
            String[] letras = palabra.split(" ");
            for (String letraMorse : letras) {
                for (Codigo codigo : codigos) {
                    if (codigo.morse.equals(letraMorse)) {
                        salida+= codigo.letra;
                    }
                }
            }
            palabraIndex++;
            if (palabraIndex < palabras.length) {
             salida+=" ";   
            }
        }
        System.out.println(salida);
    }
}

class Codigo{
    public String letra;
    public String morse;

    public Codigo(){

    }
    public Codigo(String _letra, String _morse){
        letra = _letra;
        morse = _morse;
    }
}
