# **Programmation #1**

Pour ce qui va suivre, je vais expliquer ce qu'est la programmation sans trop me rapprocher d'un langage, dans un premier temps, l'idée est de comprendre ce qu'est la programmation.
<br><br>


## Programme

L'exécution d'un programme part toujours d'un fichier, généralement, celle-ci vient du *main*.

C'est la zone principale du programme, celle à partir de laquelle tout commence, tout ce qui se trouve à l'intérieur sera exécuté en suivant l'ordre d'apparition.

```php
MAIN {

}
```

Ce genre de zone s'appelle un *block d'instructions*, c'est un peu comme un regroupement de tâches pour le programme. Pour délimiter un block, dans beaucoup de langages, cela se fait grâce aux accolades :
```php
BLOCK {

}
```

Avant de passer plus concrètement à ce qu'est la programmation, il est important de savoir que, dans un programme, il est possible d'écrire des commentaires.

Ces commentaires n'ont aucun impact dans l'exécution, ils ne servent qu'à aider les programmeurs à se repérer et c'est très important !

La plupart du temps, ils s'écrivent à l'aide de caractères spéciaux comme */* ou *#*.
```php
MAIN {
    // Zone d'exécution du programme
}
```
<br><br>


## Variables

Une variable est quelque chose qui varie et qui possède une valeur, généralement, elle a un type, voici un tableau des principaux :

| type      | correspondance       | exemple |
| :-------- |:-------------------- |:--------|
| INTEGER   | entier               | 12      |
| FLOAT     | décimal              | 12.65   |
| CHARACTER | caractère            | a       |
| STRING    | chaîne de caractères | science |
| BOOLEAN   | booléen              | TRUE    |
<br>

Pour créer une variable, il y a plusieurs étapes, la première est la déclaration, on lui donne un nom et on lui précise son type (pas toujours, ça dépend du langage) :
```php
INTEGER entier;
```

L'étape qui suit est l'initialisation, on affecte une valeur à notre nouvelle variable :
```php
entier = 12;
```

Ensuite, pour modifier la valeur de la variable, il suffit de répéter l'opération :
```php
entier = 5;
```

Il est même possible de faire dépendre la nouvelle valeur de la précédente :
```php
entier = entier + 1;
```
<br>

Pour relier ceci avec ce qui a été vu plus tôt, on peut créer une variable qui serait une chaîne de caractères contenant la phrase "salut c'est moi" dans la zone d'exécution :

```php
MAIN {
    // Zone d'exécution du programme
    STRING phrase;
    phrase = "salut c'est moi";
}
```

Au passage, vous avez peut-être remarqué la présence de *;* à chaque fin de ligne, c'est pour signaler que l'instruction est terminée. Encore une fois, cela dépend des langages, mais généralement, après une instruction, on met un *;*.
<br><br><br>


## Intéractions utilisateur

Souvent, quand on lance un programme, un terminal (console, invite de commandes...) est visible et c'est même à l'intérieur que l'exécution se fait !

Ceci permet alors d'intéragir avec l'utilisateur, au moins de manière assez basique, par exemple, en affichant un message dans le terminal.

```php
PRINT("Bonjour");
```
```
terminal: Bonjour
```

On peut aussi prendre la chose dans l'autre sens et vouloir écrire une valeur qui sera prise en compte dans notre programme.

```PHP
INPUT(phrase);
```
```
terminal: hello
```

La valeur de la variable phrase devient alors "hello".

On pourrait maintenant modifier le main pour demander à l'utilisateur son prénom et l'afficher :
```php
main {
    PRINT("Bonjour, quel est ton prénom ?");

    STRING prenom;
    INPUT(prenom);

    PRINT(prenom);
}

```
<br><br>


## Conditions

Dans un programme, on veut pouvoir modifier le fils d'exécution sous certaines conditions, c'est alors qu'entre en jeu deux mots clé *IF* et *ELSE*.

À partir d'une expression booléenne (vrai/faux), si elle est vraie, exécute ce qui est dans le block du *IF*, sinon, ce qui est dans le block du *ELSE* (s'il y en a un) :

```php
BOOLEAN estVrai;
estVrai = TRUE;

IF (estVrai) {
    PRINT("C'est vrai !");
}
ELSE {
    PRINT("Ce n'est pas vrai");
}
```

Il est alors important d'apprendre à faire des expressions booléennes, voici donc un tableau des opérateurs de comparaisons principaux :

| opérateur | correspondance    | exemple |
| :-------- |:----------------- |:--------|
| ==        | égalité           | a == b  |
| !=        | inégalité         | a != b  |
| <         | inférieur         | a < b   |
| <=        | inférieur ou égal | a <= b  |
| >         | supérieur         | a > b   |
| >=        | supérieur ou égal | a >= b  |
<br>

Il existe également des opérateurs entre expressions booléennes :
| opérateur | correspondance | exemple              |
| :-------- |:-------------- |:-------------------- |
| AND       | et             | estRose AND estPale  |
| OR        | ou             | estRose OR estPale   |
| NOT       | non (opposé)   | NOT estRose          |
<br><br><br>


## Boucles

En informatique, on aime assez peu les répétitions, l'un des moyens d'en éviter, c'est d'utiliser des boucles.

Il en existe principalement deux, commençons par la boucle *WHILE*, tant que la condition est vraie, reste dans la boucle :

```php
INTEGER compteur;
compteur = 0;

// Affiche 5 fois "bonjour"
WHILE (compteur < 5) {
    PRINT("bonjour");
    compteur = compteur + 1;
}
```

L'autre principale est la boucle *FOR*, pour quelque chose allant de tant à tant, reste dans la boucle :

```php
// Affiche 5 fois "bonjour"
FOR (INTEGER i=0; i<5; i=i+1) {
    PRINT("bonjour");
}
```

En plus de *WHILE*, *FOR* permet d'initialiser une variable et d'appliquer un traitement à chaque tour (souvent, on augmente la valeur de la nouvelle variable).
<br><br><br>


## Bibliothèques

En informatique, une bibliothèque est un genre de programme déjà existant qu'on utilise dans le nôtre. L'idée est de ne pas réinventer la roue et d'utiliser ce qui existe déjà. De plus, généralement, les bibliothèques sont optimisées pour maximiser les performances.
<br><br><br>


## Retour à Java

* [0-java_files/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/1-Core/0-java_files) *<span style="color:gray">création d'un programme</span>*
* [1-variables/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/1-Core/1-variables) *<span style="color:gray">utilisation des variables</span>*
* [2-conditions/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/1-Core/2-conditions) *<span style="color:gray">gestion des conditions</span>*
* [3-loops/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/1-Core/3-loops) *<span style="color:gray">itérations > répétitions</span>*
* [4-libraries/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/1-Core/4-libraries) *<span style="color:gray">ne pas réinventer ce qui existe déjà !</span>*
* [5-exercices/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/1-Core/5-exercices) *<span style="color:gray">pratiquer pour apprendre !</span>*