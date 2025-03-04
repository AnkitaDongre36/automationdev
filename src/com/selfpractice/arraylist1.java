package com.selfpractice;

import java.util.ArrayList;

public class arraylist1 {

	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList();
		arr.add(12);
		arr.add(34);
		arr.add(25);
		arr.add(78);
		arr.add(56);
		for(int a:arr)
		{
			System.out.print(a +" ");
		}
		System.out.println();
		System.out.println(arr.size());
		System.out.println(arr.contains(78));
		System.out.println(arr.remove(2));
		System.out.println(arr);
	}

}
