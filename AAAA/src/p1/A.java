package p1;

public class A extends B{
	public static void main(String[] args) {
		B b1=new A();
		b1.test();
		
	}

	@Override
	public void test() {
		System.out.println("from A");
		
	}

}
