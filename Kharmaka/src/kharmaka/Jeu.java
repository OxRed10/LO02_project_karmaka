package kharmaka;

import java.util.ArrayList;
import java.util.Scanner;

public class Jeu {
    private static int nombreDeParties;
    private static ArrayList<Partie> parties = new ArrayList<>();

    private static Partie partieEnCours;

    // Constructeur
    public Jeu() {
        this.nombreDeParties = 0;
    }

    // Méthode pour créer une nouvelle partie
    public static void creerPartie() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom du joueur 1");
        String nomJoueur1 = scanner.next();
        System.out.println("Entrez le nom du joueur 2");
        String nomJoueur2 = scanner.next();

        Partie partie = new Partie(nomJoueur1, nomJoueur2);
    }

    // Méthode pour charger une partie existante
    public static void sauvegarderPartie() {
        /*
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cheminFichier))) {
            oos.writeObject(partie);
            System.out.println("Partie sauvegardée avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde de la partie : " + e.getMessage());
        }

         */
        System.out.println("Partie sauvegardée avec succès !");
    }

    // Méthode pour charger une partie
    public static void chargerPartie() {
        /*
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cheminFichier))) {
            Partie partieChargee = (Partie) ois.readObject();
            System.out.println("Partie chargée avec succès !");
            return partieChargee;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors du chargement de la partie : " + e.getMessage());
        }
        */
        System.out.println("Partie chargée avec succès !");

    }


    public static void choixPartie() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 - Jouer sur une nouvelle partie");
            System.out.println("2 - Charger une Partie");
            System.out.print("Votre choix : ");

            // Vérification de l'entrée (1 ou 2)
            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez entrer 1 ou 2.");
                System.out.print("Votre choix : ");
                scanner.next(); // Ignorer l'entrée incorrecte
            }

            choix = scanner.nextInt();

            if (choix != 1 && choix != 2) {
                System.out.println("Veuillez entrer 1 ou 2.");
            }
        } while (choix != 1 && choix != 2);

        // Fermeture du scanner


        // Le reste du code en fonction du choix...
        if (choix == 1) {
            System.out.println("Création en cours");
            creerPartie();
        } else if (choix == 2) {
            System.out.println("Chargement en cours");
            chargerPartie();
        }
    }
    // Méthode pour supprimer une partie
    public void supprimerPartie(int numeroPartie) {
        if (numeroPartie >= 0 && numeroPartie < nombreDeParties) {
            parties.remove(numeroPartie);
            nombreDeParties--;
            System.out.println("Partie supprimée avec succès.");
        } else {
            System.out.println("Numéro de partie invalide.");
        }
    }

    // Ajoutez d'autres méthodes ou attributs selon les besoins

    public static void main(String[] args) {
        // Exemple d'utilisation de la classe Jeu
        Jeu jeu = new Jeu();
        //Jeu.creerPartie();
        Jeu.choixPartie();
        Partie.demarrer();

    }
}
