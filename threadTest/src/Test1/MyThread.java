package Test1;

public class MyThread extends Thread{


	//456
	//345354
	@Override
	public void run(){
		super.run();
		try {
			for(int i=0;i<10;i++){
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("Thread="+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
