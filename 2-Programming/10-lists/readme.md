# **Listes**

## Création et modification

En Java, pour utiliser une liste, il faut importer la classe [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) de la bibliothèque *java.util*.
```java
import java.util.ArrayList;
```

Voici comment se définit une liste :
```java
ArrayList<String> liste; // Déclaration d'une liste de chaînes de caractères
liste = new ArrayList<String>(); // Initialisation de la liste
```

Ensuite, pour la remplir, il faut utiliser *add* :
```java
liste.add("Hello");
```

Ainsi, le premier élément de la liste devient "Hello" (index 0), si je veux le supprimer, il faut utiliser *remove* :
```java
liste.remove(0);
```
<br>


## Méthodes utiles

La liste permet de récupérer le nombre d'éléments dans la collection avec *size* :
```java
int taille = list.size();
```

Il est également possible de tester si la collection est vide avec *isEmpty* :
```java
boolean estVide = liste.isEmpty();
```

Et même de la vider avec *clear* :
```java
liste.clear();
```
<br>


## Parcours

Le parcours fonctionne de la même manière qu'avec un tableau, si on cherche à ajouter des valeurs, l'utilisation d'un *for* classique est recommandée :
```java
for (int i=0; i<5; i++) {
	liste.add("(" + i*10 + ")");
} // liste = {"(0)", "(10)", "(20)", "(30)", "(40)"}
```

Et pour l'affichage, il vaut mieux privilégier un *for each*.
```java
for (String chaine : liste) {
	System.out.println(chaine);
}
```