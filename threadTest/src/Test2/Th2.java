package Test2;

public class Th2 extends Thread{

	public Th2(){
		System.out.println("th="+Thread.currentThread().getName());
		System.out.println("this="+this.getName());
	}
	public void run(){
		Test1.doPost("a", "aa");
	}
}
