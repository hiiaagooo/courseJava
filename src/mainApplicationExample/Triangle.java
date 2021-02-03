package mainApplicationExample;

public class Triangle {

	double a;
	double b;
	double c;
	double area;

	public double measureTriangleArea() {
		double p = (a + b + c) / 2;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}

	public void showResult() {
		System.out.println("Area: " + area);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
