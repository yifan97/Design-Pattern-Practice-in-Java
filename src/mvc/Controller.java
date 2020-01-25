package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	
	private Model model;
	private View view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
		
		view.addCalculatorListener(new addListener());
	}
	
	class addListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				int firstNumber = view.getFirstNumber();
				int secondNumber = view.getSecondNumber();
				model.add(firstNumber, secondNumber);
				view.setSolution(model.getSolution()+"");
			}catch(NumberFormatException err) {
				System.out.println(err);
				view.displayErrorMessage("You Need to Enter 2 Integers");
			}
			
		}
	}

}
