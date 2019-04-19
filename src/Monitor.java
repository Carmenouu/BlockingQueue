
public class Monitor {

	private String bufferLettre ;
	private boolean available ;
	
	public Monitor() {
		bufferLettre = new String() ;
		available = false ;
	}
	
	
	public synchronized String read() {
		while (!available) {
			try { wait(); }
			catch (InterruptedException e) {}
		}
		
		available = false ;
		String bufferToReturn = bufferLettre ;
		bufferLettre = null ;
		notifyAll();
		return bufferToReturn ;
	}
	
	
	//Méthode d'écriture dans le buffer
	public synchronized void write(String parLettre) {
		while (available) {
			try { wait(); }
			catch (InterruptedException e) {}
		}
		
		bufferLettre = parLettre ;
		available = true ;
		notifyAll();
	}

}
