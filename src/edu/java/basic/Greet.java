package edu.java.basic;
import java.util.Scanner;

import java.util.Scanner;

public class Greet {
	
	public void sayHello() {
		String name = readString("Enter name:");   
		System.out.println(hello(name));
	}
	
	public String hello(String name) {		
		return "Hello " + name + "!";		
	}
	
	public String readString(String displayText) {
		Scanner kbScanner = new Scanner(System.in);		
		System.out.println(displayText);
		String text = kbScanner.nextLine();  
		kbScanner.close();
		return text;
	}
}
