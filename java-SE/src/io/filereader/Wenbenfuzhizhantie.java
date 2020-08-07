package io.filereader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Wenbenfuzhizhantie {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("yn.txt");
		FileReader fr=new FileReader("java.txt");
		char[] chars=new char[512];
		int temp;
		if ((temp=fr.read(chars))!=-1) {
			fw.write(chars, 0, temp);
			fw.flush();
		}
		fw.close();
		fr.close();

	}

}
