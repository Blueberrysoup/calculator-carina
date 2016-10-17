
public class Calculator {

		public double add(double a, double b){
			return a + b;
		}
		
		public double subtract(double a, double b){
			return a - b;
		}
		
		public double multiply(double a, double b){
			return a * b;
		}
		
		public double divide(double a, double b){
			if (b != 0.0)
				return a/b;
			else {
				throw new java.lang.ArithmeticException("Can't divide by zero!");
			}	
		}
}
