
public class Test {
	
	public static void main(String args[]) {
		Monitor bal = new Monitor() ;
		Consumer c = new Consumer(bal) ;
		Producer p = new Producer(bal, "Test du moniteur") ;
		p.run();
		c.run();
	}

}
