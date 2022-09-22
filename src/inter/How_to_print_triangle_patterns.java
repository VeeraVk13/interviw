package inter;

import java.util.Scanner;

public class How_to_print_triangle_patterns {
	public void name() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scanner.nextInt();
		System.out.println("enter the number" + a);
		int row, colloum = 0;
		for (row = 0; row < a; row++) {
			for (colloum = 0; colloum <= row; colloum++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public void name2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int star=1;
		int a = scanner.nextInt();
		int row, colloum;
		for (row = 0; row < a; row++) {

			for (colloum = 0; colloum <= row; colloum++) {
				System.out.print(star+" ");
				star = star + 1;

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		How_to_print_triangle_patterns a = new How_to_print_triangle_patterns();
		a.name2();
	}
}
