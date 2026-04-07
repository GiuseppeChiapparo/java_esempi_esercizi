package social_5;

import java.util.Scanner;

public class MainSocial {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Social social = new Social();
        social.inserisciDati(tastiera);

        int numInfluencer = social.calcolaNumeroInfluencer();
        double mediaPost = social.calcolaMediaPostCreati();

        System.out.println("Nel social ci sono " + numInfluencer + 
                            " influencers." );
        System.out.println("La media dei post creati dagli utenti: " 
                            + mediaPost);
        social.stampaAccountPiuFollowers();

        social.ordinaVettore();

        System.out.println(social.toString());

        System.out.println("Dimmi il nome di un utente che vuoi " +
                            "cercare:");
        String nicknameDaCercare = tastiera.next();

        if(social.trovaAccount(nicknameDaCercare) == true) {
            System.out.println("L'account cercato esiste!");
        } else {
            System.out.println("L'account cercato non esiste!");
        }

        tastiera.close();

    }
}
