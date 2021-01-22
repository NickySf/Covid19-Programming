
public class Statistics {

	public static int[] percentagePerArea = new int [11];
	Converts ob = new Converts();
	public static String [] areas = new String [11];
	public  void createRegions() {
		for (int i=0; i<11; i++) {
			areas[i]= ob.convertArea(i);
		}
	}

	public void printPatientsPerArea() {
		for (int i=0; i<11; i++) {
			System.out.println(areas[i] + ": " + ob.patientsPerArea[i] + "patients");
		}
	}

	public int totalPatients() {
		int S = 0;
		for (int i=0; i<11; i++) {
			S += ob.patientsPerArea[i];
		}
		return S;
	}

	public void statsPerArea() {
		System.out.println("Patients per area percentage: ");
		for (int i=0; i<11; i++) {
			percentagePerArea[i] = ob.patientsPerArea[i] / totalPatients() * 100;
			System.out.println(areas[i] + ": "+ percentagePerArea[i] + "%");
		}
	}

}
