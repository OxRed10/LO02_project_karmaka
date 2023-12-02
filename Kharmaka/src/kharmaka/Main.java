package kharmaka;

import java.util.*;

public class Main {
    private static ArrayList<Carte> cartesEnMain;

    // Constructeur
    public Main() {
        this.cartesEnMain = new ArrayList<>();
    }

    // Méthodes
    public static void addCarte(Carte carte) {
        cartesEnMain.add(carte);
    }


    public void retirerCarte(Carte carte) {
        cartesEnMain.remove(carte);
    }

    public ArrayList<Carte> getCartesEnMain() {
        return cartesEnMain;
    }

    public void setCartesEnMain(ArrayList<Carte> nouvellesCartesEnMain) {
        cartesEnMain = nouvellesCartesEnMain;
    }

    // Ajoutez d'autres méthodes ou attributs selon les besoins
}

