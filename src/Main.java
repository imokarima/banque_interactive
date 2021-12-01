public class Main {
    public static void main(String[] args) {
       Client client1=new Client("Karima");
       Client client2=new Client("karim");
       client1.creerComptes(1);
       client1.creerComptes(2);
       client2.creerComptes(3);
       client2.creerComptes(4);

       BanqueInteractive banqueInteractive=new BanqueInteractive();

       client1.getCompte(1);
       client1.afficherSolde();
       client1.getCompte(1).depot(1000);
       client1.getCompte(1).getSolde();

       client1.afficherSolde();
       client1.getCompte(1).afficherSolde();
       client2.renfouler(100,client2.getCompte(4));
       banqueInteractive.interaction();

    }
}
