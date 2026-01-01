package com.pack1;

import java.util.Arrays;

public class OptimalSolutionOfLeftRotateArray {
	public static void rotate(int start,int end,int [] arr)
	{
		while(start < end)
		{
		    int temp=arr[start];
		    arr[start]=arr[end];
		    arr[end]=temp;
		    start++;
		    end--;
		}
	}

	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		int k=2;
		int n=arr.length;
		k=k%n;
		System.out.println("Before Array "+Arrays.toString(arr));
		OptimalSolutionOfLeftRotateArray.rotate(0, k-1, arr);
		OptimalSolutionOfLeftRotateArray.rotate(k, n-1, arr);
		OptimalSolutionOfLeftRotateArray.rotate(0, n-1, arr);
		System.out.println("After Array "+Arrays.toString(arr));
		
		

	}

}
