package kharmaka;

import java.util.ArrayList;
import java.util.Scanner;

public class Partie {
    private ArrayList<Joueur> Joueurs;

    private Source source;
    private Fosse fosse;

    private Boolean enCoursDeJeu = true;

    private static Joueur player1, player2;

    // Constructor
    public Partie(String nomJoueur1, String nomJoueur2) {

        player1 = new Joueur(nomJoueur1);

        player2 = new Joueur(nomJoueur2);

        ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
        joueurs.add(player1);
        joueurs.add(player2);
        // Ne fermez pas le scanner ici
        System.out.println("Nouvelle partie créée avec succès.");

    }

    // Méthode pour obtenir la source de la partie
    public Source getSource() {
        return source;
    }

    // Méthode pour obtenir la fosse de la partie
    public Fosse getFosse() {
        return fosse;
    }

    public static void partieEnCours(){
        boolean enCoursDeJeu = true;
    }

    public static void partieEnPause(){
        boolean enCoursDeJeu = false;
    }

    // Ajoutez d'autres méthodes ou attributs selon les besoins


    public void demarrer() {

        tourInitialisation();
        tourNormal();

    }

    private static void tourInitialisation() {

        Fosse fosse = new Fosse();
        Source source = new Source();

        //distribution de cartes joueur1
        for (int i = 1; i <= 4; i++){
            Carte carteTransfert = source.removeDerniereCarte();
            player1.addCarteMain(carteTransfert);
        }
        for (int i = 1; i <= 4; i++){
            Carte carteTransfert = source.removeDerniereCarte();
            player2.addCarteMain(carteTransfert);
        }
        for (int i = 1; i <= 2; i++){
            Carte carteTransfert = source.removeDerniereCarte();
            player1.addCartePile(carteTransfert);
        }
        for (int i = 1; i <= 2; i++){
            Carte carteTransfert = source.removeDerniereCarte();
            player2.addCartePile(carteTransfert);
        }
    }

    public static void tourNormal() {
        //etape 1
        player1.piocherPileMain();

        //etape 2
        //afficher la main
        System.out.println("Comment voulez vous jouer votre tour ?");



    }

}
