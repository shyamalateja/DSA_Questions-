package java8;

import java.util.Iterator;
 // without lamda
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println("seetha thread");
		}
	}
	public static void main(String[] args) {
		
		 MyRunnable myRunnable=new MyRunnable();
		 
		/*myRunnable.run();  this is normal method calling*/
		 
		 Thread thread=new Thread(myRunnable);
		 thread.start();//runs by main()
		 for(int i=1;i<11;i++) {
				System.out.println("rama thread");
			}	 
	}
}
