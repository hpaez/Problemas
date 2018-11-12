import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
/**
 *
 * @author bibliols
 */
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine().trim();
            String[] array = line.split(" ");
            
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            engine.put("X", 3);
            
            Object operation = engine.eval(line);
            
            
            System.out.print(operation);
        } catch (ScriptException ex) {
            Logger.getLogger(B2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
