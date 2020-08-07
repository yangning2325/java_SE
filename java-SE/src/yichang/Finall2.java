package yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finall2 {
	public static void main(String[] args) {
		//必须在外面声明
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("java.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//为了保证资源一定会释放；
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}

	}

}
