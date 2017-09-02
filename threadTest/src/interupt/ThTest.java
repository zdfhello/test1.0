package interupt;

public class ThTest {
	public static void main(String[] args) {
		try {
			Th1 th = new Th1();
			Thread t = new Thread(th);
			t.start();
			t.interrupt();
			t.sleep(2000);
			//Thread.currentThread().interrupt();
			System.out.println("main="+t.isInterrupted());
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
