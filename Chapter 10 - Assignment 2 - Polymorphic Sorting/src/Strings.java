//**********************************************************
//  Numbers.java
//
//  Demonstrates selectionSort on an array of strings.
//**********************************************************
import java.util.Scanner;
public class Strings
{
	//---------------------------------------------
	//  Reads in an array of strings, sorts them,
	//  then prints them in sorted order.
	//---------------------------------------------
	public static void main (String[] args)
	{
		String[] stringList;
		int size;

		Scanner scan = new Scanner(System.in);

		System.out.print ("\nHow many strings do you want to sort? ");
		size = scan.nextInt();
		stringList = new String[size];

		System.out.println ("\nEnter the strings...");
		for (int i = 0; i < size; i++)
			stringList[i] = scan.next();

		//First Method of Descending
		Sorting.insertionSort(stringList);


		System.out.println ("\nYour strings in sorted order...");

		for (int i = 0; i < size; i++)
			System.out.print(stringList[i] + "  ");

		System.out.println();
		
		//Second Method of Descending
		Sorting.insertionSort2(stringList);


		System.out.println ("\nYour strings in sorted order...");

		for (int i = 0; i < size; i++)
			System.out.print(stringList[i] + "  ");

		System.out.println();
		
	}



}