import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//Copying file....
//File copied successfully in: 30 ms = 0.030s


public class CopyFastSuperDuper {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		
		
		try {
			inFile = new FileInputStream("D:/Demo/sample.mp4");//18mb appx
			outFile = new FileOutputStream("D:/Demo/sample_super_duper_fast_copy.mp4");
			inChannel = inFile.getChannel();
			outChannel = outFile.getChannel();
			
			ByteBuffer buffer = ByteBuffer.allocateDirect(1024*16);//creating 16kb common buffer
			System.out.println("Copying file....");
			long ms1 = System.currentTimeMillis();
			while(true) {
				int count = inChannel.read(buffer);
				if(count == -1) break;//placing cursor back to the star of the buffer
				buffer.flip();
				outChannel.write(buffer);
				buffer.clear();
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in: "+(ms2-ms1)+" ms");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inChannel.close();
				outChannel.close();
				inFile.close();
				outFile.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
