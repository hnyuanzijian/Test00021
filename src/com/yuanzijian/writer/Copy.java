package com.yuanzijian.writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
��ʱʹ���ַ�������ʱʹ���ֽ�����������ʲô��

ʹ���ַ�����Ӧ�ó����� ����Ƕ�д�ַ����ݵ�ʱ����ʹ���ַ�����

ʹ���ֽ�����Ӧ�ó����� �����д�����ݶ�����Ҫת�����ַ���ʱ����ʹ���ֽ����� 
 
 
 */
//ʹ���ַ��������ļ�
public class Copy {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\Test.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\Test.exe"));
		String line=null;
		while((line = bufferedReader.readLine())!=null){
		bufferedWriter.write(line);
		}
		bufferedWriter.close();
		bufferedReader.close();
	}
	

}
