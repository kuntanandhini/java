package nrcm1;
interface I1{
	void write();
}
interface I2{
	void help();
}
interface I3 extends I1,I2{
	void game();
}
class view{
	public void picture() {
		System.out.println("picturing");
	}
}
public class Demo7 extends view implements I3{
	public void write() {
		System.out.println("writing");
	}
    public void help() {
    	System.out.println("helping");
    }
    public void game() {
    	System.out.println("gaming");
    }
    public void read() {
    	System.out.println("reading");
    }
	public static void main(String[] args) {
		Demo7 e=new Demo7();
		e.write();
		e.help();
		e.game();
		e.read();
	}
}