import java.util.Scanner;
/** This class calls the class Graphics
 * for every information we want the user to insert,
 * giving as parameter the message we want to
 * print to the user
 * and the class Converts for every information
 * we need in a converted form
 */

public class Imports {
  Scanner input = new Scanner(System.in);
  Converts obj = new Converts();


  /**Gets the Test Result
  * @return if the result was positive or negative
  */
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


     /**Gets the name
      * @return name
    */
  public String theName() {
    String mess = "Please enter the name";
    String name = Graphics.imports2(mess);
    return name;
  }
    /** Gets surname
     * @return surname
     */
  public String theSurname() {
    String mess = "Please enter the surname";
    String surname = Graphics.imports2(mess);
    return surname;
  }
    /**Gets age
     * @return age
     */
  public int theAge() {
    String mess = "Please enter the Age";
    try {
      int age = Graphics.imports1(mess);
      return age;
    } catch (NumberFormatException e) {
      int age = Graphics.imports1(mess);
      return age;
    }
  }

  /** gender
  * @return gender
  */
  public String theGender() {
    int gender = Graphics.gender();
    while (gender != 1 && gender != 2 && gender != 3) {
      System.out.println("Wrong answer, please try again");
      gender = Graphics.gender();
    }
    String g = obj.convertGender(gender);
    return g;
  }
    /** Gets date
     * @return date
     */
  public String theDate() {
    String mess = "Please enter the Date";
    String date = Graphics.imports2(mess);
    return date;
  }
    /** Gets Email
     * @return email
     */
  public String theEmail() {
    String mess = "Please enter the Email";
    String email = Graphics.imports2(mess);
    return email;
  }
    /** Gets phone
     * @return phone
     */
  public String thePhoneNumber() {
    String mess = "Please enter the phone number";
    String phone_number = Graphics.imports2(mess);
    return phone_number;
  }
    /** Gets area
     * @return area
     */
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

    /** Gets amka
     * @return amka
     */
  public String theAmka() {
    String mess = "Please enter the AMKA";
    String amka = Graphics.imports2(mess);
    return amka;
  }
    /** Asks if the user wants statistics
     * @return the reply
     */
  public int theStatistics() {
    int reply = Graphics.theStatistics();
    while (reply != 1 && reply != 2) {
      System.out.println("Wrong answer, please try again");
      reply = Graphics.theStatistics();
    }
    return reply;
  }

}
