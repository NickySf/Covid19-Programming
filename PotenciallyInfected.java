import java.util.ArrayList;
public class PotenciallyInfected {

	private String name;
	private String surname;
	private int age;
	private String gender;
	private String phone;
	private String email;
	private String amka;
	private static int count= 0;


	public static ArrayList <PotenciallyInfected> cases = new ArrayList <PotenciallyInfected>();

	public PotenciallyInfected(String name, String surname,int age, String gender, String phone, String email, String amka) {


		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.amka = amka;
		count++;
		cases.add(this);


	}


    public static void res() {
		for (int i = 0; i<cases.size(); i++) {
			System.out.println(cases.get(i));
		}
	}


	@Override
	public String toString() {
		return "PotenciallyInfected [name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender
				+ ", phone=" + phone + ", email=" + email + ", amka=" + amka + "]";
	}

	public static void delete(String amka) {
		int x = -1;
		x = cases.indexOf(amka);
		if (x != -1) {
			cases.remove(x);
		}
	}





}

