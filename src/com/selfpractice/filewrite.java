package com.selfpractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

	public static void main(String[] args) throws IOException {
	File f=new File("D:\\Workspace\\text.txt");
	FileWriter fw= new FileWriter(f);
	BufferedWriter writer=new BufferedWriter(fw);
	writer.write("first");
	writer.newLine();
	writer.write("secondline");
	writer.close();
	
			

	}

}
