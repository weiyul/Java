//This simple code is able to copy a file to another newly created file
//The content of the old file will be shown on the console
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTextIO {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("FileTextIO.txt"));
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("FileTextIOCopy.txt"));
		
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}
		br.close();
		bw.close();
	}
	
}
