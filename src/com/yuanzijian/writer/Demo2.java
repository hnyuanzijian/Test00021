package com.yuanzijian.writer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

//ʹ���ֽ�����ȡ����
public class Demo2 {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[1024];
		int length = 0;
		while((length = fileInputStream.read(buf))!=-1){
			System.out.println(new String(buf,0,length)); //�����ַ����Ľ��빦�ܡ�
		}
	}
}
