public class Magasin {
    private int identifiant;
    private String adresse;
    private int capaciteMax;
    private Produit[] produits;
    private int nombreProduits;


    public Magasin(int identifiant, String adresse, int capaciteMax) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capaciteMax = capaciteMax;
        this.produits = new Produit[capaciteMax]; // Utilisation de la capacité maximale
        this.nombreProduits = 0;
    }


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public int getNombreProduits() {
        return nombreProduits;
    }


    public void ajouter(Produit p) {
        if (nombreProduits < capaciteMax) {
            produits[nombreProduits] = p;
            nombreProduits++;
            System.out.println("Produit ajouté avec succès !");
        } else {
            System.out.println("Impossible d'ajouter le produit. Capacité maximale atteinte.");
        }
    }


    public void afficherMagasin() {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Magasin ID: ").append(identifiant)
                .append(", Adresse: ").append(adresse)
                .append(", Capacité: ").append(capaciteMax)
                .append("\nProduits dans le magasin:\n");

        for (int i = 0; i < nombreProduits; i++) {
            sb.append("- ").append(produits[i].toString()).append("\n"); // Utilisation de la méthode toString() de Produit
        }
        return sb.toString();
    }
}
