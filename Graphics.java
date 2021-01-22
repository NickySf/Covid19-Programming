import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Graphics {
	public static void eisagwgh() {
		JFrame wi = new JFrame("Είσοδος");
		wi.setBounds(0, 0, 800, 600);
		wi.setLayout(new BorderLayout());

		wi.add(new JButton("Καλωσορίσατε στην ιστοσελίδα του υπουργείου"),BorderLayout.CENTER);
		wi.setVisible(true);
		}

		public static void telos() {
			JFrame wi = new JFrame("Έξοδος");
			wi.setBounds(0, 0, 800, 600);
			wi.setLayout(new BorderLayout());

			wi.add(new JButton("Σας ευχαριστούμε για την καταχώρηση"),BorderLayout.CENTER);
			wi.setVisible(true);
		}

		public static int imports1(String message) {
			String number = JOptionPane.showInputDialog(message);
			int ar= Integer.parseInt(number);
			return ar;
		}

		public static String imports2(String message) {
			String number = JOptionPane.showInputDialog(message);
			return number;
		}
}