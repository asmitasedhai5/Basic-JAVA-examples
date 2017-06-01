package Search;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int num=s.nextInt();
		int array[]=new int[num];
		System.out.println("Enter "+num+" integers:");
		for(i=0;i<num;i++){
			array[i] = s.nextInt();
		}
		System.out.println("Enter the value to be searched:");
		int item=s.nextInt();
		int first = 0;
	     int last = num - 1;
	     int middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( array[middle] < item )
	           first = middle + 1;
	         else if ( array[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	   }
	}

