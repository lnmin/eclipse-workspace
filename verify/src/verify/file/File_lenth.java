package verify.file;

import java.io.File;
import java.util.Scanner;

public class File_lenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·����");
		String line = sc.nextLine();
		File dir = new File(line);
		long len = 0;
		len = len +dir.length();
		System.out.println(len);   ////ֱ�ӻ�ȡ�ļ��еĽ����0
	}

}
