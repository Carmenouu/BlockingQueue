
public class Test {
	
	public static void main(String args[]) {
		BoiteAuxLettres bal = new BoiteAuxLettres() ;
		Consumer c = new Consumer(bal) ;
		Producer p = new Producer(bal) ;
		p.start();
		c.start();
		
	}

}
