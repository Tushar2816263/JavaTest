import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("e://demo.txt");
		
		User user = new User("tushar","arora@gmail.com","7056901235");
		System.out.println(user.toString());
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(fos);
		
			dos.writeUTF(user.toString());
			fos.close();
			dos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		
		

	}

}
