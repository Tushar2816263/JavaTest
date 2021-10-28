import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileHandler objfh = new FileHandler();
		objfh.readBytesFromFile();

	}

}

class FileHandler
{
   
	public void readBytesFromFile()
	{
		File objfile = new File("e://input.txt");
		File objfile2 = new File("e://output.txt");
		
		try {
			FileInputStream fis = new FileInputStream(objfile);
			byte arrBytes[] = new byte[(int)objfile.length()];
			
			fis.read(arrBytes);
			
			String str = new String(arrBytes);
//			int data = Integer.parseInt(str);
			System.out.print(str);
			fis.close();
			
			
			
			
			FileOutputStream fos = new FileOutputStream(objfile2);
			
			
			fos.write(str.getBytes());
			
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
