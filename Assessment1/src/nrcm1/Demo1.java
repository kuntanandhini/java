package nrcm1;
interface I1 {
	void add();
}
interface I2{
	void sub();
}

interface I3 extends I1,I2 {
	void mul();
}
class sample2{
	void div() {
		System.out.println("helloooo");
	}
}
public class Demo1 extends sample2 implements I3{
	public class Demo2 {

	}

	public void add() {
		System.out .println("hi");
	}
	public void sub() {
		System.out.println("hilo");
	}
	public void mul(){
		System.out.println("hiloo");
	}

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
	}

	}


