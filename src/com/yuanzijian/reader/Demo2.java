package com.yuanzijian.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
�ֽ������ֽ�����ȡ�����ļ��еĶ��������ݣ����������ݲ��������ת�����㿴�ö����ַ��� 
 
�ַ����� �ַ�����Ѷ�ȡ���Ķ����Ƶ����ݽ��ж�Ӧ �ı�������빤����   �ַ��� = �ֽ��� + ����(����)
 
�����ַ�����
----------| Reader �����ַ����Ļ���   ������
-------------| FileReader ��ȡ�ļ��������ַ�����


FileReader���÷���
	1. �ҵ�Ŀ���ļ�
	2. �������ݵ�����ͨ��
	3. ��ȡ����
	4. �ر���Դ
	
	

 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		readTest2();
	}
	
	//ʹ�û����ַ������ȡ�ļ���
	public static void readTest2() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\1208project\\day21\\src\\day21\\Demo1.java");
		// �������ݵ�����ͨ��
		FileReader fileReader = new FileReader(file);
		//���������ַ������ȡ�ļ�����
		char[] buf = new char[1024];
		int length = 0 ; 
		while((length = fileReader.read(buf))!=-1){
			System.out.print(new String(buf,0,length));
		}
	}
	
	
	
	
	public static void readTest1() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\1208project\\day21\\src\\day21\\Demo1.java");
		//�������ݵ�����ͨ��
		FileReader fileReader = new FileReader(file);
		int content = 0 ;
		while((content = fileReader.read())!=-1){ //ÿ��ֻ���ȡһ���ַ���Ч�ʵ͡�
			System.out.print((char)content);
		}
		//�ر���Դ
		fileReader.close();
	}
	
}
