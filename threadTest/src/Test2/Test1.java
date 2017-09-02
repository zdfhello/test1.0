package Test2;

public class Test1 {

	private static String username;
	private static String password;
	synchronized public static void doPost(String u,String p){
		username = u;
		if(username.equals("q")){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		password = p;
		System.out.println("username="+username+",password="+password);
	}
}
