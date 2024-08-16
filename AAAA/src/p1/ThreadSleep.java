package p1;

public class ThreadSleep extends Thread{
public static void main(String[] args) {
	ThreadSleep ts=new ThreadSleep();
	ts.start();
}
public void run() {
	for(int i=0;i<10;i++) {
		try {
			Thread.sleep(1000);
			System.out.println("run");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

}
