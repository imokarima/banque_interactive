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
    // pour allimenter le compte avec d'autres comptes
    public void renfouler(float valeur ,Compte compte){
        for(int i =0;i<nbComptes;i++){
            if(nbComptes==1){
                System.out.println("vous avez qu'un seul compte et il est négatif");
            }else if(nbComptes>1){
                if(this.comptes[i].getSolde()>0){
                    this.comptes[i].virer(valeur, compte);
                }
            }
        }
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
