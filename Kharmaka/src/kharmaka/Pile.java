package kharmaka;

import java.util.*;

public class Pile {
    private static ArrayList<Carte> cartesDansPile;

    // Constructeur
    public Pile() {
        this.cartesDansPile = new ArrayList<>();
    }

    // Méthodes
    public static void addCarte(Carte carte) {
        cartesDansPile.add(carte);
    }

    public static Carte removeDerniereCarte() {
        if (!cartesDansPile.isEmpty()) {
            Carte derniereCarte = cartesDansPile.remove(cartesDansPile.size() - 1);
            return derniereCarte;
        } else {
            return null; // Retourner null si la liste est vide
        }
    }

    public boolean estVide() {
        return cartesDansPile.isEmpty();
    }

    public void setCartesDansPile(ArrayList<Carte> nouvellesCartesDansPile) {
        // Ajouter les nouvelles cartes à la pile existante
        cartesDansPile.addAll(nouvellesCartesDansPile);
        // Vous pouvez également mélanger les cartes ici si nécessaire
    }

    // Ajoutez d'autres méthodes ou attributs selon les besoins
}

