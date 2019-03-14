package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * 缓冲流写出数据的缓冲区问题
 * @author soft01
 * */
public class BufferedOutputStream_flush {
	public static void main(String[] args) throws Exception{
		//InputStream is = new BufferedInputStream(new FileInputStream(new File("")));
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("asdfghjkl".getBytes());
		bos.flush();//强制从缓冲区写出数据
		System.out.println("写入成功");
		bos.close();
		fos.close();
	}
}
