package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * 使用RAF基于读写基本类型数据
 * 以及RAF基于指针读写的操作
 * @author soft01
 * */
public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException{
		/*
		 * 将int最大值写入文件
		 * */
		RandomAccessFile file = new RandomAccessFile("demo.dat", "rw");
		
		int max = Integer.MAX_VALUE;
		/*file.write(max>>>24);
		file.write(max>>>16);
		file.write(max>>>8);*/
		
		/*
		 * void writeInt(int d)
		 * 将一个int值写出
		 * */
		file.writeInt(max);
		long nn = file.getFilePointer();
		System.out.println(nn);
		file.writeLong(123L);
		nn = file.getFilePointer();
		System.out.println(nn);
		file.writeDouble(123.123);
		nn = file.getFilePointer();
		System.out.println(nn);
		System.out.println("写入成功");
		
		/*
		 * int readInt()
		 * 连续读取4个字节int,返回一个10进制的值
		 * EOF end of file
		 * 若在读取4个字节的过程中读取到了文件末尾
		 * 则会抛出EOFException
		 * EOF(end of file)
		 * */
		
		/*int i = file.readInt();
		System.out.println(i);*/
		nn = file.getFilePointer();
		System.out.println(nn);
		
		/*
		 * void seek(long pos)
		 * 移动指针到指定位置
		 * */
		file.seek(0);
		int i = file.readInt();
		System.out.println(i);
		
		file.seek(4);
		long i1 = file.readLong();
		System.out.println(i1);
		
		file.seek(12);
		double i2 = file.readDouble();
		System.out.println(i2);
	}
}
