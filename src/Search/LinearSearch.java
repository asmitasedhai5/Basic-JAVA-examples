package Search;

import java.util.Scanner;

public class LinearSearch {
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
		for(j=0;j<num;j++){
			if(array[j]==item){
				System.out.println("Found,"+item+" is in location "+j);
				break;
			}
			
			
			}
		if(j==num){
			System.out.println("Number "+item+" doesnot exist.");
	}
		}
		
	}


