package example_algorithms;

import java.util.Scanner;

public class quicksort {
	
	public static int[] sort(int[] array) {
		quicksort(array, 0, array.length-1);
		return array;
	}
	
	private static void quicksort(int[] array, int l, int r) {
		if(l < r) {
			int i = divide(array, l, r);
			quicksort(array,l,i-1);
			quicksort(array,i+1,r);
		}
	}
	
	private static int divide(int[] array, int l, int r) {
		int index = chooseDividePoint(l, r);
		int value = array[index];
		swap(array, index, r);
		
		int position = l;
		for(int i = l; i < r; i++) {
			if(array[i] < value) {
				swap(array,i,position);
				position++;
			}
			
		}
		swap(array,position,r);
		return position;
	}

	private static int chooseDividePoint(int l, int r) {
		return (l+(r-l)/2);
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int k = array[index1];
		array[index1] = array[index2];
		array[index2] = k;
	}
	
	private static void printing(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
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
