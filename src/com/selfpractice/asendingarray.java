package com.selfpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class asendingarray {

	public static void main(String[] args) {
	ArrayList<Integer> array=new ArrayList();
	array.add(5);
	array.add(4);
	array.add(3);
	array.add(2);
	array.add(1);
  Collections.sort(array);
  System.out.println(array);
  

	}

}
