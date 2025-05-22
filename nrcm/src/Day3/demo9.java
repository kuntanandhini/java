package Day3;
interface I1 {
	void add();
}
interface I2{
	void sub();
}

public class demo9 implement I1 {
	public void add() {
		System.out.println("hi");
	}
public void sub() {
	System.out.println("hello");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test35 t1=new Test35();
		t1.add();
		t1.sub();
	}

	
