# Projet de démonstration Spring IoC

Ce projet de démonstration illustre la mise en œuvre de l'Inversion de Contrôle (IoC) et de l'Injection de Dépendances (DI) à l'aide du Framework Spring.

## Objectifs du Projet

1. Créer l'interface `IDao` avec une méthode `getData`.
2. Implémenter l'interface `IDao` avec la classe `DaoImp`.
3. Créer l'interface `IMetier` avec une méthode `calcul`.
4. Implémenter l'interface `IMetier` avec la classe `IMetierImp` en utilisant le couplage faible.
5. Faire l'injection des dépendances :
   - Par instanciation statique.
   - Par instanciation dynamique.
   - En utilisant le Framework Spring avec les approches suivantes :
     - Version XML.
     - Version annotations.

## Contenu du Projet

Le projet se compose des éléments suivants :

- `IDao.java` : Interface définissant la méthode `getData`.
- `DaoImp.java` : Implémentation de l'interface `IDao`.
- `IMetier.java` : Interface définissant la méthode `calcul`.
- `IMetierImp.java` : Implémentation de l'interface `IMetier` avec couplage faible.
- `SpringStaticInstance.java` : Classe de démonstration pour l'injection statique des dépendances.
- `DynanicInstance.java` : Classe de démonstration pour l'injection dynamique des dépendances.
- `SpringXMLConfig.java` : Configuration XML de Spring pour l'injection de dépendances.
- `SpringAnnotation.java` : Classe de démonstration pour l'injection de dépendances avec annotations.

## Comment Utiliser

1. Cloner le repository : `https://github.com/Meryem-Boudri/Inversion-de-controle---Injection-des-dependances`
2. Importer le projet dans votre IDE préféré.
3. Exécuter les différentes classes de démonstration pour voir l'injection de dépendances en action.

## Contributions

Les contributions sont les bienvenues ! Pour proposer des améliorations ou signaler des problèmes, veuillez ouvrir une issue ou soumettre une pull request.

## Auteurs

Ce projet a été développé par [Meryem Boudri](https://github.com/Meryem-Boudri/).



