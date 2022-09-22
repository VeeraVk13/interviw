package inter;

import java.util.Scanner;

public class Find_the_length_of_the_string_without_length_method {
	public void name() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the name");
		String a=scanner.nextLine();
		char[] chaer=a.toCharArray();
		int length=0;
		for(char c:chaer) {
			length++;
		}System.out.println(length);

	}

	public static void main(String[] args) {
		Find_the_length_of_the_string_without_length_method a = new Find_the_length_of_the_string_without_length_method();
		a.name();
	}
}
