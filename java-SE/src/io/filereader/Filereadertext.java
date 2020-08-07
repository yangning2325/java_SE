package io.filereader;

import java.io.FileReader;

public class Filereadertext {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("java.txt");
		char[] chars=new char[512];
		int temp;
		if ((temp=fr.read(chars))!=-1) {
			System.out.println(new String(chars,0,temp ));
		}
		fr.close();
	}

}
