import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Producer extends Thread {
	private Monitor boiteAuxLettres ;
	private String lettreP ;
	private boolean fini ;
	
	public Producer(Monitor parM/*, String parLettre*/) {
		boiteAuxLettres = parM ;
		//lettreP = parLettre ;
		lettreP = new String() ;
		fini = false ;
	}
	
	public void run() {
		
		while (!fini) {
			BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ecrire la lettre :");
			try{
				lettreP=keyboard.readLine();//Recup du texte
			}catch(IOException e){
				System.out.println("err");
			}
			
			if (lettreP.equals("Q")) {
				fini = true ;
			}
			
			boiteAuxLettres.write(lettreP) ;
			try {
				sleep(100) ;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
