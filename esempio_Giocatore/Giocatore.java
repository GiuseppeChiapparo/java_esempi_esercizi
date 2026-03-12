package esempio_Giocatore;

import java.util.Scanner;

public class Giocatore {
    private String nome;
    private boolean capitano;
    private int goal;
    private int goalNazionale;

    public Giocatore() {
    }

    public Giocatore(String nome, boolean capitano, int goal, int goalNazionale) {
        this.nome = nome;
        this.capitano = capitano;
        this.goal = goal;
        this.goalNazionale = goalNazionale;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public void setGoalNazionale(int goalNazionale) {
        this.goalNazionale = goalNazionale;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isCapitano() {
        return this.capitano;
    }

    public int getGoal() {
        return this.goal;
    }

    public int getGoalNazionale() {
        return this.goalNazionale;
    }

    @Override
    public String toString() {
        return "Giocatore [nome=" + nome + ", capitano=" + capitano + ", goal=" + goal + ", goalNazionale="
                + goalNazionale + "]";
    }

    public void inserisciDati(Scanner tastiera) {
        System.out.print("Inserisci il nome del giocatore: ");
        this.nome = tastiera.next();
        System.out.print("Inserisci se e' capitano (true o false): ");
        this.capitano = tastiera.nextBoolean();
        System.out.print("Inserisci i goal con il club: ");
        this.goal = tastiera.nextInt();
        System.out.print("Inserisci i goal fatti in nazionale: ");
        this.goalNazionale = tastiera.nextInt();
    }

    
    
}
