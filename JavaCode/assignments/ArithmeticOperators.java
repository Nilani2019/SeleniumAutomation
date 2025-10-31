package assignments;

public class ArithmeticOperators {
	int a = 200;
	int b = 300;
	public void addNumbers() {//method syntax
		
		System.out.println("Addition of a+b:" + (a+b));
		System.out.println("Subtraction of a-b:" + (a-b));
		System.out.println("Multiplication of a*b:" + (a*b));
		System.out.println("Division of a/b:" + (a/b));
	}

	public static void main(String[] args) {//main method
		ArithmeticOperators ao = new ArithmeticOperators();//object creation
		ao.addNumbers();
	}
	
}
