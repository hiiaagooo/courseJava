package partTwo;

public class DolarQuotation {
	static double IOF = 1.10;
	static double real;

	public static double getValueInReal(double euroPrice, double quantityEuro) {
		real =  (euroPrice * quantityEuro);
		return ((real * IOF) / 100) + real;
	}
	
}
