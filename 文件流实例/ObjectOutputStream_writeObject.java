package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.ObjectOutputStream
 * 对象输出流,用于将对象转换为一组字节后写出
 * @author soft01
 * */
public class ObjectOutputStream_writeObject {
	public static void main(String[] args) throws Exception{
		Person p = new Person();
		p.setName("苍老师");
		p.setAge(18);
		p.setGender("女");
		
		List<String> otherInfo = new ArrayList<String>();
		otherInfo.add("是一名演员");
		otherInfo.add("喜欢写毛笔字");
		otherInfo.add("促进中日文化交流");
		otherInfo.add("广大男性同胞的启蒙老师");
		p.setOtherInfo(otherInfo);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oob = new ObjectOutputStream(fos);
		/*
		 * 将给定的对象转换为一组字节后输出
		 * 	将对象转换为字节
		 * 对象->oos->fos->文件
		 * 			   |
		 * 			将字节写入文件
		 * 将一个对象转换为一组字节写到文件中
		 * 经历了两个步骤:
		 * 1:将一个对象转换为一组字节
		 * 	这个过程称为:对象序列化
		 * 2:将这组字节写入一个文件(磁盘中)长久保存
		 * 	这个过程称为:持久化
		 * */
		oob.writeObject(p);
		System.out.println("写出完毕");
		oob.close();
		
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ooi = new ObjectInputStream(fis);
		Object jj = ooi.readObject();
		System.out.println(jj);
		ooi.close();
	}
}
