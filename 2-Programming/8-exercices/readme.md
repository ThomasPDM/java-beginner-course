# **Exercices**

## Exercice 1
Créer un tableau contenant 6 prénoms et les afficher avec une fonction. Si vous n'êtes pas inspiré, voici une liste de prénoms :
```
Rose, Martha, Donna, Amy, Clara, Bill
```
<br>


## Exercice 2
Génère un entier aléatoire entre 0 et 50 et le fait deviner à l'utilisateur. Tant qu'il ne trouve pas, lui indique s'il doit donner un nombre plus ou moins grand.

Pour générer l'entier aléatoire, il faut importer la classe [Math](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) de la bibliothèque java.lang.
```java
import java.lang.Math;
```

Ensuite, voici la ligne permettant de générer un entier aléatoire entre 0 et 50 :
```java
int entier = (int) (Math.random()*50); // (int) convertit en entier
```
<br>


## Exercice 3
Créer un tableau 2D de taille 5x5 et le rempli en appelant une fonction. 

Disons i l'index de la ligne, j l'index de la colonne, la valeur de la case sera alors :
```
(i+j)*2
```

Plus concrètement, voici ce à quoi doit ressembler le tableau 2D :
```
0 2 4 6 8 
2 4 6 8 10 
4 6 8 10 12 
6 8 10 12 14 
8 10 12 14 16 
```