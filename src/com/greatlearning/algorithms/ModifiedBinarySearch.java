package com.greatlearning.algorithms;

public class ModifiedBinarySearch {
	// 23, 45,67, 787,90  -- o(n)
	// 23,45,67,90,787 -- Sorting + Binary Search
	
	// if( 787 < 67) search in left 
	// else search in right
	
	//1) Find the pivot position
	public int findPivotPosition(int[] arr, int low, int high ,int key) {
		if(low > high) {
			return -1;
		}else if(low ==high) {
			return low;
		}
		
		int mid = (low + high)/2;
		if(mid < high && arr[mid] > arr[mid+1]) {
			return mid;
		}else if(mid > low && arr[mid] < arr[mid -1]) {
			return mid-1;
		}else if(arr[low] >= arr[mid]) {
			return findPivotPosition(arr, low, mid-1, key);
		}else {
			return findPivotPosition(arr, mid+1, high, key);
		}
	}
	
	//2) Find the key in left or right sub array of pivot point
	public int findElement(int[] arr, int key, int n) {
		int pivot = findPivotPosition(arr, 0, n-1, key);
		if(pivot < 0) {
			return binarySearch(arr, 0,n-1,key);
		}
		
		if(arr[pivot] == key) {
			return pivot;
		}else if(arr[0] <= key) { // 9<= 8
			return binarySearch(arr, 0,pivot-1,key);
		}else {
			return binarySearch(arr, pivot+1,n-1,key);
		}
	}

	private int binarySearch(int[] arr, int low, int high, int key) {
		if(low > high) {
			return -1;
		}
		int mid = (low+high)/2;
		if(arr[mid] == key) {
			return mid;
		}else if(arr[mid] > key) {
			return binarySearch(arr, low, mid-1, key);
		}else {
			return binarySearch(arr, mid+1, high, key);
		}
	}
}
