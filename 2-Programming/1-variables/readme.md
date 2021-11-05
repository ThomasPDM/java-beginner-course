# **Variables**

En java, chaque variable a un type, voici un tableau des principaux :
| type    | correspondance       | exemple |
| :------ |:-------------------- |:--------|
| int     | entier               | 12      |
| double  | décimal              | 12.65   |
| char    | caractère            | a       |
| String  | chaîne de caractères | science |
| boolean | booléen              | true    |

<br>


## Initialiser une variable
Pour déclarer une variable il faut indiquer son type puis lui donner un nom.
```java
int entier;
```

On peut maintenant lui affecter une valeur.
```java
entier = 12;
```

On aurait d'ailleurs pu faire les deux en même temps.
```java
int entier = 12;
```
<br>


## Modifier une variable
Pour modifier la variable, il suffit de réaffecter une valeur.
```java
entier = 21;
```

Il est tout de même possible de faire en sorte que la nouvelle valeur dépende de l'ancienne.
```java
entier = entier + 2;
```

Java offre d'ailleurs la possibilité d'écrire ça plus rapidement.
```java
entier += 2; // entier voit sa valeur augmenter de 2
entier++; // entier voit sa valeur augmenter de 1
```
<br>


## Informations supplémentaires
Les opérateurs (+, -, *...) ne sont pas exclusivement réservés aux nombres, ils ont notamment des effets sur les chaînes de caractères ce qui peut s'avérer très utile dans certaines situations.

```java
String prenom = Thomas;
System.out.println("Bonjour, je me prénomme " + prenom);
```

Concernant les booléens (true / false), il est possible de les initialiser avec des expressions.
```java
boolean estPlusGrand = (1 > 2); // 1 étant inférieur à 2, la valeur attribuée est false
```

Au passage, dans ce genre d'expression, pour tester une égalité, le symbole = n'est pas suffisant, il faut en mettre 2.
```java
boolean estPlusGrand = (1 == 1); // 1 étant égal à 1, la valeur attribuée est true
```