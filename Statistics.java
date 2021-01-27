
public class Statistics {

	public static double [] population = new double[] {3827624, 1057825, 336856, 1350622, 361208, 732762, 207855, 547390,577903, 508206, 623065};
	public static double [] percentage2PerArea = new double [11];

	//Table with the percentage of the positive patients per area//
	public static double[] percentagePerArea = new double [11];
	Converts ob = new Converts();
	public static String [] areas = new String [11] ;

	public void fillArea() {
		for (int x=0; x<11; x++ ) {
			switch (x+1) {
	        case 1:
	        	areas[x] = "Attiki";
	        	break;
	        case 2:
	        	areas[x] = "Thessaloniki";
				break;
	        case 3:
	        	areas[x] = "Hpeiros";
				break;
	        case 4:
	        	areas[x] = "Macedonia";
				break;
	        case 5:
	        	areas[x] = "Thraki";
				break;
	        case 6:
	        	areas[x] = "Thessalia";
				break;
			case 7:
				areas[x] = "Eptanhsa";
				break;
			case 8:
				areas[x] = "Sterea Ellada";
				break;
			case 9:
				areas[x] = "Peloponnhsos";
				break;
			case 10:
				areas[x] = "Nhsia Aigaiou";
				break;
			case 11:
				areas[x] = "Krhth";
				break;
			}
		}
	}

	//Print positive patients per area//
	public void printPatientsPerArea() {
		for (int i=0; i<11; i++) {
			System.out.println(areas[i] + ": " + ob.patientsPerArea[i] + "patients");
		}
		System.out.println(" ");
		System.out.println(" ");
	}

	//Calculation of the total patients in Greece//
	public int totalPatients() {
		int S = 0;
		for (int i=0; i<11; i++) {
			S += ob.patientsPerArea[i];
		}
		return S;
	}

	//Print positive patients' percentage per area according to the total patients//
	public void statsPerArea() {
		System.out.println("Area's patients per total patients : ");
		for (int i=0; i<11; i++) {
			percentagePerArea[i] = ob.patientsPerArea[i] / totalPatients() * 100;
			System.out.println(areas[i] + ": "+ percentagePerArea[i] + "%");
		}
		System.out.println(" ");
		System.out.println(" ");
	}

    //Print positive patients' percentage per area according to the area's population//
    public void stats2PerArea() {
    	System.out.println("Patiens per area's population:");
    	for (int i=0; i<11; i++) {
    		percentage2PerArea[i] = ob.patientsPerArea[i]/population[i]*100;
    		System.out.println(areas[i] + ": " + percentage2PerArea[i] + " %");

    	}
    	System.out.println(" ");
    	System.out.println(" ");
    }

}
