package verify.file;

import java.io.File;
import java.util.Scanner;

public class File_lenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径：");
		String line = sc.nextLine();
		File dir = new File(line);
		long len = 0;
		len = len +dir.length();
		System.out.println(len);   ////直接获取文件夹的结果是0
	}

}
