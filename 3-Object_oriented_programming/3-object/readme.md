# **Créer un objet (instancier une classe) en Java**

Généralement, la méthode main nécessaire à l'exécution du programme se définit dans la classe Main d'un fichier *Main.java*, dans ce fichier, on peut créer un objet à partir de notre classe.

```java
public class Main {
	public static void main(String[] args) {
		// zone d'exécution (on peut par exemple y instancier des classes)
	}
}
```

L'instanciation se fait à l'aide d'un constructeur, lors de l'affectation, le mot-clé *new* est nécessaire :
```java
Person person; // déclaration
person = new Person("John", "Smith", 31); // affectation
```

Voici donc ce à quoi pourrait ressembler le fichier *Main.java* :
```java
public class Main {
	public static void main(String[] args) {
		Person person = new Person("John", "Smith", 31);
		person.printAttributes();
	}
}
```