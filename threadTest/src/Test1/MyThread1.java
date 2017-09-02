package Test1;

public class MyThread1 extends Thread{

	private int count = 500;
	
	@Override
	synchronized public void run(){
		//super.run();
		while(count>=0){
			count--;
			System.out.println("count="+count+",name="+this.currentThread().getName());
		}
	}
}
