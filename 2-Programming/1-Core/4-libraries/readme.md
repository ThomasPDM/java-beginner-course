# **Bibliothèques**

## **Comment ça ?**

Avant d'utiliser une bibliothèque, il faut déjà l'importer, attention, il faut le faire avant de créer la classe.
```java
import java.util.Scanner; // import de la classe Scanner de la bibliothèque java.util

class userInteractions {
	// ..
}
```

Ensuite, pour savoir comment l'utiliser, il faut se référer à la [documentation](https://docs.oracle.com/javase/8/docs/api/index.html), c'est quelque chose d'extrêmement important ! Dans notre cas, voici la [page](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html) concernant la classe Scanner de la bibliothèque java.util. Néanmoins, Java étant un langage destiné à la programmation orienté objet, il est nécessaire de la comprendre pour s'en sortir avec la documentation, donc ne paniquez pas si vous ne comprenez pas pour l'instant !
<br><br><br>



## **Scanner de la bibliothèque java.util**

Scanner permet d'interagir avec l'utilisateur en lisant ce qu'il écrit dans la console.
```java
Scanner scanner = new Scanner(System.in); // création du scanner

System.out.println("Quel est ton prenom ?");
String prenom = scanner.nextLine(); // lis la dernière ligne écrite dans la console
System.out.println("Bonjour " + prenom);

System.out.println("Quel âge as-tu ?");
int age = scanner.nextInt(); // lis le dernier entier écrit dans la console
System.out.println("Oh ! tu as " + age);

scanner.close(); // fermeture du scanner
```