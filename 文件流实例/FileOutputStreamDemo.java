package day07;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
/**
 * 流
 * 流是java标准的读写操作方式
 * 流按功能分为:
 * 输入流:
 * 用来读取文件流
 * 输出流:
 * 用来写出文件流
 * 
 * 流分为
 * 节点流(低级流):数据明确,读写一定建立在低级流
 * 上,真实负责在数据源与程序间搬运数据
 * 处理流(高级流):不能独立存在(没有意义),需要建立
 * 在其他流之上,对其处理,使用处理流的
 * 目的在于简化读写操作
 * 
 * java.io.FileInputStream
 * 文件输出流
 * 
 * 文件输出流用于将数据写入文件中
 * @author soft01
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		/*
		 * 构造方法:
		 * FileOutputStream(String path)
		 * FileOutputStream(File path)
		 * 上面两种形式创建的文件输出流默认为覆盖写操作
		 * 即:指定的文件若已存在,则会先将该文件所有数据清除,
		 * 然后通过该流写出的内容会作为该文件的内容
		 * */
		FileOutputStream fileOutputStream = new FileOutputStream(new File("Demo.txt"),true);
		String get = "集哦撒旦回iwqodhiosadwkoxhisabxiuhiowfc";
		fileOutputStream.write(get.getBytes("UTF-8"));
		fileOutputStream.write("wad".getBytes());
		fileOutputStream.close();
		System.out.println("写入成功");
	}
}