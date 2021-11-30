import java.util.Scanner;

public class BanqueInteractive {
    private int nbClient=1;
    private Client[] clients=new Client[100];

    // ajouter un client
    public void ajouterClient(){
        this.clients[++nbClient]=new Client();
    }

    // afficher le bilan de tous les comptes du client numéro donné en paramètre
    public void bilanClient(int numClient){
            clients[numClient].afficherSolde();
    }

    public Client getClient(int num) {
            return this.clients[num];
    }

    Scanner s=new Scanner(System.in);
    public void interaction(){
        System.out.println("Quelle opération voulez-vous effectuer ?" +
                        " \n  1) Ajouter un client  "
                        + "\n 2) Effectuer une operation sur un client"
                        + "\n 3) Afficher un bilan général"
                 );
        int choix=s.nextInt();
        System.out.println("- "+choix);
        switch (choix){
            case 1:
                this.ajouterClient();
                break;
            case 2:
                System.out.println("Vous voulez quoi exactement ?");
                break;
            case 3:
                System.out.println("Quel est votre numéro client");
                int num=s.nextInt();
                this.bilanClient(num);
                break;
        }
        System.out.println("Entrez le nom du client");
        String nom=s.nextLine();
        System.out.println("- "+nom +" \n Le client "+nom+" a été crée."
                            +" \n Quelle opération voulez-vous effectuer?" +
                            " \n  1) Afficher un bilan"
                            + "\n 2) Faire un retrait"
                            + "\n 3) Faire un depot"
                            + "\n 4) Faire un virement"
                    );
        System.out.println("Quel est votre numéro client");
        int num=s.nextInt();
        int choix2=s.nextInt();
        float valeur=0;
        float valeur2=0;
        switch (choix2){
            case 1:
                this.getClient(num).afficherSolde();
            break;
            case 2:
                System.out.println("combien voulez-vous retirer");
                valeur=s.nextFloat();
                this.getClient(num).getCompte(num).retrait(valeur);
            break;
            case 3:
                System.out.println("combien voulez-vous deposer");
                valeur2=s.nextFloat();
                this.getClient(num).getCompte(num).depot(valeur2);
                break;
            case 4:
                System.out.println("combien voulez-vous virer");
                float virement;
                virement=s.nextFloat();
                this.getClient(num).getCompte(num).virer(virement,getClient(num+1).getCompte(num+1));

                break;
        }

    }
}
