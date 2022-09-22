package inter;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class How_to_reverse_a_String {

	public void stringbuffrrt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the word");
		String a = scan.nextLine();
		StringBuffer revers = new StringBuffer();
		revers.append(a);
		System.out.println(revers.reverse());

	}

	public void forloop() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the word");
		String a = scan.nextLine();
		char[] chare = a.toCharArray();
		String f = "";

		for (int i = chare.length - 1; i >= 0; i--) {
			f = f + chare[i];
		}
		System.out.println(f);

	}

	public void name() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the word");
		String a = scan.nextLine();

		char[] chare = a.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (Character charee : chare) {
			list.add(charee);

		}
		ListIterator reverse = list.listIterator();

		while (reverse.hasNext()) {
			System.out.print(reverse.next());
		}
	}

	public static void main(String[] args) {

		How_to_reverse_a_String a = new How_to_reverse_a_String();
		//a.name();
		a.forloop();
		//a.stringbuffrrt();

	}
}
