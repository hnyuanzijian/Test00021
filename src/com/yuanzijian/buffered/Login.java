package com.yuanzijian.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
��ϰ�� ������������ַ����û���½ע��...
	
*/
public class Login {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while(true){
			System.out.println("��ѡ���ܣ� A(ע��)   B(��½)");
			String option =  scanner.next();
			if("a".equalsIgnoreCase(option)){
				//ע��
				reg();
				
			}else if("b".equalsIgnoreCase(option)){
				//��½
				login();
				
			}else{
				System.out.println("�����������,����������...");
			}	
		}
	}
	
	
	//��½
	public static void login() throws IOException{
		System.out.println("�������û�����");
		String userName = scanner.next();
		System.out.println("�� �������룺");
		String password = scanner.next();
		String info = userName+" "+ password;
		//��ȡ�ļ�����Ϣ���鿴�Ƿ��и��û�����Ϣ���ڣ�����������½�ɹ���
		//�������ݵ�����ͨ��
		//�������������ַ���
		BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\users.txt"));
		String line = null;
		
		boolean isLogin = false; // ���ڼ�¼�Ƿ��½�ɹ��ı�ʶ�� Ĭ���ǵ�½ʧ�ܵġ�
		//���ϵĶ�ȡ�ļ�������
		while((line = bufferedReader.readLine())!=null){
			if(info.equals(line)){
				isLogin = true;
				break;
			}
		}
		
		if(isLogin){
			System.out.println("��ӭ"+userName+"��½�ɹ�...");
		}else{
			System.out.println("�����ڸ��û���Ϣ����ע��!!");
		}
		
		
		
	}
	
	
	
	
	//ע��
	public static void reg() throws IOException{
		System.out.println("�������û�����");
		String userName = scanner.next();
		System.out.println("�� �������룺");
		String password = scanner.next();
		String info = userName+" "+ password;
		//���û���ע�����Ϣд���ļ���
		File file = new File("F:\\users.txt");
		FileWriter fileWriter = new FileWriter(file,true);
		//������������ַ���
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		//���û���Ϣд��
		
		bufferedWriter.write(info);
		bufferedWriter.newLine();
		//�ر���Դ
		bufferedWriter.close();
		
	}

}
