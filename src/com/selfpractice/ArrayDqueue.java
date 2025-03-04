package com.selfpractice;

import java.util.ArrayDeque;

public class ArrayDqueue {

	public static void main(String[] args) {
		ArrayDeque<String> array=new ArrayDeque<String>();
		array.add("First");
		array.add("Second");
		array.add("Third");
		array.add("Fourth");
		array.add("Fifth");
		//System.out.println(array);
		//System.out.println(array.peek());
		//System.out.println(array.element());
		//System.out.println(array);
	//	System.out.println(array.poll());
		//System.out.println(array);
		System.out.println(array.remove());
		System.out.println(array);

	}

}
