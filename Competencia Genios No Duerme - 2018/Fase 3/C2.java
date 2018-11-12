
import java.util.ArrayList;
import java.util.Scanner;

public class C2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        ArrayList<Codigo> codigos = new ArrayList<Codigo>();
        codigos.add(new Codigo("a",".-"));
        codigos.add(new Codigo("b","-..."));
        codigos.add(new Codigo("c","-.-."));
        codigos.add(new Codigo("d","-.."));
        codigos.add(new Codigo("e","."));
        codigos.add(new Codigo("f","..-."));
        codigos.add(new Codigo("g","--."));
        codigos.add(new Codigo("h","...."));
        codigos.add(new Codigo("i",".."));
        codigos.add(new Codigo("j",".---"));
        codigos.add(new Codigo("k","-.-"));
        codigos.add(new Codigo("l",".-.."));
        codigos.add(new Codigo("m","--"));
        codigos.add(new Codigo("n","-."));
        //codigos.add(new Codigo("ñ","--.--"));
        codigos.add(new Codigo("o","---"));
        codigos.add(new Codigo("p",".--."));
        codigos.add(new Codigo("q","--.-"));
        
        codigos.add(new Codigo("r",".-."));
        codigos.add(new Codigo("s","..."));
        codigos.add(new Codigo("t","-"));
        codigos.add(new Codigo("u","..-"));
        codigos.add(new Codigo("v","...-"));
        codigos.add(new Codigo("w",".--"));
        codigos.add(new Codigo("x","-..-"));
        codigos.add(new Codigo("y","-.--"));
        codigos.add(new Codigo("z","--.."));
        
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
        
        codigos.add(new Codigo(":","---..."));
        codigos.add(new Codigo(",","--..--"));
        codigos.add(new Codigo(";","-.-.-."));
        codigos.add(new Codigo("?","..--.."));
        codigos.add(new Codigo("\"",".-..-."));
        
        codigos.add(new Codigo("Error","........"));
        codigos.add(new Codigo("Esperar",".-..."));
        codigos.add(new Codigo("Fin de mensaje",".-.-."));
        
        String[] palabras = input.split(" / ");
       
        String salida = "";
        int palabraIndex = 0;
        for (String palabra : palabras) {
            String[] letras = palabra.split(" ");
            boolean seEncontro = false;
            for (String letraMorse : letras) {
                seEncontro = false;
                for (Codigo codigo : codigos) {
                    if (codigo.morse.equals(letraMorse)) {
                        salida+= codigo.letra;
                        seEncontro = true;
                    }
                }
                if (!seEncontro) {
                    salida+="pasapalabra";
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
