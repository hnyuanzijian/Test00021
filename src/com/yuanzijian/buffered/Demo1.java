package com.yuanzijian.buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
�����ַ���:
-------| Reader ���������ַ����Ļ��ࡣ ������
----------| FileReader ��ȡ�ļ��ַ����������ַ�����
----------| BufferedReader   ���������ַ���  �� ���� �����ַ������ֵ�Ŀ����Ϊ����߶�ȡ�ļ� ��Ч�ʺ���չ��FileReader�Ĺ��ܡ�  ��ʵ�����ڲ�Ҳ��ά����һ���ַ�����

��ס�������������߱���д�ļ���������

BufferedReader��ʹ�ò��裺
	1.�ҵ�Ŀ���ļ�
	2 .�������ݵ�����ͨ����
	
	


 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
//		 readTest1();
		File file  = new File("F:..\\src\\com\\yuanzijian\\buffered\\Demo1.java");
		//�������ݵ�����ͨ����
		FileReader fileReader = new FileReader(file);
		String line =  null;
		
		while((line = myReadLine(fileReader))!=null){
			System.out.println(line);
		}
	}
	
	
	
	//�Լ�ȥʵ��readLine������
	public static String myReadLine(FileReader fileReader) throws IOException{
		//����һ���ַ������������
		StringBuilder sb = new StringBuilder();  //StringBuilder��Ҫ�����ڴ洢��ȡ��������
		int content = 0 ;
		while((content = fileReader.read())!=-1){
			if(content=='\r'){
				continue;
			}else if(content=='\n'){
				break;
			}else{
				//��ͨ�ַ�
				sb.append((char)content);
			}
		}
		//�����Ѿ���ȡ����ˡ�
		if(content ==-1){
			return null;
		}
		
		return sb.toString();  
	}
	
	
	
	
	
	
	
	public static void readTest1() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file  = new File("F:\\a.txt");
		//�������ݵ�����ͨ����
		FileReader fileReader = new FileReader(file);
		//�������������ַ���
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		//��ȡ����
		/*int content = bufferedReader.read();  //������һ���ַ��� ��ȡ�����ַ��϶�Ҳ�Ǵ�Bufferedreader�ڲ����ַ������л�ȡ�ĵ�������Ч�ʸߡ�
		System.out.println((char)content);*/
		//ʹ��BUfferedReader��չ�Ĺ��ܣ�readLine()  һ�ζ�ȡһ���ı�������������ļ���ĩβ����null��ʾ��
		String line =  null;
		while((line = bufferedReader.readLine())!=null){ // ��ȻreadLineÿ�ζ�ȡһ�����ݣ����ǵ����line�ǲ�����\r\n�ġ�
			System.out.println(Arrays.toString("aaa".getBytes()));
		}
		//�ر���Դ
		bufferedReader.close();
		
	}
	
}
