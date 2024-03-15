package day2_Practice;

public class Continue {

	public static void main(String[] args) {
		for(int i =10 ; i <=20 ; i++) {
			if(i%2 == 0) // even numbers are skipped
				continue;
			System.out.println(i + " ");
		}

	}

}
