
public class Main {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		System.out.println("15 + 3 = " + myCalc.add(15, 3));
		System.out.println("32 - 12 = " + myCalc.subtract(32, 12));
		System.out.println("20 * 2 = " + myCalc.multiply(20, 2));
		System.out.println("18 / 3 = " + myCalc.divide(18,  3));
		System.out.println("18 / 0 = " + myCalc.divide(18,  0));

	}

}
