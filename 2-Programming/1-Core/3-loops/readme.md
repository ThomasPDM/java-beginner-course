# **Boucles**

## **WHILE**

Tant que la condition est vraie, tourne dans la boucle.
```java
int entier = 0;
while (entier < 6) { // tant que entier est plus petit que 6
	System.out.println(entier); // l'affiche
	entier++; // et l'augmente de 1
}
```

Il existe également une variante, do while, c'est la même chose, sauf que la vérification de la condition se fait après le passage dans la boucle, son contenu est donc obligé d'être exécuté au moins une fois.
```java
int entier = 0;
do { 
	System.out.println(entier); // affiche l'entier
	entier++; // l'augmente de 1
} while (entier < 6); // recommence tant qu'il est plus petit que 6
```
<br><br>



## **FOR**

Pour quelque chose allant de tant à tant, tourne dans la boucle.
```java
for (int i=0; i<6; i++) { // équivalent à la première boucle while
	System.out.println(i);
}
```