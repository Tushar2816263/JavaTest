import java.util.HashMap;
import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		HashMap<String, Object> map = new HashMap<>();
		
		 String fullname;
		 String phone;
		 String height;
		 String gender;
		 String maritalstatus;
		 
		 System.out.println("Enter full Name");
		 fullname = scn.nextLine();
		 System.out.println("Enter Phone Number");
		 phone = scn.nextLine();
		 System.out.println("Enter height");
		 height = scn.nextLine();
		 System.out.println("Enter Gender");
		 gender = scn.nextLine();
		 System.out.println("Enter Marital Status");
		 maritalstatus = scn.nextLine();
		 
		 
		 map.put("fullname", fullname);
		 map.put("phone", phone);
		 map.put("height", height);
		 map.put("gender", gender);
		 map.put("maritalstatus", maritalstatus);
		 
		 System.out.println(map);

	}

}
