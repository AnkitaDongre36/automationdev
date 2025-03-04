package com.selfpractice;

public class multidementionalarray {

	public static void main(String[] args) {
		int[][]arr= {{12,23,12},{23,45,21},{34,56,76}};
		int a=arr.length;
		System.out.println(a);
		for(int[] arr1:arr)
			
		{
			for(int b:arr1)
			{
				
			System.out.print(b+" ");
		}
		
System.out.println();
	}

}
}
