import java.util.Scanner;

public class MainArma {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		//Creare un vettore di oggetti di tipo Arma grande n
		int n;
		do {
			System.out.println("Inserisci la grandezza del vettore: ");
			n = tastiera.nextInt();
		} while(n <= 0);
		
		Arma[] armi = new Arma[n]; 
		
		for (int i = 0; i < n; i++) {
			Arma a = new Arma();
			a.inserisciDati(tastiera);
			armi[i] = a;
		}
		
		//stamparlo a schermo
		System.out.println("Le armi presenti nel vettore creato sono: ");
		for (int i = 0; i < n; i++) {
			System.out.println(armi[i].toString());
		}

	}

}
