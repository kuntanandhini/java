package Day_4;
import java.util.*;
public class demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		{
			try {
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=a/b;
				System.out.println(c);
			}catch(ArithmeticException|IntoutMismatchException e) {
				System.out.println(e.getMessage());
			
				
			
			}
		}
	}			
			
	

	


