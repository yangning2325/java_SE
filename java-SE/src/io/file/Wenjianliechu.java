package io.file;

import java.io.*;

public class Wenjianliechu {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\javatext");

		list(f);
	}

	public static void list(File f) throws IOException {
		if (f.isFile()) { // 如果是文件直接返回该方法
			return;
		}
		File f1 = new File("E:\\java1");// 创建一个目录（不知存不存在）
		if (!f1.exists()) { // 判断是否存在该目录
			f1.mkdirs(); // 不存在则创建目录
		}
		File[] files = f.listFiles();// 列出该目录的子文件
		for (File fs : files) {
			if (fs.getAbsolutePath().endsWith(".java")) {
				FileInputStream fsm = new FileInputStream(fs);
				File fi = new File(f1.getAbsolutePath(), fs.getName()); // 路径名以及要复制的文件名
				//File fi = new File(f1.getAbsolutePath());
				FileOutputStream fom = new FileOutputStream(fi); // 写入该目录
				byte[] bytes = new byte[(int) fs.length()]; // 创建一个byte数组长度为该文件长度
				int temp = 0;
				// 边读边写
				while ((temp = fsm.read(bytes)) != -1) {
					// 把byte数组的内容直接写入；
					fom.write(bytes, 0, temp);
				}
				fom.flush(); // 强制写入；
				fom.close();
				fsm.close();
				System.out.println(fs.getAbsolutePath());// 打印出要复制的文件
			}

			list(fs); // 递归深入文件夹中文件夹

		}
	}

}
