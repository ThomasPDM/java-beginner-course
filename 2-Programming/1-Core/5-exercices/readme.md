# **Exercices programmation #1**

## **Exercice 1**

Écrire un programme qui demande son prénom à l'utilisateur et lui dit bonjour.
<br><br><br>



## **Exercice 2**

Faire un programme qui demande à l'utilisateur combien de fois il veut voir "bonjour", puis, affiche "bonjour" autant de fois que nécessaire.
<br><br><br>



## **Exercice 3**
Génère un entier aléatoire entre 0 et 50 et le fait deviner à l'utilisateur. Tant qu'il ne trouve pas, lui indique s'il doit donner un nombre plus ou moins grand.

Pour générer l'entier aléatoire, il faut importer la classe [Math](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) de la bibliothèque java.lang.
```java
import java.lang.Math;
```

Ensuite, voici la ligne permettant de générer un entier aléatoire entre 0 et 50 :
```java
int entier = (int) (Math.random()*50); // (int) conversion en entier
```