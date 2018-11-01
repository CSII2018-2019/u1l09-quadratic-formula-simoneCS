

import javax.swing.JOptionPane;



public class U1L09Quadratics {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Choose an 'a' value");

		double a = Double.parseDouble(answer);

		String answer2 = JOptionPane.showInputDialog("Choose a 'b' value");

		double b = Double.parseDouble(answer2);

		String answer3 = JOptionPane.showInputDialog("Choose a 'c' value");

		double c = Double.parseDouble(answer3);

		quadratic(a,b,c);

		

		

	}

	public static double quadratic (double a, double b, double c) {

		double x = (-b + (Math.sqrt((b * b) - (4*a*c))))/(2*a);

		double xdos = (-b - (Math.sqrt((b * b) - (4*a*c))))/(2*a);

		System.out.println("The first root is: " + x);

		System.out.println("The second root is: " + xdos);

		return x;

	}

}