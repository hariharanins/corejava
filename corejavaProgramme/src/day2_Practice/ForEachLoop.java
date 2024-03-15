package day2_Practice;

public class ForEachLoop {    /// used to print all elements in the array

	public static void main(String[] args) {
// intiger array
		int a[] = {1,2,3,4,5};
		for (int i:a)
		{
			System.out.println(i);
		}

// character array
		char ch[] = {'J','A','V','A'};
		for(char c:ch)
		{
			System.out.print(c);
		}
		System.out.println(" ");
				
		
// string array
		String s1[] = {"JAVA","PROGRAMMING","LANGUAGE"};
		for (String s:s1)
		{
			System.out.print(s +" ");
		}
		
	

}
}