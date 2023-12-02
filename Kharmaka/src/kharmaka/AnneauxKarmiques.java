package kharmaka;

public class AnneauxKarmiques {
    private int quantite; // Quantité d'anneaux karmiques

    // Constructeur
    public AnneauxKarmiques() {
        this.quantite = 0; // Aucun anneau au début
    }

    // Méthodes
    public int getQuantite() {
        return quantite;
    }

    public void ajouterAnneaux(int nombre) {
        quantite += nombre;
    }

    public void enleverAnneaux(int nombre) {
        quantite -= nombre;
        if (quantite < 0) {
            quantite = 0; // Assurez-vous que la quantité ne devienne pas négative
        }
    }

    // Ajoutez d'autres méthodes si nécessaire
}
