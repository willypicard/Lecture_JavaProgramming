package pl.kti.cp.lang;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardStreamsExample {

	public static void main(String[] args) {
		System.out.print("Please enter your name: ");
		String name = "";
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			name = input.readLine();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		System.out.print("Please enter your age: ");
		  int age =0;
		   try {
		     age = Integer.parseInt(input.readLine());
		     }
		   catch (Exception e) {
		     e.printStackTrace();
		     }

		int birthYear = 2011 - age;
		
		System.out.println("Hello " + name + "!");
		System.out.println("So you were born in "+birthYear+"?");
	}
}