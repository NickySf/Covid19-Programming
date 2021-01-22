import java.util.Scanner;

public class Imports {

    Scanner input = new Scanner(System.in);
    Converts obj = new Converts();


	public String testResult() {
		System.out.println("Please enter the test's results' number");
		System.out.println("1.Positive");
		System.out.println("2.Negative");
		int tr = input.nextInt();
		while ( tr != 1 && tr != 2) {
			System.out.println("Wrong answer, please try again");
			tr = input.nextInt();
		}
		String test_result = obj.convertResults(tr);
		return test_result;
	}


	public String theName() {
		String mess = "Please enter the name";
		String name = Graphics.imports2(mess);
		return name;
	}

	public String theSurname() {
		System.out.println("Please enter the surname");
		String surname = input.next();
		return surname;
	}


	public int theAge() {
		System.out.println("Please enter the age");
		int age = input.nextInt();
		return age;
	}


	public String theGender() {
		System.out.println("Please enter the gender's number ");
		System.out.println("1.Female");
		System.out.println("2.Male");
		System.out.println("3.Other");
		int gender = input.nextInt();
		while ( gender != 1 && gender != 2 && gender !=3) {
			System.out.println("Wrong answer, please try again");
			gender = input.nextInt();
		}
		String g = obj.convertGender(gender);
		return g;
	}


	public String theDate() {
		System.out.println("Please enter the date the test was taken");
		String date = input.next();
		return date;
	}


	public String theEmail() {
		System.out.println("Please enter the e-mail");
		String email = input.next();
		return email;
	}


	public String thePhoneNumber() {
		System.out.println("Please enter the phone number");
		String phone_number = input.next();
		return phone_number;

	}



	public String theArea() {
		System.out.println("Please enter your area number");
		System.out.println("1. Attiki");
		System.out.println("2. Thessaloniki");
		System.out.println("3. Hpeiros");
		System.out.println("4. Macedonia");
		System.out.println("5. Thraki");
		System.out.println("6. Thessalia");
		System.out.println("7. Eptanhsa");
		System.out.println("8. Sterea Ellada");
		System.out.println("9.Peloponnisos");
		System.out.println("10. Nhsia Aigaiou");
		System.out.println("11.Krhth");
	    int a = input.nextInt();
	    String area = obj.convertArea(a);
		return area;
	}

	public String theAmka() {
		System.out.println("Please enter the amka ");
		String amka = input.next();
		return amka;
	}

	public int theStatistics() {
		System.out.println("Please enter the number: ");
		System.out.println("1.Yes");
		System.out.println("2.No");
		int reply = input.nextInt();
		return reply;
	}

}