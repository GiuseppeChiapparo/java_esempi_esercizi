package esercizio_5_social;

import java.util.Arrays;
import java.util.Scanner;

public class Social {
    private String nome;
    private String descrizione;
    private int anno;
    private Account accounts[];

    public Social() {
    }

    public Social(String nome, String descrizione, int anno, Account[] accounts) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.anno = anno;
        this.accounts = accounts;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Social [nome=" + nome + ", descrizione=" + descrizione + ", anno=" + anno + ", accounts="
                + Arrays.toString(accounts) + "]";
    }

    public void inserisciDati(Scanner tastiera) {
        System.out.println("Creazione di un social network");
        System.out.print("Nome: ");
        this.nome = tastiera.next();
        tastiera.nextLine(); //libero il buffer
        System.out.print("Descrizione: ");
        this.descrizione = tastiera.nextLine();
        System.out.print("Anno di creazione: ");
        this.anno = tastiera.nextInt();

        int numAccounts;
        do{
            System.out.print("Quanti account ci sono nel social? ");
            numAccounts = tastiera.nextInt();
        } while(numAccounts <= 0);

        this.accounts = new Account[numAccounts];

        for(int i = 0; i < this.accounts.length; i++) {
            this.accounts[i] = new Account();
            this.accounts[i].inserisciDati(tastiera);
        }
    }

    public int calcolaNumeroInfluencer() {
        int numInfluencer = 0;

        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i].getNumFollowers() > 10000) {
                numInfluencer++;
            }
        }

        return numInfluencer;
    }

    public double calcolaMediaPostCreati() {
        int somma = 0;
        double media;

        for (int i = 0; i < this.accounts.length; i++) {
            somma = somma + accounts[i].getPostPubblicati();
        }

        media = (double) somma / this.accounts.length;
        
        return media;
    }
    
    public void stampaAccountPiuFollowers () {
        int maxFollowers = this.accounts[0].getNumFollowers();

        for (int i = 1; i < this.accounts.length; i++) {
            int followersAccountI = this.accounts[i].getNumFollowers();
            if(followersAccountI > maxFollowers) {
                maxFollowers = followersAccountI;
            }
        }

        System.out.println("Gli account con il maggior numero di " +
                           "followers sono: ");
        for (int i = 0; i < accounts.length; i++) {
            int followersAccountI = this.accounts[i].getNumFollowers();
            if(followersAccountI == maxFollowers) {
                String nicknameI = this.accounts[i].getNickname();
                System.out.println(nicknameI);
            }
        }
    }

    /*
         Creare un metodo in grado di ordinare gli elementi del 
         vettore in ordine decrescente sulla base del numero di 
         follower.
         Scelgo di usare il metodo selection sort
    */
    public void ordinaVettore() {

        for (int i = 0; i < accounts.length; i++) {
            int maxFollowers = accounts[i].getNumFollowers();
            int indiceMax = i;
            for (int j = i+1; j < accounts.length; j++) {
                int numFollowersJ = accounts[j].getNumFollowers();
                if (numFollowersJ > maxFollowers) {
                    maxFollowers = numFollowersJ;
                    indiceMax = j;
                }
            }

            Account temp = accounts[i];
            accounts[i] = accounts[indiceMax];
            accounts[indiceMax] = temp;
        }
    }

    public boolean trovaAccount(String nicknameDaTrovare) {
        boolean trovato = false;

        for (int i = 0; i < accounts.length; i++) {
            String nicknameI = accounts[i].getNickname();
            if(nicknameI.equalsIgnoreCase(nicknameDaTrovare)) {
                trovato = true;
                break;
            }
        }

        return trovato;
    }

}
