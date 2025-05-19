package nrcm1;
interface season1{
	void winter();
}
interface season2{
	void summer();
	
}
class Test1{
	void season2() {
		System.out.println("season2 is cool");
	}
}
class Test2 extends Test1 implements season1,season2{
	public void rainy() {
		System.out.println("rainyseason");
	}
	public void winter() {
		System.out.println("winterseason");
	}
	public void summer() {
		System.out.println("summerseason");
	}
}
class Test3 extends Test2{
	public void cool() {
		System.out.println("coolday");
	}
}
public class Demo5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		t2.rainy();
		t2.season2();
		t2.winter();
		t2.summer();
		t1.season2();
		t3.cool();
		t3.rainy();

	}

}

