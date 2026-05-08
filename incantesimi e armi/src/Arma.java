import java.util.Scanner;

public class Arma {
	private String nome;
	private int numUtilizzi;
	
	public Arma(String nome, int numUtilizzi) {
		super();
		this.nome = nome;
		this.numUtilizzi = numUtilizzi;
	}

	public Arma() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumUtilizzi() {
		return numUtilizzi;
	}

	public void setNumUtilizzi(int numUtilizzi) {
		this.numUtilizzi = numUtilizzi;
	}

	@Override
	public String toString() {
		return "Arma [nome=" + nome + ", numUtilizzi=" + numUtilizzi + "]";
	}
	
	public void inserisciDati(Scanner tastiera) {
		System.out.println("Inserisci nome: ");
		this.nome = tastiera.next();
		System.out.println("Inserisci numero di utilizzi: ");
		this.numUtilizzi =  tastiera.nextInt();
	}
	
	
	
}
