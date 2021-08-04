package hybridInheritance;

public class Class1 implements Interface1 {
	
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a +b;
	}
	
	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a -b;
	}

	public int mul(int a, int b) {
		
		return a * b;
	}
}
