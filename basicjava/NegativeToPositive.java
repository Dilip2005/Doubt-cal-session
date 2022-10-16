package basicjava;

public class NegativeToPositive {

	public static void main(String[] args) {
		int num=-40;
		
		System.out.println("before convent the number:"  + num);
		if(num<0) {
			int positive=num*(-1);
			System.out.println("after convent thenumber :"+  positive);
		}
	}

}
