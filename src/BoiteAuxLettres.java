import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;


public class BoiteAuxLettres {

	private BlockingQueue<String> bufferLettre ;
	private int tailleTampon = 20 ;
	
	public BoiteAuxLettres() {
		bufferLettre = new ArrayBlockingQueue<String>(tailleTampon) ;
	}
	
	
	//Méthode de lecture de la BAL
	public String read() {
		try {
			return bufferLettre.poll(200,TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Fin.") ;
		}
		return null;
	}
	
	
	//Méthode d'écriture dans le buffer
	public void write(String parLettre) {
		try {
			bufferLettre.offer(parLettre, 200, TimeUnit.MILLISECONDS) ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Fin.") ;
		}
	}
	
	public int getNombreLettres() {
		return bufferLettre.size() ;
	}

}
