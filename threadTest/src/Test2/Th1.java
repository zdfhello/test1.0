package Test2;

public class Th1 extends Thread{

	public void run(){
		Test1.doPost("q", "qq");
		System.out.println("currenth="+Thread.currentThread().getName());
		System.out.println("name="+this.getName());
	}
}
