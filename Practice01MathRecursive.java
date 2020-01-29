//Michael Miranda
//20507364

public class Practice01MathRecursive implements Practice01Math{


	public int fact(int n) throws ArithmeticException{
		if (n<0)	
			throw new ArithmeticException();

		if (n == 1)
			return 1;
		return n * fact(n-1);
	}

	public  int fib (int n) throws ArithmeticException{
		if (n<0)	
			throw new ArithmeticException();

		if (n == 0)
			return 0;
		else if(n == 1)
			return 1;

		return fib(n-1) + fib(n-2); 
	}
}