import java.util.ArrayList;
/** This class is about the patients.
 */
public class Patient {
  private String name;
  private int age;
  private String surname;
  private String gender;
  private String phone;
  private String date;
  private String email;
  private String amka;
  private static int  count = 0;

  //Declaration of the list with the positive patients' information//
  public static ArrayList<Patient> cases = new ArrayList<Patient>();
   /** Constructor for the object
    * of the patients
    * @param name patient's name
    * @param surname patient's surname
    * @param age patient's age
    * @param gender patient's gender
    * @param date date the test was taken
    * @param phone patient's phone number
    * @param email patient's email
    * @param amka patient's amka
    */

  public Patient(String name, String surname, int age, String gender, String date,
      String phone, String email, String amka) {
    count++;
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.gender = gender;
    this.date = date;
    this.phone = phone;
    this.email = email;
    this.amka = amka;
    cases.add(this);
  }


  @Override
  /**Typical toString method
  */
  public String toString() {
    return "Patient [name=" + name + ", age=" + age + ", surname="
        + surname + ", gender=" + gender + ", phone="
            + phone + ", date=" + date + ", email=" + email + ", amka=" + amka + "]";
  }


  //Print Patients' List//
      /** This method prints
       * the patient's list
     */
  public static void p() {
    for (int i = 0; i < cases.size(); i++) {
      System.out.println(cases.get(i));
    }


  }
}

