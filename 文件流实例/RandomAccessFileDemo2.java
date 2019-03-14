package day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/**
 * 读写字符串
 * @author soft01
 * */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws Exception{
		/*FileOutputStream fileOutputStream = new FileOutputStream(new File("Demo.txt"));*/
		RandomAccessFile file = new RandomAccessFile("raf.txt", "rw");
		/*
		 * String提供了方法可以将当前字符串转换为
		 * 一节数组
		 * byte[] getBytes()
		 * 按照系统默认字符集转换为一组字节
		 * 
		 * byte[] getBytes(String csn)//字符编码集
		 * 按照指定的字符集转换为一组字节
		 * 字符集名称常用的有:
		 * GBK,UTF-8
		 * */
		String str = "你在南方的艳阳里,大雪纷飞";
		byte[] by = str.getBytes("utf-8");
		file.write(by);
		file.write(",dsdadadas".getBytes());
		System.out.println(file.length());
		
		file.seek(0);
		byte[] date = new byte[100];
		int ji = file.read(date);
		String oo = new String(date,0,ji,"UTF-8");//new Strng(byte[] by, "utf-8")字节转换为String,字符编码集
		System.out.println(oo);
		file.close();
		System.out.println("写入成功");
	}
}
