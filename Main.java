
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		boolean done = true;
		Graphics wi = new Graphics();
		wi.eisagwgh();
	    do {

	    	Scanner input = new Scanner(System.in);
			String mess = "Please enter the number of the people that took the test";
			int people = wi.imports1(mess); //εισάγει ο χρήστης την τιμή σε παράθυρο
			int neg=0;
			Imports a1 = new Imports();
			Statistics a4 = new Statistics();
			String area = a1.theArea();
			int i = 1;
			while (i<= people) {
				String result = a1.testResult();
		    	switch (result) {
		    	case "positive":
		    	   String name = a1.theName();
		 		   String surname = a1.theSurname();
		 		   int age = a1.theAge();
		 		   String gender = a1.theGender();
		 		   String date = a1.theDate();
		 		   String phone  = a1.thePhoneNumber();
		 		   String email = a1.theEmail();
		 		   String amka = a1.theAmka();
		 		   PotenciallyInfected.delete(amka);
		 		   Patient a2 = new Patient (name,surname,age,gender,date,phone,email, amka);
		 		   System.out.println("How many people did you come in contact with within the last two weeks?");
				   int potinf = input.nextInt();
				   for (int j=1; j<potinf; j++) {
					   System.out.println("Information about person " + i + ": ");
					   name = a1.theName();
					   surname = a1.theSurname();
					   age = a1.theAge();
					   gender = a1.theGender();
					   phone  = a1.thePhoneNumber();
				       email = a1.theEmail();
				       amka = a1.theAmka();
					   PotenciallyInfected a3 = new PotenciallyInfected(name,surname,age,gender,phone,email, amka);
				   }

				   break;

			   default:
				System.out.println("Thank you");
		    	neg++;
		    	break;
			   }
		       i++;
			}
			System.out.printf("Data you inserted  of the area:"+area);
			System.out.println();
			System.out.println("Positive's list");
			Patient.p();
			System.out.println(neg + " people were negative");
			System.out.println("List of people the patients had seen ");
			PotenciallyInfected.res();

			System.out.println("Do you want to be informed about the country's statistics?");
			switch (a1.theStatistics()) {
			case 1:
				a4.printPatientsPerArea();
				System.out.println("The total number of patients right now is " + a4.totalPatients() + " patients");
				a4.statsPerArea();

			}
			System.out.println("Thank you!");
			System.out.println("Will the procedure continue?" );
			if (a1.theStatistics() == 2) {
				done = false;
			}

	    } while (done=false);

	    wi.telos();

	}

}
