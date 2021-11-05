# **Fonctions**

En programmation, une fonction est un genre de sous-programme qui s'exécute lorsqu'on l'appelle.

En java il n'existe pas vraiment de fonction, cependant, pour faciliter la compréhension, on va dire que ceci en est une :
```java
static void fonction() {
	System.out.println("super fonction !");
}
```
Ne paniquez pas, vous comprendrez mieux pourquoi je dis ça dans la partie programmation orientée objet !
<br><br>


## Fonction sans valeur de retour et sans paramètre

Revenons à nos moutons, avant d'utiliser une fonction, il faut la définir, c'est ce que faisait la ligne précédente. Il faut d'abord indiquer le type de valeur renvoyée par la fonction, ici, "void" (néant), autrement dit, rien. Ensuite, on lui donne un nom et on indique ses paramètres entre parenthèses. Enfin, on ouvre les accolades pour écrire ce qui sera exécuté lors de l'appel de la fonction.
```java
static void fonction() { // fonction ne renvoyant rien et ne prennant aucun paramètre
	System.out.println("super fonction !");
}
```

Pour appeler une fonction, rien de compliqué :
```java
fonction(); // affichera alors "super fonction !" dans la console
```
<br>


## Fonction avec valeur de retour

Le mot-clé return permet à la fonction de renvoyer quelque chose, il faut néanmoins que le type de ce qui est renvoyé soit préciser devant la fonction.
```java
static int renvoiLeNombre12() { // fonction renvoyant un entier
	return 12;
}
```

Ainsi, il faut prendre en compte ce qui est renvoyé dans l'appel.
```java
int entier = renvoiLeNombre12();
System.out.println(entier); // affiche 12
```
<br>


## Fonction avec paramètres

Le mot-clé return permet à la fonction de renvoyer quelque chose, il faut néanmoins que le type de ce qui est renvoyé soit préciser devant la fonction.
```java
static int addition(int a, int b) { // fonction renvoyant le résultat de l'addition
	return a + b;
}
```

Ainsi, il faut prendre en compte les paramètres lors de l'appel.
```java
int entier = addition(5, 4);
System.out.println(entier); // affiche 9
```