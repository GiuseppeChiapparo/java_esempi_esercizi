package esercizio_5_social;

import java.util.Scanner;

public class Account {
    private String nickname;
    private int postPubblicati;
    private int numFollowers;
    private int numSeguiti;
    
    public void inserisciDati(Scanner tastiera){
        System.out.println("Creazione di un account");
        System.out.print("Nickname: ");
        this.nickname = tastiera.next();
        System.out.print("Numero di Post pubblicati: ");
        this.postPubblicati = tastiera.nextInt();
        System.out.print("Numero di followers: ");
        this.numFollowers = tastiera.nextInt();
        System.out.print("Numero di seguiti: ");
        this.numSeguiti = tastiera.nextInt();
    }

    public Account() {
    }

    public Account(String nickname, int postPubblicati, int numFollowers, int numSeguiti) {
        this.nickname = nickname;
        this.postPubblicati = postPubblicati;
        this.numFollowers = numFollowers;
        this.numSeguiti = numSeguiti;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPostPubblicati() {
        return postPubblicati;
    }

    public void setPostPubblicati(int postPubblicati) {
        this.postPubblicati = postPubblicati;
    }

    public int getNumFollowers() {
        return numFollowers;
    }

    public void setNumFollowers(int numFollowers) {
        this.numFollowers = numFollowers;
    }

    public int getNumSeguiti() {
        return numSeguiti;
    }

    public void setNumSeguiti(int numSeguiti) {
        this.numSeguiti = numSeguiti;
    }

    @Override
    public String toString() {
        return "Account [nickname=" + nickname + ", postPubblicati=" + postPubblicati + ", numFollowers=" + numFollowers
                + ", numSeguiti=" + numSeguiti + "]";
    }    
}
