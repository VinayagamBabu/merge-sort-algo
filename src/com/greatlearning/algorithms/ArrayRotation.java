package com.greatlearning.algorithms;

public class ArrayRotation {
	
	public void rotateLeftNTimes(int[] arr,int n) {
		n = n % arr.length;
		for(int i=0;i<n;i++) {
			rotateLeftArrayOnce(arr);
		}
	}
	
	private void rotateLeftArrayOnce(int[] arr) {
		// 3 5 7 8 9
		// 5 7 7 9 3
		int i=0;
		int temp = arr[0];
		for(;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
		
	}
}
