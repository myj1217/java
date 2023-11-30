package sec02.ex01;

public class Exchange {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		a = a + b;  // 30
		b = a - b;  // 10
		a = a - b;  // 20
		
		/*int temp = a;
		a = b;
		b = temp;*/
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		// System.out.println(temp);
	}

}
