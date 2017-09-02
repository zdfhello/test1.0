package Test1;

public class MyTest {

	public static void main(String[] args) {
//		MyThread mt = new MyThread();
//		mt.setName("myThread");
//		mt.start();
//		try {
//			for(int i=0;i<10;i++){
//				int time = (int) (Math.random()*1000);
//				Thread.sleep(time);
//				System.out.println("��ǰ�߳�="+Thread.currentThread().getName());
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		MyThread1 tm1 = new MyThread1();
//		MyThread1 tm2 = new MyThread1();
//		MyThread1 tm3 = new MyThread1();
//		tm1.start();
//		tm2.start();
//		tm3.start();
		MyThread1  tm1 = new MyThread1();
		Thread t = new Thread(tm1,"a");
		Thread t2 = new Thread(tm1,"b");
		Thread t3 = new Thread(tm1,"c");
		t.start();
		t2.start();
		t3.start();
	}
}
