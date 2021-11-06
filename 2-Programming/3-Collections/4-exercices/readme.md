# **Exercices programmation #3**

## **Exercice 7**
Créer un tableau contenant 6 prénoms et les afficher avec une fonction. Si vous n'êtes pas inspiré, voici une liste de prénoms :
```
Rose, Martha, Donna, Amy, Clara, Bill
```
<br><br>



## **Exercice 8**

Initialiser une liste et faire en sorte que l'utilisateur la remplisse mot par mot, tant qu'il n'a pas écrit le mot "stop".

Attention, pour comparer des chaînes de caractères, il vaut mieux privilégier *equals* à *==* :

```java
String mot = "bonjour";
boolean estEgal = mot.equals("bonsoir"); // false
```
<br><br>



## **Exercice 9**

Initialiser un dictionnaire associant une chaîne de caractères à un caractère, le remplir et l'afficher.

Si vous manquez d'inspiration, reprenez les prénoms de l'exercice 7 et à chacun d'entre eux associez-y sa première lettre.

<br><br><br>



## **Exercice 10**
Créer un tableau 2D de taille *5x5* et le remplir en appelant une fonction. 

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