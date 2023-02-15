package stringMethods;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			
	        String str1 = sc.nextLine();
	        System.out.println("Enter the first string: "+ str1); 
	            
	        StringBuilder sb=new StringBuilder(str1);  
	        sb.reverse();  
	        System.out.println(sb.toString()); 
	        //str1.toUpperCase();
	        System.out.println(str1.toUpperCase());
	        
	         
	        
	       
	        

	}

}
