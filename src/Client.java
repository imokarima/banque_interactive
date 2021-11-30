public class Client {
    private String nom;
    private int nbComptes=0;
    private Compte[] comptes=new Compte[100];

    public Client(){}
    public Client(String nom){
        this.nom=nom;
    }

    // pour récuperer le nom du client
    public String getNom() {
        return nom;
    }
    // pour créer les comptes d'un client
    public void creerComptes(int nbComptes){
        for (int i=0; i<nbComptes;i++){
            comptes[i]=new Compte(i);
        }
    }
    // pour ajouter un nouveau compte
    public void ajouterCompte(){
        comptes[++nbComptes]=new Compte(++nbComptes);
    }
    // pour récuperer la somme des soldes des comptes du client
    public float getSolde(){
        float solde=0;
        for(int i=0;i<nbComptes;i++){
            solde+=this.comptes[i].getSolde();
        }
        return solde;
    }

    public Compte getCompte(int num) {
        return comptes[num];
    }

    // pour afficher le solde de chaque compte du client
    public void afficherSolde(){
        for(int i=0;i<nbComptes;i++){
         this.comptes[i].afficherSolde();
        }
    }
}
