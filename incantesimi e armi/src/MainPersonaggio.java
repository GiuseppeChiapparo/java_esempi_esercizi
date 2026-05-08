import java.util.ArrayList;

public class MainPersonaggio {

	public static void main(String[] args) {
		Arma zaino[] = new Arma[4];
		zaino[0] = new Arma("bacchetta", 100);
		zaino[1] = new Arma("Spada", 150);
		zaino[2] = new Arma("Arco e freccia", 8);
		zaino[3] = new Arma("Sasso", 1);
		
		ArrayList<Incantesimo> incantesimi = new ArrayList<>();
		Incantesimo inc = new Incantesimo("Leviosa", 100);
		incantesimi.add(inc);
		incantesimi.add(new Incantesimo("Lumus",20));
		incantesimi.add(new Incantesimo("Alohomora", 100));
		
		Personaggio p1 = new Personaggio("Harry Potter", zaino, incantesimi);
		
		//Se si implementa il metodo inserisciDati nella classe Personaggio puoi richiamare
		//Personaggio p1 = new Personaggio();
		//p1.inserisciDati(tastiera);
		
		int sommaUtilizziArmi = p1.sommaUtilizziArmi();
		System.out.println("Somma utilizzi armi: " + sommaUtilizziArmi);
		double media = p1.mediaEfficaciaIncantesimi();
		System.out.println("Media efficacia incantesimi: " + media);
		
		int armiMaggiore10 = p1.armiUtilizzo10();
		System.out.println("Armi con utilizzo maggiore di 10: " + armiMaggiore10);

		p1.stampaIncantesimiMigliori();
		
		if(p1.conosceIncantesimo("Leviosa") == true) {
			System.out.println(p1.getNome() + " conosce l'incantesimo cercato.");
		} else {
			System.out.println(p1.getNome() + " non conosce l'incantesimo cercato.");

		}
		

	}

}
