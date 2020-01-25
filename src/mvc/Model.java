package mvc;

public class Model {
	
	private int solution = 0; 
	
	void add(int n1, int n2) {
		 solution = n1+n2;
	}
	
	int getSolution() {
		return solution;
	}
	
}
