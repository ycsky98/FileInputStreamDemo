package day07;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * 对象输入流,用于进行对象反序列化
 * 需要注意的是对象输入流读取的内容必须通过
 * ObjectOutputStream序列化对象
 * @author soft01
 * */
public class ObjectInputStreamDemo {
	public static void main(String[] args) throws Exception,ClassNotFoundException{
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person)ois.readObject();
		System.out.println(p);
		ois.close();
	}
}
