package multiLevelInheritance;

public class mainClass {
	
	public static void main(String args[]) {
		
		
		Child1ofChild1 obj2 = new Child1ofChild1();
		
		System.out.println(obj2.sum(5, 15));
		System.out.println(obj2.sub(10, 5));
		System.out.println(obj2.mul(10, 5));
		System.out.println(obj2.div(10, 5));
	}

}
