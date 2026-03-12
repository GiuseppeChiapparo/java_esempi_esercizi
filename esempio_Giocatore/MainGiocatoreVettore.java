package esempio_Giocatore;

import java.util.Scanner;

public class MainGiocatoreVettore {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int n; //grandezza del vettore

        //inserimento grandezza del vettore
        do{
            System.out.println("Quanti giocatori vuoi creare? ");
            n = tastiera.nextInt();
        } while(n <= 0);

        //creazione di un vettore di tipo Giocatore grande n
        Giocatore giocatori[] = new Giocatore[n];
        for(int i = 0; i < n; i++) {
            Giocatore g = new Giocatore();
            g.inserisciDati(tastiera);
            giocatori[i] = g;
        }

        //stampa del vettore giocatori
        System.out.println("Il vettore di giocatori creato e': ");
        for(int i = 0; i < n; i++) {
            System.out.println(giocatori[i].toString());
        }

        //calcolo della media: media dei goal segnati con il club dai giocatori
        int somma = 0;
        double media;
        for(int i = 0; i < giocatori.length; i++) {
            somma = somma + giocatori[i].getGoal();
        }
        media = (double)somma / n;
        System.out.println("La media dei goal con il club e': " + media);

        //calcolo del minimo: il numero minimo di goal segnati da un giocatore
        int minimo = giocatori[0].getGoal();
        for(int i = 1; i < n; i++) {
            int goalGiocI = giocatori[i].getGoal();
            if (goalGiocI < minimo) {
                minimo = goalGiocI;
            }
        }
        System.out.println("Il numero minimo di goal segnato e': " + minimo);

        //calcolo delle occorrenze: quanti giocatori sono capitani?
        int contaCapitani = 0;
        for(int i = 0; i < n; i++) {
            boolean capitanoGiocI = giocatori[i].isCapitano();
            if (capitanoGiocI == true) {
                contaCapitani++;
            }
        }
        System.out.println("Il numero di capitani e': " + contaCapitani);

        //presenza di un elemento: esiste un giocatore capitano?
        boolean esiste = false;
        for(int i = 0; i < n; i++) {
            boolean capitanoGiocI = giocatori[i].isCapitano();
            if (capitanoGiocI == true) {
                esiste = true;
                break; //esce dal ciclo for
            }
        }
        if(esiste == true) {
            System.out.println("Esiste almeno un giocatore capitano.");
        } else{
            System.out.println("Non esiste un giocatore capitano.");
        }

        //calcolo del massimo: nomi dei capocannonieri con il club
        int massimo = giocatori[0].getGoal();
        for(int i = 1; i < n; i++) {
            int goalGiocI = giocatori[i].getGoal();
            if(goalGiocI > massimo) {
                massimo = goalGiocI;
            }
        }
        System.out.println("I giocatori capocannonieri sono: ");
        for(int i = 0; i < n; i++) {
            int goalGiocI = giocatori[i].getGoal();
            if (goalGiocI == massimo) {
                System.out.println(giocatori[i].getNome());
            }
        }

        tastiera.close();
    }
}
