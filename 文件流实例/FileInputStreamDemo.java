package day07;

import java.io.FileInputStream;

/**
 * java.io.FileInputStream
 * 文件输入流,用于从文件中将数据读入到程序中
 * @author soft01
 * */
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception{
		FileInputStream fileInputStream = new FileInputStream("Demo.txt");
		byte[] data = new byte[1024];
		int len = fileInputStream.read(data);
		String str = new String(data,0,len,"UTF-8").trim();
		System.out.println(str);
		fileInputStream.close();
		System.out.println("读取完毕");
	}
}
