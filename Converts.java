
public class Converts {

    public static int[] patientsPerArea = new int [11];

	public String convertGender(int x) {
		String reply = "";
		switch (x) {
		case 1:
			reply = "Woman";
			break;
		case 2:
			reply = "Man";
			break;
		default:
			reply = "Other";
		    break;
		}
		return reply;
	}

	public String convertResults(int x) {

		String reply = " ";
        switch (x){
		case 1:
			reply = "positive";
			break;
		case 2:
			reply = "negative";
			break;
		}
		return reply;
	}

	public String convertArea(int x) {

        patientsPerArea[x]++;
		String reply = "";
        switch (x) {
        case 1:
        	reply = "Attiki";
        	break;
        case 2:
			reply = "Thessaloniki";
			break;
        case 3:
			reply = "Hpeiros";
			break;
        case 4:
			reply = "Macedonia";
			break;
        case 5:
			reply = "Thraki";
			break;
        case 6:
			reply = "Thessalia";
			break;
		case 7:
			reply = "Eptanhsa";
			break;
		case 8:
			reply = "Sterea Ellada";
			break;
		case 9:
			reply = "Peloponnhsos";
			break;
		case 10:
			reply = "Nhsia Aigaiou";
			break;
		case 11:
			reply = "Krhth";
			break;
		}
		return reply;
	}
}
