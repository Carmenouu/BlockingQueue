
public class Consumer extends Thread {

	private BoiteAuxLettres boiteAuxLettres ;
	private String lettreC ;
	private boolean fini = false ;
	
	public Consumer(BoiteAuxLettres parBAL) {
		boiteAuxLettres = parBAL ;
		lettreC = new String() ;
	}
	
	public void run() {
		while (!fini) {
			try {
				Thread.sleep(1000) ;
				lettreC = boiteAuxLettres.read() ;
				if (lettreC != null) {
					System.out.println(lettreC);
				}
				
				if (lettreC == "Q") {
					fini = true ;
					this.interrupt();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Fini.\n") ;
			}
		}
		
	}
}
