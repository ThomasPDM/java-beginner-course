# **Programmation #3**

Pour ce qui va suivre, je vais expliquer ce qu'est la programmation sans trop me rapprocher d'un langage, dans un premier temps, l'idée est de comprendre ce qu'est la programmation. 
<br><br>


En informatique, une collection est un regroupement de données, l'idée est d'avoir une grande variable qui en contient plusieurs autres.
<br><br><br>


## Tableau

Un tableau est une collection de taille définie, à la déclaration, on décide du type de variable qu'il contient ainsi que son nombre de cases.

Plus concrètement, il est notamment possible de créer un tableau qui contient 10 entiers :
```php
INTEGER[10] entiers;
```

Il serait alors possible de modifier la première case :
```php
entiers[0] = 5;
```

Ou encore la dernière :
```php
entiers[9] = 87;
```

Vous l'avez peut-être compris, en informatique, la première case d'une collection est à l'index 0 et la dernière à l'index (taille-1).
<br><br>


Il est également possible de faire des tableaux en plusieurs dimensions, par exemple, voici ce à quoi ressemble un tableau de *5x5* nombres à virgules :
```php
FLOAT[5][5] flotants;
```

La modification de valeur fonctionne alors de la même façon qu'en 1D :
```php
flotants[2][4] = 3.14; 
```
<br><br>


## Liste

Une liste fonctionne comme un tableau, sauf que sa taille n'est pas définie, elle commence vide puis on ajoute des éléments au fur et à mesure.

Voici par exemple comment faire une liste de chaînes de caractères :
```php
STRING[] mots;
```

Pour y ajouter un élément, il faut utiliser *ADD* :
```php
mots.ADD("bonjour");
```

Pour en enlever, il faut utiliser *REMOVE* :
```php
mots.REMOVE(0); // 0 étant l'index de "bonjour"
```

Pour le reste, ça fonctionne globalement comme un tableau.
<br><br><br>



## Dictionnaire

Un dictionnaire est un genre de tableau où on peut personnaliser l'index, c'est-à-dire que l'index pourrait très bien être une chaîne de caractères au lieu d'un entier.

Un dictionnaire contient donc des couples *{clé => valeur}*, à toute clé est associée une valeur.

Voici par exemple ce à quoi ressemble un dictionnaire qui utilise des chaînes de caractères en clés et des nombres à virgules en valeurs :
```php
DICT<STRING, FLOAT> dictionnaire;
```

Ensuite, le fonctionnement est vraiment très similaire à celui d'un tableau, il faut simplement saisir la notion de clé et de valeur :
```php
dictionnaire["pi"] = 3.14;
```
<br><br>



## Retour à Java

* [1-arrays/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/3-Collections/1-arrays) *<span style="color:gray">utilisation des tableaux</span>*
* [2-lists/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/3-Collections/2-lists) *<span style="color:gray">utilisation des listes</span>*
* [3-dictionaries/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/3-Collections/3-dictionaries) *<span style="color:gray">utilisation des dictionnaires</span>*
* [4-exercices/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/3-Collections/4-exercices) *<span style="color:gray">utilisation des dictionnaires</span>*