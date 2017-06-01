package com.yuanzijian.other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 װ�������ģʽ����ǿһ����Ĺ��ܣ����һ���������Щװ���໥��װ�Ρ�
 
 BufferedReader�ǲ�����չ��FileReader�Ĺ��ܡ�
 BuferedWriter Ҳ����չ��FileWriter�Ĺ��ܡ�
 
 ����1�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������кš�
 
  ����2����дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ������зֺš�
  
  ����3�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ�������˫���š�
  
 
 ����4�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������к�+ �ֺš�
  
 ����5�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ������зֺ�+ ˫���š�

 ����6�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ�������˫����+ �кš�
   
 ����7�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������к�+ �ֺ�+˫���š�
 
----| Reader
-----------| BufferedReader
---------------| BufferedLineNum  ���к�
---------------| BufferedSemi    ���ֺ�
---------------| BufferedQuto   ��˫��
---------------| ����.. 
---------------|

��ǿһ����Ĺ���ʱ�����ǿ���ѡ��ʹ�ü̳У�
	
	ͨ���̳�ʵ����ǿһ����Ĺ����ŵ㣺   ����ṹ������ͨ���׶���
	
	ȱ�㣺 ʹ�ò����ᵼ�¼̳е���ϵ�����Ӵ�
	
 
 
 
 */
class BufferedLineNum extends BufferedReader{
	//�к�
	int count = 1 ;

	public BufferedLineNum(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine(); 
		if(line ==null){
			return null;
		}
		line = count+" "+ line;
		count++;
		return line;
	}	
}


//���ֺŵĻ��������ַ���
class BufferedSemi extends BufferedReader{

	public BufferedSemi(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line =  super.readLine();
		if(line==null){
			return null;
		}
		line = line+";";
		return line;
	}
}


//��˫���ŵĻ��������ַ���
class  BufferedQuto extends BufferedReader{

	public BufferedQuto(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		if(line==null){
			return null;
		}
		line = "\""+line+"\"";
		return line;
	}
}





public class Demo1 {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Demo1.java");
		//�������ݵ�����ͨ��
		FileReader fileReader = new FileReader(file);
		//�������кŵĻ��������ַ���
		BufferedLineNum bufferedLineNum = new BufferedLineNum(fileReader);
		
		//���зֺŵĻ��������ַ���
		BufferedSemi bufferedSemi = new BufferedSemi(fileReader);
		
		//����˫���ŵĻ��������ַ���
		BufferedQuto bufferedQuto = new BufferedQuto(fileReader);
		
		
		String line = null;
		while((line = bufferedQuto.readLine())!=null){
			System.out.println(line);
		}
		
	}
	
}
