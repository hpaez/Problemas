
public class A1 {

    public static void main(String[] args) {
        String cadena = "BIENVENIDO AL CONCURSO DE PROGRAMACION 2013";
        String espacio = " ";
        int i;
        char[] texto = cadena.toCharArray();

        for (i = 0; i < texto.length; i++) {
            System.out.print(texto[i] + "\n");
            System.out.print(espacio);
            espacio = espacio.concat(" ");
        }
    }
}
