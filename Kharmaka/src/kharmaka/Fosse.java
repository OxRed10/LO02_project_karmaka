package kharmaka;

import java.util.ArrayList;

public class Fosse {
    private ArrayList<Carte> cartesFosse;

    // Constructeur
    public Fosse() {
        this.cartesFosse = new ArrayList<>();
    }

    // Méthodes
    public Carte removeDerniereCarte() {
        if (!cartesFosse.isEmpty()) {
            Carte derniereCarte = cartesFosse.remove(cartesFosse.size() - 1);
            return derniereCarte;
        } else {
            return null; // Retourner null si la liste est vide
        }
    }

    // Méthode add
    public void addCarte(Carte carte) {
        cartesFosse.add(carte);
    }
}
