package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
	     int array_length=sc.nextInt();
	     
	     System.out.println("Enter the values");
	int[] myarr=new int[array_length];
		for(int i=0;i<array_length;i++)
		{
			 myarr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(myarr));
	}

}
