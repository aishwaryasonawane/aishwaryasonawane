package stringMethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    //Scanner sc = new Scanner(System.in);
			
	        String str1 = br.readLine();
	        System.out.println("Enter the first string: "+ str1);
	        String str2 = br.readLine();
	        System.out.println("Enter the second string :"+ str2);
	        System.out.println(str2.contains(str2));
	        
			}
		catch(Exception e) 
		{
			System.out.println(e);
		}

			}

	
	}

