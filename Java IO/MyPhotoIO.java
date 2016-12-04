

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyPhotoIO {

	public static void main(String[] args) {
		byte[] buffer= new byte[1024];
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {

			fis=new FileInputStream("C:\\Users\\Student\\Desktop\\01.jpg");
			fos=new FileOutputStream("C:\\Users\\Student\\Desktop\\02.jpg");
			int len=fis.read(buffer);
			while(len!=-1){
				fos.write(buffer, 0, len);
				len=fis.read(buffer);
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		
			if (fis !=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
