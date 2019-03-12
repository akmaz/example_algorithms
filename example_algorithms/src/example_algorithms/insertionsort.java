package example_algorithms;

import java.util.Scanner;

public class insertionsort {
		
		private static int[] sort(int[] array) {
			
			for(int i = 1; i < array.length; i++) {
				int value = array[i];
				int j=i;
				
				while( (j>0) && (array[j-1] > value) ) {
					array[j] = array[j-1];
					j--;
				} 
				array[j] = value;
			}
			return array;
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
			int[] arr = new int[length];
			for(int i = 0; i<length; i++) {
				System.out.print("Number #"+(i+1)+": ");
				arr[i] = input.nextInt();
			}
			
			input.close();
			
			System.out.print("Before sorted: ");
			printing(arr);
			
			sort(arr);
			
			System.out.print("\nAfter sorted: ");
			printing(arr);
		}

	}
