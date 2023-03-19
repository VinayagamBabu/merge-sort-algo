package com.greatlearning.algorithms;

public class MergeSort implements IntegerSort{

	@Override
	public void sort(int[] arr) {
		mergeSort(arr,0,arr.length-1);
	}
	
	// 1) Break down the given array recursively/iteratively until it reaches end point.
	private void mergeSort(int[] arr,int low,int high) {
		if(low >= high) {
			return;
		}
		int mid = (low + high) /2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		
		mergeArray(arr,low,mid,high);
		
	}
	// 2) Merge Process
	private void mergeArray(int[] arr, int low, int mid, int high) {
		
		// Finding out size of left and right subarray
		int n1 = mid -low +1;
		int n2 = high - mid;
		
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		//Copying elements to left subarray
		for(int i=0;i<n1;i++) {
			leftArr[i] = arr[low+i];
		}
		//Copying elements to right subarray
		for(int j=0;j<n2;j++) {
			rightArr[j] = arr[mid+j+1];
		}
		
		//pointers for left and right subbarray
		int i=0,j=0;
		//pointer for actual array.
		int k = low;
		
		while(i<n1 && j< n2) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
	
	
}
