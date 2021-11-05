# **Conditions**

## **IF ELSE**

Le principal mot clé pour conditionner un programme est if, à partir d'une expression booléenne (true / false), si l'expression est vrai, alors ce qui est entre les accolades du if sera exécuté.
```java
if (1 == 1) {
	// si 1 égal 1, exécute ce qui se trouve ici
}
```
<br>


Il est possible de faire suivre le if d'un else, ainsi, si l'expression est fausse, seul ce qui se trouve entre les accolades du else sera exécuté.
```java
if (1 != 1) {
	// si 1 différent de 1, exécute ce qui se trouve ici
} else {
	// sinon, exécute ce qui se trouve ici
}
```
<br><br>



## **EXPRESSIONS BOOLÉENNES**

Pour une expression booléenne, il existe de nombreux opérateurs, voici les plus fréquents.
| opérateur | correspondance    | exemple |
| :-------- |:----------------- |:--------|
| ==        | égalité           | a == b  |
| !=        | inégalité         | a != b  |
| <         | inférieur         | a < b   |
| <=        | inférieur ou égal | a <= b  |
| >         | supérieur         | a > b   |
| >=        | supérieur ou égal | a >= b  |
<br>


Il existe également des opérateurs qui permettent de combiner des expressions booléennes.
| opérateur | correspondance | exemple              |
| :-------- |:-------------- |:-------------------- |
| &&        | et             | estRose && estPale   |
| \|\|      | ou             | estRose \|\| estPale |
<br>


Enfin, le point d'exclamation permet de prendre la valeur opposée d'une expression booléenne.
```java
boolean estRose = false;
if (!estRose) {
	System.out.println("Ce n'est pas rose !");
}
```
<br><br>



## **SWITCH**

Un autre moyen d'ajouter des conditions est d'utiliser un switch, l'idée est d'indiquer une variable et de différencier le traitement en fonction de sa valeur.
```java
switch (entier) {
	case 12: {
		System.out.println("l'entier vaut 12");
	} break;

	case 59: {
		System.out.println("l'entier vaut 59");
	} break;

	default: {
		System.out.println("l'entier ne vaut ni 12 ni 59");
	} break;
}
```