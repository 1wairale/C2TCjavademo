package com.demo.Day3_Array;

public class Array_1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int      arr[]=new int[5];
	
		arr[0]=3;
		arr[1]=7;
		arr[2]=2;
		arr[3]=9;
		arr[4]=4;
		
		//for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		//for each
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
