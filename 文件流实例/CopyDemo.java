package day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用文件流复制文件
 * @author soft01
 * */
public class CopyDemo {
	public static void main(String[] args) throws Exception{
		/*File file = new File("Demo.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] by = new byte[100];
		int i = fileInputStream.read(by);
		String aa = new String(by,0,i,"UTF-8");
		file = new File("Demo_副本.txt");
		if (!file.exists()) {
			file.createNewFile();
		}else {
			System.out.println("文件已经存在");
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(aa.getBytes());
		System.out.println("复制成功");
		fileInputStream.close();
		fileOutputStream.close();*/
		
		FileInputStream file = new FileInputStream("demo.dat");
		FileOutputStream file1 = new FileOutputStream("demo_副本.dat");
		
		byte[] by = new byte[1024*10];
		int len = -1;
		while((len = file.read(by)) != -1){
			file1.write(by, 0, len);
		}
		System.out.println("复制成功");
		file.close();
		file1.close();
	}
}
