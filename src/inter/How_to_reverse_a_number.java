package inter;

import java.util.Scanner;

public class How_to_reverse_a_number {

	public void name() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int reve = 0;

		while (a != 0) {
			reve = reve * 10;
			reve = reve + a % 10;
			a = a / 10;
		}
		System.out.println(reve);
	}

	public static void main(String[] args) {
		How_to_reverse_a_number a = new How_to_reverse_a_number();
		a.name();

	}
}
