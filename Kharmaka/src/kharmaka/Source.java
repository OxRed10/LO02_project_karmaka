package kharmaka;

import java.util.ArrayList;
import java.util.Collections;

public class Source {
    private ArrayList<Carte> cartesSource;

    // Constructeur
    public Source() {
        this.cartesSource = new ArrayList<Carte>();
        melangerCartes();
    }
    private void melangerCartes() {
        Collections.shuffle(cartesSource);
    }

    // Méthodes
    public Carte removeDerniereCarte() {
        if (!cartesSource.isEmpty()) {
            Carte derniereCarte = cartesSource.remove(cartesSource.size() - 1);
            return derniereCarte;
        } else {
            return null; // Retourner null si la liste est vide
        }
    }

    // Méthode add
    public void addCarte(Carte carte) {
        cartesSource.add(carte);
    }


}

