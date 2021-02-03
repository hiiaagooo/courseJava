package mainApplicationExample;

import java.util.Locale;
import java.util.Scanner;

public class FirstMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle t = new Triangle();
		
		t.setA(sc.nextDouble());
		t.setB(sc.nextDouble());
		t.setA(sc.nextDouble());
		t.measureTriangleArea();
		t.showResult();
		
		sc.close();
	}

}
