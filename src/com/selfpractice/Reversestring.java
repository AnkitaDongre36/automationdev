package com.selfpractice;

public class Reversestring {

	public static void main(String[] args) {
		String str="Hello";
	/*	//StringBuffer sbuff=new StringBuffer("Hello");
		//System.out.println(sbuff.reverse());
		StringBuilder sbuild=new StringBuilder("Hello");
		System.out.println(sbuild.reverse());
		
*/
		//without String
		for(int i=4;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
