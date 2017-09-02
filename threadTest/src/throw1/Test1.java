package throw1;

public class Test1 {
	public static void main(String[] args) {
		try {
			th t = new th();
			t.start();
			t.sleep(10);
			//5tt.stop();
			//t.interrupt();
		} catch (InterruptedException e) {
			System.out.println("end");
			// TODO: handle exception
		}
	}
}
