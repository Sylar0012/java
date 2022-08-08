package ex22;

import java.util.ArrayList;

public class GenericEx02 {

	public static void main(String[] args) {
		
		int [] a = new int [3];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		for (int i =0; i<a.length; i++)
			System.out.println(a[i]);
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		
		for (int i =0; i<arr1.size(); i++)
			System.out.println(arr1.get(i));
		
		
		ArrayList<String> arr2 = new ArrayList<>();
		
		arr2.add("가");
		arr2.add("나");
		arr2.add("다");
		
		for (int i =0; i<arr2.size(); i++)
			System.out.println(arr2.get(i));
		
	}
}
