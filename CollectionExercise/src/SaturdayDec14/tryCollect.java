package SaturdayDec14;

import java.util.Scanner;

public class tryCollect {

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);
		String[][] listings = { { "Michael Myers", "333-8000" }, { "Ash Williams", "333-2323" },
				{ "Jack Torrance", "333-6150" }, { "Freddy Krueger", "339-7970" }

		};
		System.out.println("Enter name to look up.");
		String targetName = kbd.nextLine();
		String targetPhone = lookupName(targetName, listings);
		System.out.println("The phone number is " + targetPhone);

	}

	/*
	 * Loops through the multidimensional array of names to return the associated
	 * number
	 */
	public static String lookupName(String targetName, String listings[][]) {
		for (int i = 0; i < 4; i++) {
			if (targetName.equals(listings[i][0])) {
				System.out.println("Number: " + listings[i][1]);
				return listings[i][1];
			}
		}
		return "";
	}

}
