
public class Consumer extends Thread {

	private Monitor boiteAuxLettres ;
	private String lettreC ;
	
	public Consumer(Monitor parM) {
		boiteAuxLettres = parM ;
		lettreC = new String() ;
	}
	
	public void run() {
		lettreC = boiteAuxLettres.read() ;
		System.out.println(lettreC);
	}
}
