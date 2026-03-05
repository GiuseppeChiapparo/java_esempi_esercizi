public class Albero {
    
    private String specie;
    private double altezza;
    
    public Albero(){

    }

   public String toString(){
    return"specie:" + this.specie + " altezza:" + this.altezza;

   }
   public void inserisciDati(Scanner tastiera){
  
    System.out.println("inserisci la specie");
    this.specie=tastiera.next();
    System.out.println("inserisci l'altezza");
    this.altezza=tastiera.nextDouble();

   }

   

  
   
}
