package esercizio_2_squadra;

import java.util.Scanner;

public class MainGiocatori {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        //creazione di due squadre in maniera hard coded
        Squadra s1 = new Squadra("Roma");
        Squadra s2 = new Squadra("Lazio");

        //chiedi all'utente quanti giocatori vuole creare
        int n;

        do{
            System.out.println("Quanti giocatori vuoi creare?");
            n = tastiera.nextInt();
        } while (n <= 0);


        //Utilizza un vettore  di tipo Giocatore per memorizzare i giocatori.  
        Giocatore giocatori[] = new Giocatore[n];

        //Per ciascun giocatore, chiedi all'utente:  
        for(int i = 0; i < giocatori.length; i++) {
            System.out.println("Creazione giocatore " + (i+1) + ": ");
            Giocatore g = new Giocatore();
            
            System.out.println("Inserisci il nome: ");
            String nomeGiocI = tastiera.next();
            System.out.println("Di che squadra sei? 1 - Roma, 2 - Lazio");
            int numSquadra = tastiera.nextInt();
            Squadra squadraGiocI;
            if (numSquadra == 1) {
                squadraGiocI = s1;
            } else{
                squadraGiocI = s2;
            }

            g.setNome(nomeGiocI);
            g.setSquadra(squadraGiocI);

            giocatori[i] = g;
        }  

        //Dopo la creazione di ogni giocatore, verifica se appartiene alla 
        // stessa squadra del giocatore creato precedentemente e stampa un 
        // messaggio a schermo con il risultato.
        for(int i = 1; i < giocatori.length; i++) {
            if(giocatori[i].compagniDiSquadra(giocatori[i-1]) == true) {
                System.out.println(giocatori[i].getNome() + " e " + 
                giocatori[i-1].getNome() + " appartengono alla stessa squadra");
            } else {
                System.out.println(giocatori[i].getNome() + " e " + 
                giocatori[i-1].getNome() + " non appartengono alla stessa squadra");
            }
        }

        //Al termine, stampa il numero totale di giocatori per ciascuna squadra
        int contaRoma = 0;
        int contaLazio = 0;

        for(int i = 0; i < giocatori.length; i++) {
            String nomeSquadraI = giocatori[i].getSquadra().getNome();
            if(nomeSquadraI.equals(s1.getNome())){
                contaRoma++;
            } else {
                contaLazio++;
            }
        }

        System.out.println("Calciatori della Roma:" + contaRoma);
        System.out.println("Calciatori della Lazio: " + contaLazio);

        tastiera.close();
    }
}