import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Copying file....
//File copied successfully in: 109559 ms = 109.559s


public class Copy {
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		try {
			inFile = new FileInputStream("D:/Demo/sample.mp4");//18mb appx
			outFile = new FileOutputStream("D:/Demo/sample_copy.mp4");
			System.out.println("Copying file....");
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while(true) {
				ch = inFile.read();//reading a byte from the stream
				if(ch== -1) break;
				outFile.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in: "+(ms2-ms1)+" ms");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inFile.close();
				outFile.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
