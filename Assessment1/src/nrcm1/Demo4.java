package nrcm1;
interface resturant{
	void delight();
}
interface paradise{
	void patney();
}
class abhiruchi{
	void biryani() {
		System.out.println("tasty");
	}
}
class place extends abhiruchi implements resturant,paradise{
	public void places() {
		System.out.println("kompally");
	}
	public void delight() {
		System.out.println("good place ");
	}
	public void patney() {
		System.out.println("before secundrabad ");
	}
	}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abhiruchi f1=new abhiruchi();
		place p1=new place();
		p1.delight();
		p1.patney();
		p1.places();
		f1.biryani();

	}
}

