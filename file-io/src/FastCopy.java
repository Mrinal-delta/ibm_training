import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Copying file....
//File copied successfully in: 485 ms = 0.485s

public class FastCopy {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		BufferedInputStream inBuffer = null;
		BufferedOutputStream outBuffer = null;
		
		try {
		inFile = new FileInputStream("D:/Demo/sample.mp4");//18mb appx
		outFile = new FileOutputStream("D:/Demo/sample_fast_copy.mp4");
		inBuffer = new BufferedInputStream(inFile, 1024*16);//creating 16 kb buffers
		outBuffer = new BufferedOutputStream(outFile, 1024*16);
		
		System.out.println("Copying file....");
		int ch = 0;
		long ms1 = System.currentTimeMillis();
		while(true) {
			ch = inBuffer.read();//reading a byte from the stream
			if(ch== -1) break;
			outBuffer.write(ch);
		}
		long ms2 = System.currentTimeMillis();
		System.out.println("File copied successfully in: "+(ms2-ms1)+" ms");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inBuffer.close();
				outBuffer.close();
				inFile.close();
				outFile.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
