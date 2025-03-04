package com.selfpractice;

import java.util.Scanner;

public class Scannerpr {

	public static void main(String[] args) {
		 Scanner Input= new Scanner(System.in);
 System.out.println("enter value a");
    int a=Input.nextInt();
    System.out.println("enter value b");
    int b=Input.nextInt();
    System.out.println("enter result");
    int c=a+b;
    System.out.println(c);
    System.out.println("enter msg");
    Input.next();
    String e=Input.nextLine();
	}

}
