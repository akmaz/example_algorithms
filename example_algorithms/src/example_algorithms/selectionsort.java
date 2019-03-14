package example_algorithms;

import java.util.Scanner;

public class selectionsort {
	
	private static int[] sort(int[] array) {
		
		int value;
		for(int i=0; i<array.length;i++) {
			value = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[value] > array[j])
					value = j;
			}
			swap(array,i,value);
		}
		
		return array;
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	private static void printing(int[] array) {
		for(int i=0; i< array.length; i++)
			System.out.print(array[i]+" ");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in the length of array:");
		int length = input.nextInt();
		
		System.out.println("Type in numbers that you want to sort:");
		
		int[] array = new int[length];
		for(int i = 0; i< length; i++) {
			System.out.print("Number #"+(i+1)+": ");
			array[i] = input.nextInt();
		}
		
		input.close();
		
		System.out.print("Before sorted: ");
		printing(array);
		
		sort(array);
		
		System.out.print("\nAfter sorted: ");
		printing(array);

	}

}
