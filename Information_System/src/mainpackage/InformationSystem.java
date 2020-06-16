package mainpackage;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InformationSystem {

	public static void main(String[] args) {
			View view;
			Model model;
			MainController controller;
			
			view = new LoginView();
			model = new LoginModel();
			controller =new MainController(view,model);
			
	}
}
	
	

