package lesson4.factorial;

public class FactorialFinder {
	
	public int factorialOf (int x) {
		int c, fact = 1;

            for ( c = 1 ; c <= x ; c++ )
                fact *= c;
			return fact;
	}
}