package day2_Practice;

public class NestedForLoop {

	public static void main(String[] args) {
		int beg = 10;
		int end = 20 ;
		for( int i = beg ; i <= end ; i++) {
			for ( int j = 1 ; j <= beg ; j++) {
				System.out.println(i + "*" + j + "=" +i * j );
			}
		}

	}

}
