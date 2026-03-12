import java.util.Scanner;

public class MainAlbero{
    public static void main(String args[]){
        Scanner tastiera = new Scanner(System.in);
        /*chiedi il numero di alberi da mettere nel vettore */
        int n;
        do {
            System.out.print("Quanti alberi vuoi creare?");
            n = tastiera.nextInt();
        } while(n <= 0);

        /*crea vettore che contiene oggetti di tipo Albero*/
        // int voti[] = new int[n];
        Albero alberi[] = new Albero[n];
        /*crea oggetti da mettere nel vettore */
        for(int i = 0; i < n; i++) {
            Albero a = new Albero();
            a.inserisciDati(tastiera);
            alberi[i] = a;
        }
        //stampare il vettore
        System.out.println("Il contenuto del vettore");
        for (int i = 0; i < n; i++) {
            System.out.println( alberi[i].toString() );
        }

        
        

    }
}