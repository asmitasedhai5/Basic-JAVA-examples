package Sum;

import java.util.Scanner;

public class SumUserDefined {
	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 integers:");
		for (int i = 0; i <= 4; i++) {
			arr[i] = s.nextInt();
		}
		for (int num : arr) {
			sum = sum + num;
		}
		System.out.println("Sum is:" + sum);

	}

}
