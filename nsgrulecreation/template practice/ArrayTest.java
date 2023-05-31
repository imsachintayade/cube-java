
/* 
TestArr = [][][][][][][][][][]

input = 3

TestArr = [1][2][3][][][][][][][]
pos     =  0  1  2

3

0 1 2 - 3

2

3 4 - 2






import java.util.*;

public class ArrayTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] arr = {1,2,4,5,6,6,7,8,9};

		int arrlenght = arr.length;

		int pos = 0 ;

		System.out.println("Enter pos to check val : ");
		pos = sc.nextInt();

		System.out.println("Array value at "+pos+" is "+arr[pos]);

		for(int i = 0 ; i < arrlenght ; i++)
		{
			System.out.println("Array - "+arr[i]);
		}



		sc.close();
	}
}
*/

import java.util.*;

public class ArrayTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[20];

		int ol = 0;
		int il = 0;

		int val = 0 ;

		int pos = 0;

		int tostore = 0;

		System.out.println("for outer loop - ");
		ol = sc.nextInt();

		for(int i = 0 ; i < ol ; i++)
		{
			System.out.println("for inner loop - ");
			il = sc.nextInt();

			tostore += il;


			for(int j = 0 ; j < il ; j++)
			{
				System.out.println("enter values for array - ");
				arr[pos+j] = sc.nextInt();
			}

			pos = il;

		}

		for(int j = 0 ; j < tostore ; j++)
		{
			System.out.println("values for array - "+arr[j]);
			
		}



		sc.close();
	}
}













