import java.util.Scanner;

/**
 *
 * @author bibliols
 */
public class D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] c = new String[10][10];

        c[0][0] = "x";
        c[0][1] = "x";
        c[0][2] = "";
        c[0][3] = "";
        c[0][4] = "x";
        c[0][5] = "";
        c[0][6] = "";
        c[0][7] = "x";
        c[0][8] = "";
        c[0][9] = "x";

        c[1][0] = "x";
        c[1][1] = "x";
        c[1][2] = "x";
        c[1][3] = "x";
        c[1][4] = "";
        c[1][5] = "x";
        c[1][6] = "";
        c[1][7] = "x";
        c[1][8] = "x";
        c[1][9] = "";

        c[2][0] = "";
        c[2][1] = "";
        c[2][2] = "";
        c[2][3] = "x";
        c[2][4] = "";
        c[2][5] = "x";
        c[2][6] = "";
        c[2][7] = "x";
        c[2][8] = "";
        c[2][9] = "";

        c[3][0] = "x";
        c[3][1] = "x";
        c[3][2] = "x";
        c[3][3] = "x";
        c[3][4] = "";
        c[3][5] = "x";
        c[3][6] = "";
        c[3][7] = "";
        c[3][8] = "x";
        c[3][9] = "";

        c[4][0] = "x";
        c[4][1] = "x";
        c[4][2] = "x";
        c[4][3] = "x";
        c[4][4] = "";
        c[4][5] = "x";
        c[4][6] = "";
        c[4][7] = "x";
        c[4][8] = "x";
        c[4][9] = "";

        c[5][0] = "x";
        c[5][1] = "x";
        c[5][2] = "x";
        c[5][3] = "x";
        c[5][4] = "x";
        c[5][5] = "x";
        c[5][6] = "";
        c[5][7] = "";
        c[5][8] = "x";
        c[5][9] = "";

        c[6][0] = "";
        c[6][1] = "";
        c[6][2] = "x";
        c[6][3] = "x";
        c[6][4] = "";
        c[6][5] = "";
        c[6][6] = "";
        c[6][7] = "";
        c[6][8] = "";
        c[6][9] = "";

        c[7][0] = "";
        c[7][1] = "x";
        c[7][2] = "x";
        c[7][3] = "x";
        c[7][4] = "x";
        c[7][5] = "x";
        c[7][6] = "x";
        c[7][7] = "x";
        c[7][8] = "";
        c[7][9] = "";

        c[8][0] = "";
        c[8][1] = "x";
        c[8][2] = "";
        c[8][3] = "";
        c[8][4] = "x";
        c[8][5] = "";
        c[8][6] = "";
        c[8][7] = "x";
        c[8][8] = "x";
        c[8][9] = "x";

        c[9][0] = "x";
        c[9][1] = "x";
        c[9][2] = "x";
        c[9][3] = "";
        c[9][4] = "";
        c[9][5] = "x";
        c[9][6] = "x";
        c[9][7] = "x";
        c[9][8] = "";
        c[9][9] = "";

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] arrayPalabraBuscar = line.split(", ");
        int pos = 0;
        String[] posicion = new String[10];
        String[] palabra = new String[10];
        for (int ii = 0; ii < arrayPalabraBuscar.length; ii++) {
            String texto = arrayPalabraBuscar[ii];
            if(texto.length() <= 7){
                int cant_text = texto.length();
                int contador = 0;
                String pasar = "true";
                int pos_i = -1;
                int pos_j = -1;

                String auxTexto = "";
                for (int i = 0; i < 10; i++) {		// El primer índice recorre las columnas.
                    for (int j = 0; j < 10; j++) {	// El segundo índice recorre las filas.
                        if (c[i][j] == "x") {
                            contador = 0;
                            auxTexto = "";
                        } else {
                            contador++;
                            auxTexto += i + "," + j + ";";
                        }
                        if (contador == cant_text && pasar == "true") {
                            pos_i = i;
                            pos_j = j;
                            pasar = "false";
                            palabra[pos] = texto;
                            posicion[pos] = auxTexto.substring(0, auxTexto.length() - 1);
                            pos++;
                        }
                    }
                    contador = 0;
                    auxTexto = "";

                     if (pasar != "false") {
                        contador = 0;
                        auxTexto = "";

                        for (int o = 0; o < 10; o++) {		// El primer índice recorre las columnas.
                            for (int p = 0; p < 10; p++) {
                                if (c[p][o] == "x") {
                                    //System.out.print("x ");
                                    contador = 0;
                                    auxTexto = "";
                                } else {
                                    //System.out.print("- ");
                                    contador++;
                                    auxTexto += p + "," + o + ";";
                                }
                                if (contador == cant_text && pasar == "true") {

                                    pos_i = o;
                                    pos_j = p;
                                    pasar = "false";
                                    palabra[pos] = texto;
                                    posicion[pos] = auxTexto.substring(0, auxTexto.length() - 1);
                                    pos++;
                                }
                            }
                            contador = 0;
                            auxTexto = "";
                        }
                    }

                }
            }
        }

        for (int i = 0; i < posicion.length; i++) {
            if (palabra[i] != null) {
                System.out.println(palabra[i] + ": " + posicion[i]);
            }
        }
    }

}
