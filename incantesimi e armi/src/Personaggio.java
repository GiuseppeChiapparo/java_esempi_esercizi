import java.util.ArrayList;
import java.util.Arrays;

public class Personaggio {
	private String nome;
	private Arma zaino[];
	private ArrayList<Incantesimo> incantesimi;
	
	public int sommaUtilizziArmi() {
		int somma = 0;
		for(int i = 0; i < zaino.length; i++) {
			somma = somma + zaino[i].getNumUtilizzi();
		}
		return somma;
	}
	
	public double mediaEfficaciaIncantesimi() {
		double somma = 0;
		for(int i = 0; i < incantesimi.size(); i++) {
			somma = somma + incantesimi.get(i).getEfficacia();
		}
		return somma / incantesimi.size();
	}
	
	/*
	 * Metodo che calcola quante armi hanno ancora un numero di utilizzi maggiore di 10;
	 */
	public int armiUtilizzo10() {
		int contatore = 0;
		for(int i = 0; i < zaino.length; i++) {
			if (zaino[i].getNumUtilizzi() > 10) {
				contatore++;
			}
		}
		
		return contatore;
	}
	
	/*
	 * Metodo che stampa a schermo i nomi degli incantesimi 
	 * conosciuti dal personaggio con efficacia maggiore
	 */
	public void stampaIncantesimiMigliori() {
		int efficaciaMax = incantesimi.get(0).getEfficacia();
		
		for(int i = 1; i < incantesimi.size(); i++) {
			if (incantesimi.get(i).getEfficacia() > efficaciaMax) {
				efficaciaMax = incantesimi.get(i).getEfficacia();
			}
		}
		
		System.out.println("Gli incantesimi con massima efficacia: ");
		for(int i = 0; i < incantesimi.size(); i++) {
			if (incantesimi.get(i).getEfficacia() == efficaciaMax) {
				System.out.println(" - " + incantesimi.get(i).getNome());
			}
		}
	}
	
	/*
	 * Metodo che prende come parametro il nome di un incantesimo e restituisce
	 * true se tale incantesimo è tra quelli conosciuti dal Personaggio.
	 */
	public boolean conosceIncantesimo(String incantesimoDaCercare) {
		boolean incantesimoTrovato = false;
		
		for(int i = 0; i < incantesimi.size(); i++) {
			if (incantesimi.get(i).getNome().equalsIgnoreCase(incantesimoDaCercare)) {
				incantesimoTrovato = true;
				break;
			}
		}
		
		return incantesimoTrovato;

	}
	
	public Personaggio() {
	}
	
	public Personaggio(String nome, Arma[] zaino, ArrayList<Incantesimo> incantesimi) {
		super();
		this.nome = nome;
		this.zaino = zaino;
		this.incantesimi = incantesimi;
	}



	@Override
	public String toString() {
		return "Personaggio [nome=" + nome + ", zaino=" + Arrays.toString(zaino) + ", incantesimi=" + incantesimi + "]";
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Arma[] getZaino() {
		return zaino;
	}



	public void setZaino(Arma[] zaino) {
		this.zaino = zaino;
	}



	public ArrayList<Incantesimo> getIncantesimi() {
		return incantesimi;
	}



	public void setIncantesimi(ArrayList<Incantesimo> incantesimi) {
		this.incantesimi = incantesimi;
	}

	

}
