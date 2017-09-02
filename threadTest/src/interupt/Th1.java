package interupt;

public class Th1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Thread.currentThread().interrupt();
		for(int i=0;i<100;i++){
			System.out.println("i="+i);
		}
		//System.out.println(Thread.currentThread().interrupted());
		//System.out.println("t="+Thread.currentThread().isInterrupted());
		
	}

}
