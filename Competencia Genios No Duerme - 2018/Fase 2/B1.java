import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bibliols
 */
public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        
        ArrayList<Codigo> codigos = new ArrayList<Codigo>();
        codigos.add(new Codigo("A",65));
        codigos.add(new Codigo("B",66));
        codigos.add(new Codigo("C",67));
        codigos.add(new Codigo("D",68));
        codigos.add(new Codigo("E",69));
        codigos.add(new Codigo("F",70));
        codigos.add(new Codigo("G",71));
        codigos.add(new Codigo("H",72));
        codigos.add(new Codigo("I",73));
        codigos.add(new Codigo("J",74));
        codigos.add(new Codigo("K",75));
        codigos.add(new Codigo("L",76));
        codigos.add(new Codigo("M",77));
        codigos.add(new Codigo("N",78));
        codigos.add(new Codigo("O",79));
        codigos.add(new Codigo("P",80));
        codigos.add(new Codigo("Q",81));
        codigos.add(new Codigo("R",82));
        codigos.add(new Codigo("S",83));
        codigos.add(new Codigo("T",84));
        codigos.add(new Codigo("U",85));
        codigos.add(new Codigo("V",86));
        codigos.add(new Codigo("W",87));
        codigos.add(new Codigo("X",88));
        codigos.add(new Codigo("Y",89));
        codigos.add(new Codigo("Z",90));
        codigos.add(new Codigo(" ",32));
       
        String salida = "";
        String[] letras = palabra.split("");
        for (String letraMorse : letras) {
            for (Codigo codigo : codigos) {
                if (codigo.letra.equals(letraMorse)) {
                    salida+= codigo.asci;
                }
            }
        }
        System.out.print(salida);
    }
    
}

class Codigo{
    public String letra;
    public int asci;

    public Codigo(){

    }
    public Codigo(String _letra, int _asci){
        letra = _letra;
        asci = _asci;
    }
}
