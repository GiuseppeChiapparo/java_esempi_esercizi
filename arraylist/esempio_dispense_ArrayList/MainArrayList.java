package esempio_dispense_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        ArrayList<Giocatore> giocatori = new ArrayList<>();

        System.out.println("Benvenuto nel programma in grado di gestire una " +
                           "squadra di calcio con gli ArrayList. ");
        int scelta;
        do {
            System.out.println("Cosa vuoi fare?\n" + 
                            " 0 - uscire dal programma\n" +
                            " 1 - Inserire un giocatore\n" +
                            " 2 - Visualizzare i giocatori nella squadra\n" +
                            " 3 - Modificare un giocatore\n" +
                            " 4 - Eliminare un giocatore\n");
            scelta = tastiera.nextInt();

            if (scelta == 1) {
                Giocatore g = new Giocatore();
                g.inserisciDati(tastiera);
                giocatori.add(g);
                System.out.println("Giocatore aggiunto con successo\n");
            } else if (scelta == 2) {
                System.out.println("I giocatori della squadra sono:");
                for(int i = 0; i < giocatori.size(); i++) {
                    Giocatore giocI = giocatori.get(i);
                    System.out.println(giocI.toString());
                }
                System.out.print("\n");
            } else if(scelta == 3) {
                System.out.println("I giocatori della squadra sono:");
                for(int i = 0; i < giocatori.size(); i++) {
                    Giocatore giocI = giocatori.get(i);
                    System.out.println("indice " + i + ": " + giocI.toString());
                }
                int indiceDaModificare;
                do{
                     System.out.println("Quale giocatore vuoi modificare? " +
                                   "Specifica l'indice del giocatore.");
                    indiceDaModificare = tastiera.nextInt();
                } while (indiceDaModificare < 0 || indiceDaModificare >= giocatori.size());

                Giocatore giocDamodificare = giocatori.get(indiceDaModificare);
                giocDamodificare.inserisciDati(tastiera);
                System.out.println("Giocatore modificato con successo.\n");
            } else if (scelta == 4) {
                System.out.println("I giocatori della squadra sono:");
                for(int i = 0; i < giocatori.size(); i++) {
                    Giocatore giocI = giocatori.get(i);
                    System.out.println("indice " + i + ": " + giocI.toString());
                }
                int indiceDaEliminare;
                do{
                    System.out.println("Quale giocatore vuoi eliminare? " +
                                   "Specifica l'indice del giocatore.");
                    indiceDaEliminare = tastiera.nextInt();
                } while (indiceDaEliminare < 0 || indiceDaEliminare >= giocatori.size());
                giocatori.remove(indiceDaEliminare);
                System.out.println("Giocatore eliminato con successo.\n");
            } else if(scelta < 0 || scelta >4) {
                System.out.println("Scelta non valida");
            }
            
        }while (scelta != 0);

        System.out.println("Uscita dal programma in corso.");
        System.out.println("Uscita dal programma avvenuta con successo.\n");

        tastiera.close();
    }
    
}
