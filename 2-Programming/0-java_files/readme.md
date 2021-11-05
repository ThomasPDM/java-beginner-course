# **Fichiers Java**

Dans un fichier java, il faut créer une classe, par convention, celle-ci prend le nom du fichier.
```java
class hello {

}
```
<br>


Si on veut qu'il soit exécutable, il faut créer la méthode main dans la classe, ainsi, tout ce qui se trouve à l'intérieur sera exécuté.
```java
class hello {

	public static void main(String[] args) {

	}
}
```
<br>


Dans le fichier, il est possible d'ajouter des commentaires, ceux-ci ne sont pas pris en compte à l'exécution, mais permettent de commenter le programme, ce qui aide les développeurs.
```java
class hello {

	public static void main(String[] args) {
        // début de l'exécution

        /*
            ... programme
        */

        // fin de l'exécution
	}
}
```
<br>


Pour afficher un message dans le terminal, cela ce fait à l'aide de cette ligne :
```java
System.out.println("le super message que j'affiche");
```
<br>


Ainsi, nous retrouvons notre programme **hello.java**.


```java
class hello {

	public static void main(String[] args) {
		System.out.println("Hello"); // Affiche "Hello" dans la console
	}
}
```