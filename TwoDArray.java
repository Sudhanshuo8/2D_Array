package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=sc.nextInt();
		System.out.println("Enter the no of columns");
		int column=sc.nextInt();
		
		System.out.println("enter the values");
		int[][] arr=new int[row][column];
		
		for(row=0;row<arr.length;row++)
		{
			for(column=0;column<arr[row].length;column++)
			{
				arr[row][column]=sc.nextInt();
			}
		}//printing
		for(row=0;row<arr.length;row++)
		{
			for(column=0;column<arr[row].length;column++)
			{
				System.out.print(arr[row][column]+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
