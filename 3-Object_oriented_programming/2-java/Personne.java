class Personne {
	// Attributs
	String nom;
	String prenom;
	int age;

	// Méthodes
	void afficher_infos() {
		System.out.println(prenom + " " + nom + ", âgé de " + age + "ans.");
	}

	// Constructeurs
	Personne() {

	}
	Personne(String prenom, String nom, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
}
