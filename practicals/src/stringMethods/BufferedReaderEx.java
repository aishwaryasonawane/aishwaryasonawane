package stringMethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String args [])throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a text:");
		String str1=br.readLine();
		System.out.println("Enter a text again:");
		int str2=br.read();
		System.out.println("first text:"+str1);
		System.out.println("first text:"+str2);
	}

}
