
public class Producer extends Thread {
	private Monitor boiteAuxLettres ;
	private String lettreP ;
	
	public Producer(Monitor parM, String parLettre) {
		boiteAuxLettres = parM ;
		lettreP = parLettre ;
	}
	
	public void run() {
		boiteAuxLettres.write(lettreP) ;
	}
}
