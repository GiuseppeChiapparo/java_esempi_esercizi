import java.util.ArrayList;
import java.util.Scanner;

public class MainIncantesimo {

	public static void main(String[] args) {
		//creare un ArrayList di tipo Incantesimo
		ArrayList<Incantesimo> incantesimi = new ArrayList<>();
		Scanner tastiera = new Scanner(System.in);
		
		String scelta;
		//far aggiungere incantesimi fino a che ne ha voglia l'utente
		do {
			//creo un oggetto di tipo Incantesimo e inserisco i dati da tastiera
			Incantesimo incantesimoCreato = new Incantesimo();
			incantesimoCreato.inserisciDati(tastiera);
			
			//aggiungo l'oggetto creato all'ArrayList
			incantesimi.add(incantesimoCreato);
			
			//chiedo se ne vuole aggiungere un altro
			System.out.println("Vuoi creare un nuovo incantesimo? (si/no)");
			scelta = tastiera.next();
		} while (scelta.equalsIgnoreCase("si"));
		
		//mostrare a schermo gli incantesimi
		
		System.out.println("Gli incantesimi creati sono: ");
		for (int i = 0; i < incantesimi.size(); i++) {
			System.out.println(incantesimi.get(i).toString());
		}
		
		
	}

}
