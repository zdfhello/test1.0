package Test2;

public class MyTest {

	public static void main(String[] args) {
		Th1 th1 = new Th1();
		Th2 th2 = new Th2();
		System.out.println("isAlive="+th1.isAlive());
		th1.start();
		System.out.println("isAlive1="+th1.isAlive());
		th2.start();
		System.out.println("th1Id="+th1.getId());
		System.out.println("th2Id="+th2.getId());
	}
}
