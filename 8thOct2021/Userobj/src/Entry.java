import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner objscn = new Scanner(System.in);
		System.out.println("Enter User Name");
		String name = objscn.nextLine();
		System.out.println("Enter User Email");
		String email = objscn.nextLine();
		System.out.println("Enter User PhoneNo");
		String phone = objscn.nextLine();
		
		User user = new User(name,email,phone);
		System.out.println(user.getName()+" "+user.getEmail()+" "+user.getPhone());
		
	}

}
