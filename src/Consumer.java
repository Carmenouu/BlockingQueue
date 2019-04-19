
public class Consumer extends Thread {

	private Monitor boiteAuxLettres ;
	private String lettreC ;
	private boolean fini ;
	
	public Consumer(Monitor parM) {
		boiteAuxLettres = parM ;
		lettreC = new String() ;
		fini = false ;
	}
	
	public void run() {
		while (!fini) {
			lettreC = boiteAuxLettres.read() ;
			System.out.println(lettreC);
			
			if (lettreC.equals("Q")) {
				fini = true ;
			}
		}
		
	}
}
