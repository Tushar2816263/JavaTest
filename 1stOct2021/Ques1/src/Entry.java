import java.util.ArrayList;
import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<>();
		System.out.println("enter value of n");
		int n = scn.nextInt();
		
		Student std = null;
		
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter Student Name\n");
			
			String name = scn.nextLine();
			scn.nextLine();
			System.out.println("Enter Student Phone\n");
			String phone = scn.nextLine();
//			scn.nextLine();
			System.out.println("Enter Student Age");
			int age = scn.nextInt();
			std= new Student(name, phone, age);
			arr.add(std);
		}
		
		for(Student sd:arr)
		{
			if(sd.getAge() > 18)
			{
				System.out.println(sd.getPhone()+" "+sd.getAge()+" "+sd.getName());
			}
		}

	}

}
