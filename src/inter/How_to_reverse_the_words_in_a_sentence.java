package inter;

import java.util.Scanner;

public class How_to_reverse_the_words_in_a_sentence {
	public void name() {
		String givrn = "veera kumar k";
		String reverce = "";
		String[] temp = givrn.split(" ");
		for (int i = temp.length - 1; i >= 0; i--) {
			reverce = reverce + temp[i] + " ";
		}
		System.out.println(reverce);
	}

	public static void main(String[] args) {
		How_to_reverse_the_words_in_a_sentence a = new How_to_reverse_the_words_in_a_sentence();
		a.name();
	}
}
