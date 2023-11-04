package jLabelApp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CreateJFrame {
	private static JFrame frame; // imports frame

	public static void main(String[] args) {
		frame = new JFrame("Booking System");
		JPanel panel = new JPanel();
		frame.setSize(600, 600); // Sets the size of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To close frame
		frame.setLocation(800, 250); // Sets frame location on the screen
		frame.add(panel); // adds the panel to the frame

		panel.setLayout(null);

		JLabel titleLabel = new JLabel("Register User");
		titleLabel.setBounds(250, 10, 80, 25); // padding
		panel.add(titleLabel); // adds the label to the panel

		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(10, 50, 80, 25);
		panel.add(firstNameLabel);

		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(10, 80, 80, 25);
		panel.add(lastNameLabel);

		JLabel userNameLabel = new JLabel("Username");
		userNameLabel.setBounds(10, 110, 80, 25);
		panel.add(userNameLabel);

		JLabel passwordLabel = new JLabel("Password"); // password label keeps the text hidden
		passwordLabel.setBounds(10, 140, 80, 25);
		panel.add(passwordLabel);

		JTextField firstNameuserText = new JTextField(20);
		firstNameuserText.setBounds(90, 50, 165, 25);
		panel.add(firstNameuserText);

		JTextField lastNameUserText = new JTextField(20);
		lastNameUserText.setBounds(90, 80, 165, 25);
		panel.add(lastNameUserText);

		JTextField userNameUserText = new JTextField(20);
		userNameUserText.setBounds(90, 110, 165, 25);
		panel.add(userNameUserText);

		JPasswordField passwordUserText = new JPasswordField(20);
		passwordUserText.setBounds(90, 140, 165, 25);
		panel.add(passwordUserText);

		JButton button = new JButton("Submit");
		button.setBounds(250, 180, 80, 25);
		panel.add(button);

		frame.setVisible(true); // Shows frame on screen
	}
}