
import java.util.Scanner;


public class D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] posicion = input.split("");
        String letra = posicion[0];
        String numero = posicion[1];
        
        int[][] matriz = new int[8][8];
        String[][] tablero = new String[][]{
            new String[]{
                "a8","b8","c8","d8","e8","f8","g8","h8"
            },
            new String[]{
                "a7","b7","c7","d7","e7","f7","g7","h7"
            },
            new String[]{
                "a6","b6","c6","d6","e6","f6","g6","h6"
            },
            new String[]{
                "a5","b5","c5","d5","e5","f5","g5","h5"
            },
            new String[]{
                "a4","b4","c4","d4","e4","f4","g4","h4"
            },
            new String[]{
                "a3","b3","c3","d3","e3","f3","g3","h3"
            },
            new String[]{
                "a2","b2","c2","d2","e2","f2","g2","h2"
            },
            new String[]{
                "a1","b1","c1","d1","e1","f1","g1","h1"
            }
        };
        
        int fCaballo = Integer.parseInt(numero);
        fCaballo = Math.abs(fCaballo - 8);
        int cCaballo = 0;
        switch(letra){
            case "a":
                cCaballo = 0;
                break;
                case "b":
                cCaballo = 1;
                break;
                case "c":
                cCaballo = 2;
                break;
                case "d":
                cCaballo = 3;
                break;
                case "e":
                cCaballo = 4;
                break;
                case "f":
                cCaballo = 5;
                break;
                case "g":
                cCaballo = 6;
                break;
                case "h":
                cCaballo = 7;
                break;
        }
        
        //Check 1
        boolean necesitoComa = false;
        
        necesitoComa = CheckMovement(fCaballo, cCaballo, 1, 2, tablero, necesitoComa);
        necesitoComa = CheckMovement(fCaballo, cCaballo, 2, 1, tablero, necesitoComa);
        necesitoComa = CheckMovement(fCaballo, cCaballo, 2, -1, tablero, necesitoComa);
        necesitoComa = CheckMovement(fCaballo, cCaballo, 1, -2, tablero, necesitoComa);
        necesitoComa = CheckMovement(fCaballo, cCaballo, -1, -2, tablero, necesitoComa);
        necesitoComa = CheckMovement(fCaballo, cCaballo, -2, -1, tablero, necesitoComa);
        necesitoComa = CheckMovement(fCaballo, cCaballo, -2, 1, tablero, necesitoComa);
        necesitoComa = CheckMovement(fCaballo, cCaballo, -1, 2, tablero, necesitoComa);
    }
    private static boolean CheckMovement(int fCaballo, int cCaballo, int f, int c, String[][] tablero,  boolean necesitoComa){
        if (fCaballo + f < 8 && cCaballo + c < 8 && fCaballo + f >=0 && cCaballo + c >=0) {
            if (necesitoComa) {
                System.out.print(",");
            }else{
                necesitoComa = true;
            }
            System.out.print(tablero[fCaballo+f][cCaballo+c]);
        }
        return necesitoComa;
    }
}
