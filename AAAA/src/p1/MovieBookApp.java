package p1;
class TotalEarning extends Thread{
	 int total=0;
	@Override
	public void run() {
			for(int i=1;i<=10;i++) {
				total=total+100;
			}
			
		}
		
	
	
}
public class MovieBookApp {
public static void main(String[] args) throws InterruptedException {
	TotalEarning te=new TotalEarning();
	te.start();
	te.join();
	//System.out.println("total Earning are:"+te.total);
	
	
		System.out.println("total Earning are:"+te.total);
		
	
}
}
