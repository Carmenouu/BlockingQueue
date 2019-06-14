import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Producer extends Thread {
	private BoiteAuxLettres boiteAuxLettres ;
	private String lettreP ;
	private boolean fini = false ;
	
	public Producer(BoiteAuxLettres parBAL) {
		boiteAuxLettres = parBAL ;
		lettreP = new String() ;
	}
	
	public void run() {
		
		while (!fini) {
			try {
				BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Ecrire la lettre :");
				try{
					lettreP=keyboard.readLine();//Recup du texte
				}catch(IOException e){
					System.out.println("err");
				}
				
				if (lettreP.equals("Q")) {
					fini=true;
					this.interrupt();
				}
				
				boiteAuxLettres.write(lettreP) ;
				Thread.sleep(1000) ;
			} 
			
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Plus de lettres à écrire");
			}
		}
		

				
	}
}
