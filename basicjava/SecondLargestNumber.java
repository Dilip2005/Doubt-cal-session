package basicjava;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
	  int number[]= {23,45,67,32,89,22 };
	  int n=number.length;
	  Arrays.sort(number);
	  
	  System.out.println("second smallest number :"+number[(n-2)]);

	}

}
