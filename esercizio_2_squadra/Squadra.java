package esercizio_2_squadra;

public class Squadra {
    private String nome;

    public Squadra() {
    }

    public Squadra(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Squadra [nome=" + nome + "]";
    }

    
}
