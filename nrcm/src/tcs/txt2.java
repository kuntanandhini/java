package Day5;

 class txt2 extends Thread{
	public void run() {
		System.out.println("hi");
	}
	
}
class txt3 implement Runnable{
	public void run()
	{ System.out.println("good mng");
	}}
class txt{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		txt2 t1=new txt2();
		txt3 t2=new txt3();
		
		//System.out.println("hello");
		t1.start();
		Thread t3=new Thread(t2);
		
		t3.run();
	}

}


