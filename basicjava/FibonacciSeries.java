
package basicjava;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=8;
		int firstnum =0;
		int secondnum=1;
		
		System.out.println(firstnum);
		System.out.println(secondnum);
		
		for(int i=2;i<=num;i++) {
			int temp=0;
			temp=firstnum + secondnum;
			firstnum=secondnum;
			secondnum=temp;
			System.out.println(temp);
		}

	}

}
