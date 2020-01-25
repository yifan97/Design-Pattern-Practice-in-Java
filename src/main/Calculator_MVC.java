package main;

import mvc.Controller;
import mvc.Model;
import mvc.View;

public class Calculator_MVC {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		view.setVisible(true);
	}
}
