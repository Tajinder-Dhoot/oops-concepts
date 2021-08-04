package hybridInheritance;

public class mainClass {

	public static void main(String args[]) {
		
		Class2 obj = new Class2();
		
		System.out.println(obj.sum(5, 10));
		System.out.println(obj.sub(10, 5));
		System.out.println(obj.mul(10, 5));
		System.out.println(obj.div(10, 5));
		System.out.println(obj.square(5));
		System.out.println(obj.cube(5));
	}
}
