/*Calling of the class Graphics,
in order for the user to insert data*/

import java.util.Scanner;

public class Imports {
	Scanner input = new Scanner(System.in);
	Converts obj = new Converts();

	// Test Result//
	public String testResult() {
		try {
			int tr = Graphics.result();
			while (tr != 1 && tr != 2) {
				tr = Graphics.result();
			}
			String test_result = obj.convertResults(tr);
			return test_result;
		} catch (NumberFormatException e) {
			System.out.println("\nInvalid Input");
			System.out.println("Please try again:\n");
			int tr = Graphics.result();
			while (tr != 1 && tr != 2) {
				tr = Graphics.result();
			}
			String test_result = obj.convertResults(tr);
			return test_result;
		}

	}

	// Name//
	public String theName() {
		String mess = "Please enter the name";
		String name = Graphics.imports2(mess);
		return name;
	}

	// Surname//
	public String theSurname() {
		String mess = "Please enter the surname";
		String surname = Graphics.imports2(mess);
		return surname;
	}

	// Age//
	public int theAge() {
		String mess = "Please enter the Age";
		;
		try {
			int age = Graphics.imports1(mess);
			return age;
		} catch (NumberFormatException e) {
			int age = Graphics.imports1(mess);
			return age;
		}
	}

	// Gender//
	public String theGender() {

		int gender = Graphics.gender();
		while (gender != 1 && gender != 2 && gender != 3) {
			System.out.println("Wrong answer, please try again");
			gender = Graphics.gender();
		}
		String g = obj.convertGender(gender);
		return g;
	}

	// Date//
	public String theDate() {
		String mess = "Please enter the Date";
		String date = Graphics.imports2(mess);
		return date;
	}

	// Email//
	public String theEmail() {
		String mess = "Please enter the Email";
		String email = Graphics.imports2(mess);
		return email;
	}

	// Phone//
	public String thePhoneNumber() {
		String mess = "Please enter the phone number";
		;
		String phone_number = Graphics.imports2(mess);
		return phone_number;

	}

	// Area//
	public String theArea() {
		try {
			int a = Graphics.menu();
			while (a < 1 || a > 11) {
				a = Graphics.menu();
			}
			String area = obj.convertArea(a);
			return area;
		} catch (NumberFormatException e) {
			int a = Graphics.menu();
			while (a < 1 || a > 11) {
				a = Graphics.menu();
			}
			String area = obj.convertArea(a);
			return area;

		}
	}

	// Amka//
	public String theAmka() {
		String mess = "Please enter the AMKA";
		String amka = Graphics.imports2(mess);
		return amka;
	}

	// Statistics Information//
	public int theStatistics() {
		int reply = Graphics.theStatistics();
		while (reply != 1 && reply != 2) {
			System.out.println("Wrong answer, please try again");
			reply = Graphics.theStatistics();
		}
		return reply;
	}

}
