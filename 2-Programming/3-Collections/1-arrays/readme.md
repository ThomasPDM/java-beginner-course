# **Tableaux**

## **Création et modification**

**1D**

Un tableau contient plusieurs variables.
```java
int[] entiers = new int[10]; // tableau d'entiers à 10 éléments
char[] caracteres = new char[6]; // tableau de caractères à 6 éléments
boolean[] booleens = new boolean[4]; // tableau de booléens à 4 éléments
String[] chainesDeCaracteres = new String[7]; // tableau de chaînes de caractères à 7 éléments
```

Pour accéder aux valeurs d'un tableau, il faut utiliser des crochets et indiquer l'index de l'élément ciblé. Attention, en informatique, le premier élément d'un tableau est à l'index 0 et le dernier à l'index (taille - 1).
```java
entiers[0] = 12; // le premier élément du tableau devient 12
entiers[9] = 59; // le dernier élément du tableau devient 59
System.out.println(entiers[4]); // affiche le 5ème élément du tableau
```

Il est également possible d'initialiser rapidement un tableau.
```java
char[] abcd = {'a', 'b', 'c', 'd'}; // tableau de 4 caractères
```
<br>

**2D**

Il est également possible de créer des tableaux à plusieurs dimensions, le fonctionnement est le même, on rajoute simplement des crochets.
```java 
int[][] entiers2D = new int[10][10]; // tableau d'entiers à 10x10 éléments
entiers2D[0][5] = 4; // le 6ème élément de la première ligne prend la valeur 4
```
<br><br>



## **Parcours**

**1D**

Pour modifier les valeurs d'un tableau, le mieux est d'utiliser une boucle for.
```java
for (int i=0; i<10; i++) {
	entiers[i] = i*10;
} // entiers = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90}
```

Pour les afficher, il vaut mieux privilégier une variante du for, le for each (pour chaque ..).
```java
for (int entier : entiers) { // pour chaque entier dans le tableau d'entiers
	System.out.println(entier); // l'affiche
}
```
<br>


**2D**

On fait de même, mais en gérant la dimension supplémentaire.
```java
for (int i=0; i<10; i++) {
	for (int j=0; j<10; j++) {
		entiers2D[i][j] = i*j;
	}
}
```

Cependant, pour l'affichage, je recommande d'utiliser un for classique, car l'utilisation du for each, bien qu'elle soit possible, est plus compliquée.
```java
for (int i=0; i<10; i++) {
	for (int j=0; j<10; j++) {
		System.out.println(entiers2D[i][j]);
	}
}
```