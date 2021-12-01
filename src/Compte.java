public class Compte {
    private int numero;
    private float solde;

   public Compte(int num, float s){
       this.numero=num;
       this.solde=s;
   }
   public Compte(int num){
       this.numero=num;
   }

    // pour fair eun depot sur le compte
    public void depot(float valeur){
        this.solde+=valeur;
    }
    // pour faire un retrait sur le compte
    public void retrait(float valeur){
        this.solde-=valeur;
    }
    // pour obtenir la valeur du solde
    public float getSolde() {
        return solde;
    }
    // pour afficher le solde
    public void afficherSolde(){
        System.out.println("Le solde est du compte numéro "+this.numero+ " :"+this.solde);
    }

    // pour faire un virement dans un autre compte dest
    public void virer(float valeur, Compte dest){
        dest.solde+=valeur;
    }

    public int getNumero() {
        return numero;
    }

}
