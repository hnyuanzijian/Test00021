package com.yuanzijian.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
//		writeTest();
		readrTest();
	}
	
	
	//ʹ���ֽ�����ȡ����
	public static void readrTest() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\a.txt");
		//�������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		//��ȡ����
		//int content = 0;
		
		/*while((content = fileInputStream.read())!=-1){ //���������ԭ�� һ��������gbk�����Ĭ����ռ�����ֽڣ�
													   // Ŀǰ��ֻ��ȡ��һ���ֽڶ��ѣ����Բ���һ�����������ġ�
			System.out.print((char)content);
		}*/
		
		byte[] buf = new byte[2];
		for(int i = 0 ; i < 3 ; i++){
			fileInputStream.read(buf);
			System.out.print(new String(buf));
		}
		//�ر���Դ
		fileInputStream.close();
		
	}
	
	
	
	
	//ʹ���ֽ���д���ġ�   �ֽ���֮�����ܹ�д��������Ϊ�������ַ�����getBytes�������ַ��������˱��루�ַ�---->���֣��� 
	public static void writeTest() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\a.txt");
		//�������ݵ����ͨ��
		FileOutputStream fileOutputStream  = new FileOutputStream(file);
		//׼�����ݣ�������д����
		String data = "��Һ�";
		byte[] buf = data.getBytes();	//���ַ���ת�����ֽ�����
		System.out.println("��������ݣ�"+ Arrays.toString(buf));
		fileOutputStream.write(buf);
		///�ر���Դ
		fileOutputStream.close();
	}

}
