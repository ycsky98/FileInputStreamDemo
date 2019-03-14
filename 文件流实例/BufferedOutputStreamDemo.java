package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 缓冲流
 * 缓冲流是一对高级流,作用是提高读写效率
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * @author soft01
 * */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("raf.txt");
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("raf_副本.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int len = -1;
		while((len = bis.read()) != -1){
			bos.write(len);
		}
		System.out.println("复制成功");
		bos.close();
		fos.close();
		fis.close();
		fos.close();
	}
}
