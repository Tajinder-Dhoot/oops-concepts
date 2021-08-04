package hybridInheritance;

public class Class2 extends Class1 implements Interface2 {
	
	@Override
	public int square(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}
	
	@Override
	public int cube(int a) {
		// TODO Auto-generated method stub
		return a*a*a;
	}
	
	public int div(int a, int b) {
		
		return a / b;
	}
}
