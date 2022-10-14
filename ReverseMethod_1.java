  package com.ReverseMethod_1;
  
   import java.util.Scanner;
   import com.String.test.ReverseMethod_1;

    public class ReverseMethod_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//creating object
		
		ReverseMethod_1 rs = new ReverseMethod_1();
		
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		
		
		System.out.println("Reverse: " + rs.reverse(s)); //print reverse String.
		
		sc.close();
	}
}