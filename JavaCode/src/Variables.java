package assignments;

public class Variables {
	
	int i = 123456;
	float f = 102.101f;
	double d = 100.10289;
	long l = 123456789101112l;
	boolean b = false;
	char c = 'N';
	String s = "I Love Jesus";
	
	public void varchar() {//method syntax
		System.out.println("Integer:" + i);
		System.out.println("Float:" + f);
		System.out.println("Double:" + d);
		System.out.println("Long:" + l);
		System.out.println("Boolean:" + b);
		System.out.println("Char:" + c);
		System.out.println("String:" + s);
	}
	
	
	public static void main(String[] args) {//main method
             Variables v = new Variables();//object creation
             v.varchar();//method calling
	}

}
