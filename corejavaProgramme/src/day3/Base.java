package day3;

public class Base {
	/*
	 * Declaring default,public,private and protected variables 
	 */
	
	int vardefault=10;
	public int varpublic=11;
	private int varprivate=22;
	protected int varprotected=30;
	/*
	 * Declaring methods with default , public , private and protected types
	 */
	
	
	void methoddefault()
	{		
		System.out.println("access the default modifier");
		System.out.println("default variable : "+vardefault);

	}

	public void methodpublic()
	{
		System.out.println("access the public modifier");
		System.out.println("public variable : "+varpublic);
	}
	
	private void methodprivate()
	{
		System.out.println("access the private modifier");
		System.out.println("private variable : "+varprivate);
	}
	
	protected void methodprotected()
	{
		System.out.println("access the protected modifier");
		System.out.println("protected variable : "+varprotected);
	}
	
}
