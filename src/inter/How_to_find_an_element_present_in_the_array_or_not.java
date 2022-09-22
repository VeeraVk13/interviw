package inter;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class How_to_find_an_element_present_in_the_array_or_not {
	int[] thegivenarray = { 1, 3, 5, 6, 7, 7, 8, 9, 10 };

	int findnumber = 7;

	boolean found = false;

	public void name() {

		for (int number : thegivenarray) {
			if (number == findnumber) {
				found = true;
				break;
			}
			if (found) {
				System.out.println("the number is no");

			} else {
				System.out.println("the number is there");
			}
		}

	}

	public static void main(String[] args) {
		How_to_find_an_element_present_in_the_array_or_not a = new How_to_find_an_element_present_in_the_array_or_not();

		a.name();
	}

}
