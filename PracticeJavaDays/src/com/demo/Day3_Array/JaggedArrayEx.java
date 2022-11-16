package com.demo.Day3_Array;

public class JaggedArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration of jagged array
		int a[][]=new int [4][];
		
		a[0]=new int [3];
		a[1]=new int [2];
		a[2]=new int [4];
		a[3]=new int [4];
		
		int count=0;
		
		//Initializing array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=count++;
			}
		}
		//Display element in array
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]+"");
			}
			System.out.println();
		}
	}

}
