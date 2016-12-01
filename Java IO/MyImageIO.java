// This application is able to read an image file and write this file into another new image file
// The console will print out bytes of the original pic and the copy one's into the format, original bytes: copy bytes
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyImageIO {

	public static void main(String[] args) throws Exception {
		File input=new File("ReaderWriterPicture.jpg");
		byte[] buffer= new byte[(int)input.length()];
		FileInputStream fis= new FileInputStream(input);
		int len=fis.read(buffer);
		System.out.println(len+":"+buffer.length);
		fis.close();
		FileOutputStream fos = new FileOutputStream("MyImageIO.jpg");
		fos.write(buffer);
		fos.close();
	}

}
