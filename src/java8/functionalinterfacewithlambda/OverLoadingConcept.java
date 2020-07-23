package java8.functionalinterfacewithlambda;

public class OverLoadingConcept {
	
	
	public void test(int i) {
	
		System.out.println("int Value :");
	}

	public void test(byte b) {
		
		System.out.println("byte Value :");
	}
	
	public void test(Integer i) {
		
		System.out.println("Integer Value :");
	}
	public void test(int... args) {
		System.out.println("var args value :");
	}
	
	public static void main(String[] args) {
		
		OverLoadingConcept olc=new OverLoadingConcept();
		olc.test(100);
		olc.test(1000000000);
		
	}
}
