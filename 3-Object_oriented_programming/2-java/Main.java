import Personne;

class Main {

	public static void main(String[] args) {
		Personne personne1 = new Personne(); // Création de l'objet personne1 à partir de la classe Personne
		personne1.prenom = "Paul"; // Modification de l'attribut prenom de personne1
		personne1.nom = "Durant";
		personne1.age = 23;
		personne1.afficher_infos(); // Appel de la méthode afficher_infos

		Personne personne2 = new Personne("Bob", "Lennon", 28); // Création de l'objet personne2 via notre constructeur
		personne2.afficher_infos();
	}
	
}
