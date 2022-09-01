package FileClassEx;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		File f=new File("D:\\\\iostream\\\\Student");
		System.out.println(f.isDirectory());
		f.mkdir();
		System.out.println(f.isDirectory());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());

	}

}
