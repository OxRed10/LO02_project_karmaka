package kharmaka;

import java.util.*;


public class Joueur {
	private String nom;
	private Stack<Carte>vieFuture;
	private Stack<Carte>pile;
	private Stack<Carte>oeuvres;
	private Stack<Carte>main;
	private int echelleKarmique = 4;
	private AnneauxKarmiques anneauxKarmiques;


	// Constructeur
	public Joueur(String nom) {
		this.nom = nom;
		this.vieFuture = new Stack<Carte>();
		this.oeuvres = new Stack<Carte>();
		this.pile = new Stack<Carte>();
		this.main = new Stack<Carte>();
		this.anneauxKarmiques = new AnneauxKarmiques();

	}

	public Stack<Carte> getMain() {
		return main;
	}
	public void addCarteMain (Carte carte){
		main.push(carte);
	}
	public Carte removeCarteMain(){
		Carte carteTransfert = main.pop();
		System.out.println("Vous avez piochez :" + carteTransfert);
		return carteTransfert;
	}

	public Stack<Carte> getPile() {
		return pile;
	}
	public void addCartePile (Carte carte){
		pile.push(carte);
	}
	public Carte removeCartePile(){
		Carte carteTransfert = pile.pop();
		System.out.println("Vous avez piochez :" + carteTransfert);
		return carteTransfert;
	}

	public Stack<Carte> getOeuvre() {
		return oeuvres;
	}
	public void addCarteOeuvre (Carte carte){
		oeuvres.push(carte);
	}
	public Carte removeCarteOeuvre(){
		Carte carteTransfert = oeuvres.pop();
		System.out.println("Vous avez piochez :" + carteTransfert);
		return carteTransfert;
	}

	public Stack<Carte> getVieFuture() {
		return vieFuture;
	}
	public void addCarteVieFuture (Carte carte){
		vieFuture.push(carte);
	}
	public Carte removeCarteVieFuture(){
		Carte carteTransfert = main.pop();
		System.out.println("Vous avez piochez :" + carteTransfert);
		return carteTransfert;
	}

	public void piocherPileMain(){
		addCarteMain(removeCartePile());
	}



	// Méthode pour jouer un tour
	public void jouerTour() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Voulez vous sauvegardez et quitter la partie ? (o/n)");
		String sauvegarde = scanner.next();
		scanner.close();

		if (sauvegarde == "o"){
			Jeu.sauvegarderPartie();

		} else if (sauvegarde == "n") {

			// Étape 1: Piocher une carte de la Pile
			Carte cartePiochee = pile.retirerCarte();
			main.addCarte(cartePiochee);

			// Étape 2: Jouer une carte
			// (Note: La logique exacte dépendra du mécanisme de jeu spécifique à chaque carte)
			Carte carteAJouer = choisirCarteAJouer();
			jouerCarte(carteAJouer);
		}
		else {
			System.out.println("Apprenez à lire et a écrire");
		}



	}

	// Méthode pour jouer une carte
	private void jouerCarte(Carte carte) {
		// Vérifier si la carte doit être jouée pour ses points ou son pouvoir
		boolean verifJeu = false;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Voulez vous jouer la carte pour son pouvoir ou ses points ? (pouvoir/points");
		String TypeJeu = String.valueOf(scanner.nextDouble());
		scanner.close();

		while (verifJeu == false){

			if (TypeJeu.equals("pouvoir")) {
				oeuvres.add(new Oeuvre());
				main.retirerCarte(carte);
				verifJeu = true;
			} else if (TypeJeu.equals("points")) {
				// Appliquer le pouvoir de la carte (la logique exacte dépend du pouvoir)
				carte.appliquerPouvoir(this);

				// Offrir la carte à un rival
				offrirCarteAUnRival(carte);
				verifJeu = true;
			}
			else{
				System.out.println("Mauvaise écriture");
			}
		}

	}

	// Méthode pour offrir une carte à un rival
	private void offrirCarteAUnRival(Carte carte) {
		// (La logique exacte dépend du mécanisme de jeu pour offrir une carte à un rival)
		// Peut-être une interaction avec les Vies Futures des autres joueurs.
	}

	// Méthode pour choisir quelle carte jouer
	private Carte choisirCarteAJouer() {
		// (La logique exacte dépend de la stratégie du joueur ou des conditions du jeu)
		// Retourne la carte que le joueur souhaite jouer dans ce tour.
		// Peut être basée sur des critères tels que les points de la carte, le pouvoir, etc.
		return main.getCartesEnMain().get(0); // Exemple : Choisir la première carte en main.
	}


	// Méthode pour la réincarnation
	public void renaissance() {
		// Étape 1: Défausser les Oeuvres dans la Fosse
		for (Oeuvre oeuvre : oeuvres) {
			// (La logique exacte dépend du mécanisme de jeu pour défausser des cartes dans la Fosse)
		}
		oeuvres.clear(); // Vider la liste des Oeuvres après les avoir défaussées

		// Étape 2: Prendre toutes les cartes de la Vie Future pour composer la nouvelle Main
		ArrayList<Carte> nouvellesCartesEnMain = vieFuture.getCartesVieFuture();
		main.setCartesEnMain(nouvellesCartesEnMain);

		// Étape 3: Créer la nouvelle Pile
		ArrayList<Carte> nouvellesCartesDansPile = new ArrayList<>();
		if (main.getCartesEnMain().size() < 6) {
			// Puisez à la Source pour compléter la Pile
			int cartesADessiner = 6 - main.getCartesEnMain().size();
			for (int i = 0; i < cartesADessiner; i++) {
				Carte carteDessinee = null /* dessiner une carte de la Source */;
				nouvellesCartesDansPile.add(carteDessinee);
			}
		}
		pile.setCartesDansPile(nouvellesCartesDansPile);

		// Le tour est terminé et le jeu continue avec le joueur suivant
	}

	// Ajoutez d'autres méthodes ou attributs selon les besoins
}
