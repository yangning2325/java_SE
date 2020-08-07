package io.file;

import java.io.*;
import java.util.Scanner;

public class Wenjianmove {
	static String sr2 = null;

	public static void main(String[] args) throws Exception {

		System.out.print("请输入你要复制的文件目录：");
		Scanner s1 = new Scanner(System.in);
		String sr1 = s1.next();
		System.out.print("请输入你要黏贴的文件目录：");
		Scanner s2 = new Scanner(System.in);
		sr2 = s1.next();
		File f = new File(sr1);
		System.out.println("复制完成请查看！");
		System.out.println("该目录下所有子文件有：");
		list(f);
	}

	private static void list(File f) throws Exception {
		if (f.isFile()) {
			String filepath = f.getAbsolutePath(); // 获取绝对路径；

			String newfilepath = sr2 + filepath.substring(2);// 修改路径
			File parentfile = new File(newfilepath).getParentFile(); // 获取父路径
			if (!parentfile.exists()) { // 判断是否存在这个路径；不存在则创建
				parentfile.mkdirs();
			}
			FileInputStream fis = new FileInputStream(filepath);// 读文件
			FileOutputStream fos = new FileOutputStream(newfilepath); // 写文件
			byte[] bytes = new byte[102400];// 100kb
			int temp = 0;
			// 边读边写
			while ((temp = fis.read(bytes)) != -1) {
				// 把byte数组的内容直接写入；
				fos.write(bytes, 0, temp);
			}
			fos.flush(); // 强制写入；
			fos.close();
			fos.close();
			return;
		}
		File[] files = f.listFiles();// 列出该目录的子文件
		if (files != null) {
			for (File file : files) {
				list(file);
				System.out.println(file.getAbsolutePath());
			}
		} else {
			System.out.println("文件不存在！");
		}
	}

}
