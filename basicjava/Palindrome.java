package basicjava;

public class Palindrome {

	public static void main(String[] args) {
		int num=3443;
		int temp,n1=0,n2;
		temp=num;
		while(temp!=0) {
			n2=temp%10;
			n1=n1*10+n2;
			temp=temp/10;
		}
if(n1==num) {
	System.out.println(num -- + " "+ "it is palindrome");
}else {
	System.out.println(num --+ " "+"not a plaindrome");
}
	}

}
