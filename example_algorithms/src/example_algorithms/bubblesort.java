
package example_algorithms;

import java.util.Scanner;

public class bubblesort {
	
	private static int[] sorting(int[] array) {
		
		boolean change;
		
		do{
			change = false;
			
			for(int i = array.length-1; i > 0; i--) {
				if(array[i] < array[i-1]) {
					int k = array[i-1];
					array[i-1] = array[i];
					array[i] = k;
					change = true;
				}
			}
		} while(change);
		
		return array;
	}
	
	private static void printing(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in the length of an array:");
		int length = input.nextInt();
		
		System.out.println("Type in numbers that you want to sort:");
		int[] arr = new int[length];
		for(int i = 0; i<length; i++) {
			System.out.print("Number #"+(i+1)+": ");
			arr[i] = input.nextInt();
		}
		
		input.close();
		
		System.out.print("Before sorted: ");
		printing(arr);
		
		sorting(arr);
		
		System.out.print("\nAfter sorted: ");
		printing(arr);
	}

}
