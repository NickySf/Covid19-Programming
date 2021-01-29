//Conversion of the data the user insert, to the word they represent//
/** This class converts the data the user inserts,
 * to the word they represent
 */
public class Converts {

  public static int[] patientsPerArea = new int [11];

  //Gender convert//

	 /**This methd converts the gender
	   *
	   * @param x gender's number
	   * @return the gender
	   */

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

  //Test Result Conversion//
	 /**This method converts the test result
	   *
	   * @param x result's number
	   * @return the result
	   */
  public String convertResults(int x) {

    String reply = " ";
    switch (x) {
      case 1:
        reply = "positive";
        break;
      case 2:
        reply = "negative";
        break;
    }
    return reply;
  }

  //Area Conversion//
	/**This methd converts the area
	   *
	   * @param x area's number
	   * @return the area
	   */
  public String convertArea(int x) {
    patientsPerArea[x - 1]++;
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
