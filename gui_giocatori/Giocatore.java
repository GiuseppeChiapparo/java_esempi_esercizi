
public class Giocatore {
    private String nome;
    private int goal;
    private int goalNazionale;
    private boolean capitano;

    public Giocatore(String nome, int goal, int goalNazionale, boolean capitano) {
        this.nome = nome;
        this.goal = goal;
        this.goalNazionale = goalNazionale;
        this.capitano = capitano;
    }

    // Getter e Setter
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getGoal() { return goal; }
    public void setGoal(int goal) { this.goal = goal; }

    public int getGoalNazionale() { return goalNazionale; }
    public void setGoalNazionale(int goalNazionale) { this.goalNazionale = goalNazionale; }

    public boolean isCapitano() { return capitano; }
    public void setCapitano(boolean capitano) { this.capitano = capitano; }

    @Override
    public String toString() {
        return nome + " | Goal: " + goal + " | Nazionale: " + goalNazionale + 
               " | Capitano: " + (capitano ? "Sì" : "No");
    }
}