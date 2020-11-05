package p1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Carlos
 */
public class CirculoTest {
    //Caso de uso r=1
    @Test
	public void mainTestInput1() {
		String input="1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Circulo.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
		consoleOutput += "Circulo con radio 1.0,"+ System.getProperty("line.separator");
		consoleOutput += " la circunferencia es 6.283185307179586"+ System.getProperty("line.separator");
		consoleOutput += " y el area es 3.141592653589793."+ System.getProperty("line.separator");
		
		assertEquals(consoleOutput,out.toString());
	}
        //Caso de uso r=5
        
        //Caso de uso r=-1
        
        //Caso de uso r="abc"
    
}
