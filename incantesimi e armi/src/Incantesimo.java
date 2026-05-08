import java.util.Scanner;

public class Incantesimo {
	private String nome;
	private int efficacia;
	
	public Incantesimo() {
		super();
	}

	public Incantesimo(String nome, int efficacia) {
		this.nome = nome;
		this.efficacia = efficacia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEfficacia() {
		return efficacia;
	}

	public void setEfficacia(int efficacia) {
		this.efficacia = efficacia;
	}

	@Override
	public String toString() {
		return "Incantesimo [nome=" + nome + ", efficacia=" + efficacia + "]";
	}
	

	public void inserisciDati(Scanner tastiera) {
		System.out.println("Inserisci nome: ");
		this.nome = tastiera.next();
		System.out.println("Inserisci efficacia: ");
		this.efficacia =  tastiera.nextInt();
	}
	
}
