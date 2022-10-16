package basicjava;

public class PrimeNumber {

	public static void main(String[] args) {

			int n=13;
	    boolean val = false;
	   for(int i=0;i<=n-1;i++)
	    {
		   if (n%2==0)
	    	{
	    	val = true;
	    		break;
	    	}
	    }
	    	if (val != true)
	    	{
	    		System.out.println(n + "  is a prime number");
	    	}
	    	else
	    	{
	    		System.out.println(n + "  is not a prime number");	
	    	}
	    
		}
	}


