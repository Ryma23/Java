
public class Main {
    public static void main(String[] args) {


        Produit P1 = new Produit(1020, "Pain", "Baguette", 0.300);
        Produit P2 = new Produit(1021, "Lait", "Delice", 0.0);
        Produit P3 = new Produit(2521, "Yaourt", "Vitalait", 0.0);
        Produit P4 = new Produit(3250, "Tomate", "Sicam", 1.200);


        P1.afficher();
        P2.afficher();
        P3.afficher();
        P4.afficher();


        P2.addPrice();
        P3.addPrice();
        P4.addPrice();


        System.out.println(P2.toString());
        System.out.println(P3.toString());
        System.out.println(P4.toString());


        P2.setPrice(520);
        P2.afficher();
        P3.setPrice(600);
        P3.afficher();


        Magasin magasin = new Magasin(1, "123 Rue Principale", 50);


        magasin.ajouter(P1);
        magasin.ajouter(P2);
        magasin.ajouter(P3);
        magasin.ajouter(P4);
        magasin.afficherMagasin();
        System.out.println(magasin.toString());
    }
}
