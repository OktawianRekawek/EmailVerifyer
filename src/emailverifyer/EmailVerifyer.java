/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailverifyer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerifyer {
	
	public boolean isEmail(String email) {
	///{
	//write your code here
	//start
	Pattern p = Pattern.compile("^[_a-zA-Z0-9-]+[\\._a-zA-Z0-9-]*@[_a-zA-Z0-9-]+[\\._a-zA-Z0-9-]*\\.[a-zA-Z]{2,}$");
	Matcher m = p.matcher(email);
	return m.matches();



	//end 
	///}	
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an email which you would like to verify for correctness: ");
		String email = scanner.nextLine();
		EmailVerifyer emailVerifyer = new EmailVerifyer();
		System.out.println("Output: ");
		System.out.println(emailVerifyer.isEmail(email));
	}
}