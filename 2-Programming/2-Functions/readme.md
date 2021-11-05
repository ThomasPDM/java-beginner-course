# **Programmation #2**

Pour ce qui va suivre, je vais expliquer ce qu'est la programmation sans trop me rapprocher d'un langage, dans un premier temps, l'idée est de comprendre ce qu'est la programmation.
<br><br><br>



## **Fonctions**

En programmation, une fonction est un genre de sous-programme qui s'exécute lorsqu'on l'appelle.

L'objectif est d'éviter les répétitions, si vous réécrivez la même chose à plusieurs endroits, peut-être devriez-vous songer à faire une fonction !

Une fonction n'est ni plus ni moins qu'un block d'instructions qui s'exécute lorsqu'on l'appel, on peut par exemple définir une fonction qui dit "Bonjour" :
```php
VOID maFonction() {
    PRINT("Bonjour");
}
```

Pour appeler la fonction, il suffit de faire comme ceci :
```php
maFonction();
```

Les parenthèses sont nécessaires, elles permettent de différencier une fonction d'une variable, de plus, elles peuvent contenir des paramètres/arguments, nous verrons ça par la suite.
<br><br><br>



## **Valeurs de retours**

Comme une variable, une fonction possède un nom et un type, ce type correspond à celui de la valeur renvoyée par la fonction.

Un peu plus haut, le mot-clé *VOID* (rien) correspondait au type de la fonction, cela signifie simplement qu'elle n'avait pas de valeur de retour.

Mais il est tout à fait possible de faire une fonction qui renvoie un entier par exemple :
```php
INTEGER donneDouze() {
    RETURN 12;
}
```

Ou même une chaîne de caractères :
```php
STRING donneBonjour() {
    RETURN "bonjour";
}
```

Vous l'aurez peut-être compris, le mot-clé *RETURN* sert à renvoyer la valeur et à quitter le block d'instructions (tout ce qui est après ne sera pas exécuté).

Cette valeur de retour se récupère à l'appel de la fonction :
```php
INTEGER douze;
douze = donneDouze(); // 12

STRING bonjour;
bonjour = donneBonjour(); // "bonjour"
```
<br><br>



## **Paramètres**

Entre les parenthèses d'une fonction, il est possible de définir des paramètres, pour qu'ensuite, à l'appel, on passe des arguments correspondants entre les parenthèses.

Grossièrement, un paramètre est une variable temporaire qu'on peut utiliser dans la fonction :
```php
VOID afficherMot(STRING mot) { // mot est un paramètre
    PRINT(mot);
}
```

Cette variable est initialisée à l'appel :
```php
afficherMot("bonjour"); // "bonjour" est un argument
```

Utiliser des paramètres n'empêche pas notre fonction de renvoyer une valeur, on peut par exemple créer une fonction qui additionne deux entiers :
```php
INTEGER addition(INTEGER a, INTEGER b) {
    return a + b;
}
```
<br><br>



## **Retour à Java**

* [1-functions/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/2-Functions/1-functions) *<span style="color:gray">fonctions > répétitions</span>*
* [2-exercices/](https://github.com/ThomasPDM/java-beginner-course/tree/master/2-Programming/2-Functions/2-exercices) *<span style="color:gray">pratiquer pour apprendre !</span>*
<br><br>