//Michael Miranda
//20507364

public class Practice01MathIterative implements Practice01Math{
	public int fact(int n) throws ArithmeticException{
		if (n<0)	
			throw new ArithmeticException();
		int num = 1;
		for(int i = n; i != 1; i--){
			num *=i;
		}
		return num;

	}
	public int fib (int n) throws ArithmeticException{
		if (n<0)	
			throw new ArithmeticException();
		
		if (n ==0)
			return 0;
		int current = 1, prev = 0, storage = 1;

		for(int i = 1; i!=n; i++){
			storage = current + prev;
			prev = current;
			current = storage;
		}
		return current;
	}
}