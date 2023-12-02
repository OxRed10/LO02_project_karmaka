package kharmaka;

public class Carte {
    private String couleur; // rouge, vert, bleu, mosaïque
    private int points;
    private String pouvoir;

    // Constructeur
    public Carte(String couleur, int points, String pouvoir) {
        this.couleur = couleur;
        this.points = points;
        this.pouvoir = pouvoir;
    }

    // Méthodes
    public String getCouleur() {
        return couleur;
    }

    public int getPoints() {
        return points;
    }

    public String getPouvoir() {
        return pouvoir;
    }

    public void appliquerPouvoir(Joueur joueur) {
        // Logique pour appliquer le pouvoir de la carte sur le joueur
        // Cela dépendra de la nature spécifique du pouvoir de la carte
        // et des règles du jeu.
    }

    // Ajoutez d'autres méthodes si nécessaire
}
