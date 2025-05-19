package nrcm1;
interface ac{
	void air();
	}
class cooler{
	public void fan() {
		System.out.println("cool air");
	}
}
class tablefan extends cooler implements ac{
	public void cool() {
		System.out.println("Aircondition");
	}
	public void air() {
		System.out.println("tablefan");
	}
}

public class Demo3 extends tablefan {
	public void heat() {
		System.out.println("hotair");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tablefan t=new tablefan();
		Demo3 q=new Demo3();
		t.air();
		q.heat();
		t.cool();
		t.air();
		}
}

