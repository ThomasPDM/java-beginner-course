# **Programmation orientée objet en Java**

## Créer une classe

Reprenons la classe précédente et ne nous occupons pas des portées pour l'instant :

![](../1-what/_images/person4.jpg)

Par convention, le nom de la classe commence toujours par une majuscule et est également le nom du fichier (on met donc une classe par fichier). Voici alors la définition de notre classe en Java :
```java
class Person {
    // Déclaration des attributs
    String firstName;
    String lastName;
    int age;

    // Définitions des méthodes
    void printAttributes() {
		System.out.println(firstName + " " + lastName + " " + age + " years old");
	}

    // Définitions des constructeurs
    Person(String firstName, String lastName, int age) {
        firstName = firstName; // ambiguïté
        lastName = lastName; // ambiguïté
        age = age; // ambiguïté
    }
}
```
<br>


## Éviter les ambiguïtés

On remarque que dans le constructeur, il y a une ambiguïté, les paramètres ont les mêmes noms que les attributs. Heureusement, il suffit de préfixer nos attributs avec *this* pour régler le problème :

```java
Person(String firstName, String lastName, int age) {
    this.firstName = firstName; // this.firstName est l'attribut
    this.lastName = lastName; // this.lastName est l'attribut
    this.age = age; // this.age est l'attribut
}
```

Dans la définition de la classe, il est donc très important de préfixer chaque attribut de *this*, même lorsqu'il n'y a pas d'ambiguïté, ainsi, on rend le programme plus lisible.
```java
void printAttributes() {
    System.out.println(this.firstName + " " + this.lastName + " " + this.age + " years old");
}
```

À noter que *this* peut également être utilisé devant une méthode, à la fin de notre constructeur, on pourrait très bien appeler la méthode printAttributes par exemple :
```java
Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.printAttributes(); // appel la méthode printAttributes
}
```
<br>


## Définir la portée
Pour ce qui est de la portée, telle que nous l'avons fait, elle est dans le package (répertoire du fichier *Person.java*), c'est la portée mise par défaut quand on ne précise rien. Essayons maintenant de modifier la portée en suivant la convention mentionnée plus tôt :

![](../1-what/_images/person5.jpg)

```java
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void printAttributes() {
		System.out.println(this.firstName + " " + this.lastName + " " + this.age + " years old");
	}

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName; // ambiguïté
        this.lastName = lastName; // ambiguïté
        this.age = age; // ambiguïté
    }
}
```

Si vous avez compris la portée, vous devez vous dire qu'on risque d'avoir un problème pour modifier les attributs et vous avez raison ! Pour remédier à ça, nous allons simplement créer des méthodes qui servent à modifier nos attributs :

```java
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public void setAge(int age) {
    this.age = age;
}
```

Et pour récupérer les valeurs des attributs, il suffit également de créer des méthodes :

```java
public String getFirstName() {
    return this.firstName;
}
public String getLastName() {
    return this.lastName;
}
public int getAge() {
    return this.age;
}
```
<br>


## Créer un objet (instancier une classe)

Généralement, la méthode main nécessaire à l'exécution du programme se définit dans la classe Main d'un fichier *Main.java*, dans ce fichier, on peut créer un objet à partir de notre classe.

```java
public class Main {
	public static void main(String[] args) {
		// zone d'exécution (on peut par exemple y instancier des classes)
	}
}
```

L'instanciation se fait à l'aide d'un constructeur, lors de l'affectation, le mot-clé *new* est nécessaire :
```java
Person person; // déclaration
person = new Person("John", "Smith", 31); // affectation
```

Voici donc ce à quoi pourrait ressembler le fichier *Main.java* :
```java
public class Main {
	public static void main(String[] args) {
		Person person = new Person("John", "Smith", 31);
		person.printAttributes();
	}
}
```