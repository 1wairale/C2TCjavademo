package com.demo.Day3_Array;

public class Array_2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]=new int [2][3];
		
		arr[0]=new int[4];
		arr[1]=new int[5];
		
		arr[0][0]=5;
		
		//stack
		//int arr[][]= {{2,3,4},{5,6,7}};
		 for(int i=0;i<2;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 System.out.println(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}
