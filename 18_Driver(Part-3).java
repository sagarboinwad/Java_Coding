package thread_practice;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		OddEven o = new OddEven();

		PrimNumber p = new PrimNumber();
		
		o.start();
		o.join();
		p.start();

	}

}
