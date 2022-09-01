package RandomAccessFileEx;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RADemo {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=new RandomAccessFile("raf.text","rw");
		raf.writeInt(111);
		raf.writeUTF("AAA");
		raf.writeFloat(5000);
		raf.writeUTF("HYD");
		raf.seek(0);
		System.out.println(raf.readInt());
		System.out.println(raf.readUTF());
		System.out.println(raf.readFloat());
		System.out.println(raf.readUTF());

	}

}
