package nrcm1;
interface nani{
	void eega();
}
interface vijay extends nani{
	void evade();
}
 class sample implements vijay{
	public void anushka() {
		System.out.println("anushka1");
	}
	public void eega() {
		System.out.println("eega1");
	}
	public void evade() {
		System.out.println("evade1");
	}
 }
	
 class sample21 implements vijay{
	public void anushka2() {
		System.out.println("anushka2");
	}
	public void eega() {
		System.out.println("eega2");
	}
	public void evade() {
		System.out.println("evade2");
	}
	
}

public class Demo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s1=new sample();
		sample21 s2=new sample21();
		s1.anushka();
		s2.anushka2();
		s1.eega();
		s1.evade();
		s2.eega();
		s2.evade();
		
        

	}

}
