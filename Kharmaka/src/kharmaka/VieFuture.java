package kharmaka;

import java.util.*;


public class VieFuture {
    private ArrayList<Carte> cartesVieFuture;

    // Constructeur
    public VieFuture() {
        this.cartesVieFuture = new ArrayList<>();
    }

    // Méthodes
    public void ajouterCarte(Carte carte) {
        cartesVieFuture.add(carte);
    }

    public ArrayList<Carte> getCartesVieFuture() {
        return cartesVieFuture;
    }

    // Ajoutez d'autres méthodes ou attributs selon les besoins
}

