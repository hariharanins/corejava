package day2_Practice;

public class SwitchDemo {

	public static void main(String[] args) {
		char x = 'l';
		switch (x)
		{
		case 'l':
		case 'L':
			System.out.println(x+" is a greater letter");
		break;
		case 'd':
		case 'D':
			System.out.println(x + " is a digit");
			break;
		case 'w':
		case 'W':
			System.out.println(x + " is a white space");
			break;
			default:
				System.out.println(x + " is other than letter, digit , white space");
		}
		}
	}
