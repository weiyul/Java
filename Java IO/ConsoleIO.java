//Cannot work on IDE, or it will throw NullPointrtException on line 14
//This class needs to work on Console, such as Windows Command Prompt etc.

import java.io.Console;
import java.io.IOException;


public class ConsoleIO {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		Console console = System.console();
		
		String line;
		try {
			line = console.readLine();
			while(line != null){
				System.out.println(line);
				line = console.readLine();
			}
		} catch (Exception e) {
			System.out.println("Inside catch");
			e.printStackTrace();
		}
		
	}

}
