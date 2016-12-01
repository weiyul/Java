//read characters from file

import java.io.BufferedReader;
import java.io.FileReader;


public class BufferReader {

	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new FileReader("BufferReader.txt"));
		boolean b=br.ready();

		
		int c=br.read();
		while(c!=-1){
			System.out.print((char)c);
			c=br.read();
		}
		/*String line= br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}*/
		br.close();
	}

}
