package day_3;
public class Demo1 extends object {
	int a=89;
	void add() {
		System.out.println(a);
	}
	void sub() {
		int a=89;
		System.out.println(this.a);
		this.add();
	}
	//local var

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
