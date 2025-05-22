package Day_5;
import java.util.*;
public class demo3 {
	void add() throws ArithmeticException,InputMismatchtExecption{
		Scanner sc=new Scanner(System.in);
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			add(10,20);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}
}


