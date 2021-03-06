import java.util.ArrayList;
/** This class is about the
 * people that came in contact
 * with the patients
 */
public class PotenciallyInfected {
  private String name;
  private String surname;
  private int age;
  private String gender;
  private String phone;
  private String email;
  private String amka;
  private static int count = 0;

  public static ArrayList<PotenciallyInfected> cases = new ArrayList<PotenciallyInfected>();
    /** constructor for the
     * object of the potencially infected
     * @param name the contact's name
     * @param surname the contact's surname
     * @param age the contact's age
     * @param gender the contact's gender
     * @param phone the contact's phone
     * @param email the contact's email
     * @param amka the contact's amka
     */
  public PotenciallyInfected(String name, String surname, int age, String gender,
      String phone, String email, String amka) {
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
    /**This method Prints
     * the potencially infected list//
     */
  public static void res() {
    for (int i = 0; i < cases.size(); i++) {
      System.out.println(cases.get(i));
    }
  }


  @Override
      /** Typical toString method
     */
  public String toString() {
    return "PotenciallyInfected [name=" + name + ", surname=" + surname + ", age=" + age
        + ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", amka=" + amka + "]";
  }
      /**This method Searches the new patient
       * in the potencially infected list
       * and delete them if they exist//
       * @param amka the contact's amka
     */
  public static void delete(String amka) {
    int x = -1;
    x = cases.indexOf(amka);
    if (x != -1) {
      cases.remove(x);
    }
  }
}
