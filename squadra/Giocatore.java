package squadra;

public class Giocatore {

    private String nome;
    private Squadra squadra;

    public Giocatore() {
    }

    public Giocatore(String nome, Squadra squadra) {
        this.nome = nome;
        this.squadra = squadra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Squadra getSquadra() {
        return squadra;
    }

    public void setSquadra(Squadra squadra) {
        this.squadra = squadra;
    }

    @Override
    public String toString() {
        return "Giocatore [nome=" + nome + ", squadra=" + squadra + "]";
    }

    boolean compagniDiSquadra(Giocatore altroGiocatore) {
        Squadra squadraGioc1 = this.getSquadra();
        Squadra squadraGioc2 = altroGiocatore.getSquadra();

        if(squadraGioc1.equals(squadraGioc2)) {
            return true;
        } else{
            return false;
        }
    }
    
}