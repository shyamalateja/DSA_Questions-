package java8;

public class MYRunnable1 {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<11;i++) {
				System.out.println("seetha thread");
			}
		};
		
		Thread thread=new Thread(r);
		thread.start();
		for(int i=0;i<11;i++) {
			System.out.println("rama thread");
		}
	}
}
