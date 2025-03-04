package com.selfpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
     static String str;

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\\\Workspace\\\\text.txt");
		FileReader fr=new FileReader(f);
		BufferedReader read=new BufferedReader(fr);

	
		while((str=read.readLine())!=null)
		{
		
		System.out.println(str);
		}
		
		
		read.close();
		//String str1=read.readLine();
		//System.out.println(str1);
		
		
		

	}

}
