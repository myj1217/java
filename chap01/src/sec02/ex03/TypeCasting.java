package sec02.ex03;

public class TypeCasting {

	public static void main(String[] args) {
		int myInt1 = 9;
		double myDouble1 = myInt1;
		
		System.out.println(myInt1);
		System.out.println(myDouble1);
		
		double myDouble2 = 9.78;
		int myInt2 = (int) myDouble2;
		
		System.out.println(myDouble2);
		System.out.println(myInt2);
	}

}
