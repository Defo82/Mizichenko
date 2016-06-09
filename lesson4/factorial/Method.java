package lesson4.factorial;

public class Method {
	
	public int factorialOf (int x) {
		int c, fact = 1;

            for ( c = 1 ; c <= x ; c++ )
                fact *= c;
			return fact;
	}
}