package throw1;

public class th extends Thread{

	public void run(){
		super.run();
		try {
			for(int i=0;i<100000;i++){
//				if(this.interrupted()){
//					System.out.println("ÔËÐÐ½áÊø");
//					throw new InterruptedException();
//				}
				System.out.println("i="+i);
			}
			Thread.sleep(3000);
			System.out.println("fordpwn");
		} catch (InterruptedException e) {
			System.out.println("hello");
			// TODO: handle exception
		}
	}
}
