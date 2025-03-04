package com.selfpractice;

public class jaggedarray {

	public static void main(String[] args) {
		int[][]arr= {{12,14},{3,21,43},{34},{23,46,67,45}};
		for(int[]arr1:arr)
		{
			for(int b:arr1)
			{
				System.out.print(b+" ");
				
			}
			System.out.println();
		}

	}

}
