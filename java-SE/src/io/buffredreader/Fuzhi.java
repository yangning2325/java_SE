package io.buffredreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class Fuzhi {
	//	public BufferedReader(Reader in)
	//FileReader继承Reader
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("java.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\yn.txt"));
		String string;
		while((string=br.readLine())!=null) {
			bw.write(string);
			bw.newLine(); //换行
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
