package mvc;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{
	
	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	public View(){
		
		JPanel panel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		panel.add(firstNumber);
		panel.add(additionLabel);
		panel.add(secondNumber);
		panel.add(calculateButton);
		panel.add(calcSolution);
		this.add(panel);
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getSolution() {
		return getFirstNumber() + getSecondNumber();
	}
	
	public void setFirstNumber(String num) {
		firstNumber.setText(num);
	}
	
	public void setSecondNumber(String num) {
		secondNumber.setText(num);
	}
	
	public void setSolution(String num) {
		calcSolution.setText(num);
	}
	
	public void addCalculatorListener(ActionListener listenForAddBtn) {
		calculateButton.addActionListener(listenForAddBtn);
	}
	
	public void displayErrorMessage(String e) {
		JOptionPane.showMessageDialog(this, e);
	}

	
}
