import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Graphics {

  //Welcoming Window
  public static void eisagwgh() {
    JFrame wi = new JFrame("Entry");
    wi.setBounds(0, 0, 800, 600);
    wi.setLayout(new BorderLayout());
    wi.add(new JButton("Welcome to the webpage"), BorderLayout.CENTER);
    wi.setVisible(true);
  }

  //closing window
  public static void telos() {
    JFrame wi = new JFrame("Exit");
    wi.setBounds(0, 0, 800, 600);
    wi.setLayout(new BorderLayout());
    wi.add(new JButton("Thankyou for the data!"), BorderLayout.CENTER);
    wi.setVisible(true);
  }

  //Message print and Data insert(int) window
  public static int imports1(String message) {
    String number = JOptionPane.showInputDialog(message);
    try {
      int ar = Integer.parseInt(number);
      return ar;
    } catch (NumberFormatException e) {
      number = JOptionPane.showInputDialog(message);
      int ar = Integer.parseInt(number);
      return ar;
    }
  }

  //Message print and Data insert(String) window//
  public static String imports2(String message) {
    String number = JOptionPane.showInputDialog(message);
    return number;
  }

  //Window for area selection
  public static int menu() {
    String num = JOptionPane.showInputDialog("Please enter your area number\n"
        + "1.Attiki\n"
        + "2.Thessaloniki\n"
        + "3.Hpeiros\n"
        + "4.Macedonia\n"
        + "5.Thraki\n"
        + "6.Eptanhsa\n"
        + "7.Thessalia\n"
        + "8.Sterea Ellada\n"
        + "9.Peloponnissos\n"
        + "10.Nhsia Aigaiou\n"
        + "11.Krhth");
    int ar = Integer.parseInt(num);
    return ar;
  }

  //Window for test result selection//
  public static int result() {
    String num = JOptionPane.showInputDialog("Please enter the result of the test\n"
        + "1.Positive\n"
        + "2.Negative");
    int ar = Integer.parseInt(num);
    return ar;
  }

  //Window for gender selection//
  public static int gender() {
    try {
      String num = JOptionPane.showInputDialog("Please enter the gender's number\n"
          + "1.Male\n"
          + "2.Female\n"
          + "3.Other");
      int ar = Integer.parseInt(num);
      return ar;
    } catch (NumberFormatException e) {
      String num = JOptionPane.showInputDialog("Please enter the gender's number\n"
          + "1.Male\n"
          + "2.Female\n"
          + "3.Other");
      int ar = Integer.parseInt(num);
      return ar;
    }
  }

  //Window for the statistics' print selection//
  public static int theStatistics() {
    try {
      String num = JOptionPane.showInputDialog("Do you want the statistics? \n"
          + "1.Yes\n"
          + "2.No");
      int ar = Integer.parseInt(num);
      return ar;
    } catch (NumberFormatException e) {
      String num = JOptionPane.showInputDialog("Do you want the statistics? \n"
          + "1.Yes\n"
          + "2.No");
      int ar = Integer.parseInt(num);
      return ar;
    }
  }

  //Window for the continuing of the procedure selection//
  public static int term() {
    try {
      String num = JOptionPane.showInputDialog("Do you want to continue the procedure? \n"
          + "1.Yes\n"
          + "2.No");
      int ar = Integer.parseInt(num);
      while (ar != 1 && ar != 2) {
        num = JOptionPane.showInputDialog("Do you want to continue the procedure? \n"
            + "1.Yes\n"
            + "2.No");
        ar = Integer.parseInt(num);
      }
      return ar;
    } catch (NumberFormatException e) {
      String num = JOptionPane.showInputDialog("Do you want to continue the procedure? \n"
          + "1.Yes\n"
          + "2.No");
      int ar = Integer.parseInt(num);
      while (ar != 1 && ar != 2) {
        num = JOptionPane.showInputDialog("Do you want to continue the procedure? \n"
            + "1.Yes\n"
            + "2.No");
        ar = Integer.parseInt(num);
      }
      return ar;
    }





  }
}



