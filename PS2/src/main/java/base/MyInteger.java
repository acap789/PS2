package base;

public class MyInteger {
	
	private int iValue;
	
	public int getValue() {
		return iValue;
	}
	
	public MyInteger(int num) {
		this.iValue = num;
	}
	
	public boolean isEven() {
		if (iValue%2==0) {
			return true;
		}
		return false;
	}
	
	public boolean isOdd() {
		if (iValue%2!=0) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime() {
		for (int factor = 2; factor < iValue / 2; factor++) {
			if (iValue%factor==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int n) {
		if (n%2==0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int n) {
		if (n%2!=0) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int n) {
		for (int factor = 2; factor < n/2; factor++) {
			if (n%factor==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger iValue) {
		return iValue.isEven();
	}
	
	public static boolean isOdd(MyInteger iValue) {
		return iValue.isOdd();
	}
	
	public static boolean isPrime(MyInteger iValue) {
		return iValue.isPrime();
	}
	
	public boolean Equals(int n) {
		return (iValue ==n);
	}
	
	public boolean Equals(MyInteger n) {
		return Equals(n.getValue());
	}
}


