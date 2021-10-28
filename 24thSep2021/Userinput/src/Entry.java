import java.util.ArrayList;
import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n = scn.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Enter "+i+"th value");
			arr.add(scn.nextInt());
		}
		System.out.println(arr);
		
		

	}

}
