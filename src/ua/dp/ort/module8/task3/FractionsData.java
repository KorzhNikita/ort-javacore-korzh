package ua.dp.ort.module8.task3;

public class FractionsData {

	private long integer;
	private short fractional;
	
	//constructor
	public FractionsData (long integer, short fractional) {
		setFractional(fractional);
		setInteger(integer);
	}

	//setters
	public void setInteger(long integer) {
		this.integer = integer;
	}
	
	public void setFractional(short fractional) {
		this.fractional = fractional;
	}
	
	//getters
	public long getInteger() {
		return integer;
	}
	public short getFractional() {
		return fractional;
	}
	public double shortToDouble (short shorty){
		double fractional = shorty;
		while (fractional >= 1) {
			fractional = fractional / 10;
		}
		return fractional;
	}
	//operations
	public static void addition (long integerX, long integerY, double fractionalX, double fractionalY){
		double answer = fractionalX + fractionalY + integerX + integerY;
		System.out.println((integerX + fractionalX) + " + "
						+ (integerY + fractionalY) + " = "
						+ answer);
	}
	
	public static void substraclion (long integerX, long integerY, double fractionalX, double fractionalY){
		double answer = fractionalX - fractionalY + integerX - integerY;
		System.out.println((integerX + fractionalX) + " - "
				+ (integerY + fractionalY) + " = "
				+ answer);
	}
	
	public static void multiplication (long integerX, long integerY, double fractionalX, double fractionalY){
		double answer = (fractionalX + integerX) * (fractionalY + integerY);
		System.out.println((integerX + fractionalX) + " * "
				+ (integerY + fractionalY) + " = "
				+ answer);
	}
	
	public static void division (long integerX, long integerY, double fractionalX, double fractionalY){
		double answer = (fractionalX + integerX) / (fractionalY + integerY);
		System.out.println((integerX + fractionalX) + " / "
				+ (integerY + fractionalY) + " = "
				+ answer);
	}
	
	public static void comparison (long integerX, long integerY, double fractionalX, double fractionalY){
		if ((fractionalX + integerX) > (fractionalY + integerY)) {
			System.out.println("Первое число больше второго.");
		} else if ((fractionalX + integerX) < (fractionalY + integerY)) {
			System.out.println("Второе число больше первого.");
		} else 
			System.out.println("Числа равны.");
	}
}
