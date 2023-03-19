package com.greatlearning.algorithms.driver;

import java.util.Scanner;

import com.greatlearning.algorithms.ArrayRotation;
import com.greatlearning.algorithms.IntegerSort;
import com.greatlearning.algorithms.MergeSort;
import com.greatlearning.algorithms.ModifiedBinarySearch;

public class SortMain {

	public static void main(String[] args) {

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the " + size + " elements");
		int array[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		IntegerSort mergeSort = new MergeSort();
		mergeSort.sort(array);

		System.out.println("the Array after sorting is ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int midElement = array[array.length / 2];

		ArrayRotation arrayRotation = new ArrayRotation();

		arrayRotation.rotateLeftNTimes(array, midElement);

		System.out.println("the Array after rotation is ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("enter the key ");
		int key = sc.nextInt();
		ModifiedBinarySearch pivotedBinarySearch = new ModifiedBinarySearch();
		int index = pivotedBinarySearch.findElement(array, key,array.length);
		System.out.println("key is present at position" + (index+1));
		sc.close();
		
	}

}
