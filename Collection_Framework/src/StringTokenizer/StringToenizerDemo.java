package StringTokenizer;

import java.util.StringTokenizer;

public class StringToenizerDemo {

	public static void main(String[] args) {
		String s1="I m Mahesh Employee of Four Serve Global";
		StringTokenizer st=new StringTokenizer(s1," ");
		System.out.println("st :"+st);
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}

	}

}
