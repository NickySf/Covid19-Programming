
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		Graphics wi = new Graphics();
		//wi.eisagwgh();
     int end = 0;
		//Loop for the continuing data inserts from different hospitals//
	    while (end==0){

	    	Scanner input = new Scanner(System.in);
			String mess = "Please enter the number of the people that took the test";
			int people = wi.imports1(mess); //Number of patients that took the test at this hospital//
			int neg=0;

			//Object's declaration//
			Imports a1 = new Imports();
			Statistics a4 = new Statistics();
			String area = a1.theArea();

			a4.fillArea();
			int i = 1;
			/*Patient's Data insert in variables, through calling the methods of the class Imports*/
			while (i<= people) {
				String result = a1.testResult();
		    	switch (result) {
		    	//ΠCase the patient is positive//
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
		 		   //Object for every positive patient//
		 		   Patient a2 = new Patient (name,surname,age,gender,date,phone,email, amka);
		 		   String x= ("How many people did you come in contact with within the last two weeks? ");
				   int potinf = Graphics.imports1(x);
				   /*Patient's Contacts' Data insert in variables, through calling the methods of the class Imports*/
				   for (int j=1; j<=potinf; j++) {
					   System.out.println("Information about person " + i + ": ");
					   name = a1.theName();
					   surname = a1.theSurname();
					   age = a1.theAge();
					   gender = a1.theGender();
					   phone  = a1.thePhoneNumber();
				       email = a1.theEmail();
				       amka = a1.theAmka();
				       //Object for every person that came in contact with a patient//
					   PotenciallyInfected a3 = new PotenciallyInfected(name,surname,age,gender,phone,email, amka);
				   }

				   break;
			   //Case the patient is negative//
			   default:
				System.out.println("Thank you");
		    	neg++;
		    	break;
			   }
		       i++;
			}
			//Print of the inserted data until that moment//
			System.out.printf("Your area is :"+area);
			System.out.println();
			System.out.printf("Data until now:");
			System.out.println();
			System.out.println("Positive's list");
			Patient.p();
			System.out.println(neg + " people were negative");
			System.out.println("List of people the patients had seen ");
			PotenciallyInfected.res();

			System.out.println("Do you want to be informed about the country's statistics?");
			switch (a1.theStatistics()) {
			//Print of the statistics until that moment//
			case 1:
				a4.printPatientsPerArea();
				System.out.println("The total number of patients right now is " + a4.totalPatients() + " patients");
				System.out.println(" ");
				System.out.println(" ");
				a4.statsPerArea();
				a4.stats2PerArea();

			}
			System.out.println("Thank you!");

			//Question in order for the process to continue by another hospital //
			System.out.println("Will the procedure continue?" );
			if (Graphics.term() == 2) {
			 end = 1;
			}

	    }

	    //wi.telos();

	}

}
