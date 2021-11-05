# **Dictionnaires**

## Création et modification

En Java, pour utiliser une liste, il faut importer la classe [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) de la bibliothèque *java.util*.
```java
import java.util.HashMap;
```

Voici comment se définit un dictionnaire avec comme clé une chaîne de caractères et comme valeur un caractère :
```java
HashMap<String, Character> dictionnaire; // Déclaration
dictionnaire = new HashMap<String, Character>(); // Initialisation
```

Ensuite, pour le remplir, il faut utiliser *put* :
```java
dictionnaire.put("clé", 'v'); // la clé est "clé" et la valeur est 'v'
```

Ainsi, l'unique élément du dictionnaire devient le couple *"clé", 'v'*, pour récupérer la valeur à partir de la clé, c'est avec *get* :
```java
char v = dictionnaire.get("clé");
```

Pour supprimer le couple, il faut utiliser *remove* :
```java
dictionnaire.remove("clé");
```
<br>


## Méthodes utiles

Tout comme la liste, le dictionnaire possède ces méthodes :
```java
int taille = dictionnaire.size();
boolean estVide = dictionnaire.isEmpty();
dictionnaire.clear();
```

Mais en plus de ça, le dictionnaire en a deux bien plus spécifiques et utiles, notamment pour le parcourir :
```java
dictionnaire.values(); // liste les valeurs du dictionnaire
dictionnaire.keySet(); // liste les clés du dictionnaire
```
<br>


## Parcours

Parcourir un dictionnaire pour le modifier n'a pas grand intérêt (selon moi), je recommande donc d'utiliser *for each*, voici comment afficher chacune de ses clés :
```java
for (String cle : dictionnaire.keySet()) {
	System.out.println(cle);
}
```

Puis chacune de ses valeurs :
```java
for (char valeur : dictionnaire.values()) {
	System.out.println(valeur);
}
```

Et enfin les deux en même temps :
```java
for (String cle : dictionnaire.keySet()) {
	System.out.println(cle + " => " + dictionnaire.get(cle));
}
```