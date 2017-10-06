
import java.util.ArrayList;
import java.util.Scanner;

public class B3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String aux = sc.nextLine();
            if (aux.equals("FIN")) {
                break;
            }
            list.add(aux);
        }
        int[] sss = new int[list.size()];
        int con = 0;
        for (String c : list) {
            float a = 0;
            while (c.contains(".")) {
                int pointer = c.indexOf(".");
                //ida
                int contL = 0;
                int contR = 0;
                for (int i = 1; i < c.length() - pointer; i++) {
                    if (isNum(c.charAt(pointer + i))) {
                        contR++;
                    } else {
                        break;
                    }
                }
                //vuelta
                for (int i = 1; i < pointer; i++) {
                    if (isNum(c.charAt(pointer - i))) {
                        contL++;
                    } else {
                        break;
                    }
                }
                String numa = c.substring(pointer - contL, pointer + contR + 1);
                a += Float.parseFloat(numa);
                c = c.replace(numa, "");
                con++;
            }
            for(char ca : c.toCharArray()){
                if(isNum(ca)){
                    a+= Integer.parseInt(ca+"");
                    con++;
                }
            }
            System.out.println(a +" "+con);
            con = 0;
        }
    }

    static boolean isNum(char n) {
        try {
            Integer.parseInt(n + "");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
