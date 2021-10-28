
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = scn.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++)
		{
		    int num = scn.nextInt();
		    arr.add(num);
		}

		System.out.println(arr);
		
		List<Integer> arr2 =arr.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		List<Integer> arr3= arr.stream().map(num -> num*num*num).collect(Collectors.toList());
		System.out.println(arr2);
		System.out.println(arr3);
	}

}
