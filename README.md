# Plateforme Corpo Event

## Contexte du Projet

L'entreprise souhaite faciliter la communication et le partage des événements organisés au sein de l'entreprise, en particulier pour ses collaborateurs répartis sur plusieurs sites. L'objectif est de créer une plateforme où les collaborateurs peuvent consulter les événements à venir et proposer de nouveaux événements. La plateforme permettra également d'ajouter des commentaires sur ces événements.

## Objectifs

1. **Consultation des événements** : Les collaborateurs peuvent voir une liste des événements à venir et consulter les détails de chaque événement.
2. **Proposition de nouveaux événements** : Les collaborateurs peuvent créer et proposer de nouveaux événements à l'entreprise.
3. **Ajout de commentaires** : Les collaborateurs peuvent ajouter des commentaires aux événements existants pour partager leurs retours ou poser des questions.

## Fonctionnalités

- **Authentification des utilisateurs** : Les collaborateurs doivent se connecter pour accéder aux fonctionnalités de la plateforme. Si l'utilisateur n'est pas connecté, il sera invité à se connecter.
- **Création d'événements** : Les utilisateurs peuvent proposer de nouveaux événements en saisissant des informations telles que le titre, la description, la date et le lieu.
- **Affichage des événements** : La plateforme affiche une liste des événements disponibles, avec la possibilité de consulter les détails de chaque événement.
- **Commentaires sur les événements** : Les collaborateurs peuvent poster des commentaires sur les événements.
- **Gestion des événements et commentaires** : Les événements et les commentaires sont stockés et gérés dans un repository pour permettre leur modification et suppression, selon les permissions des utilisateurs.

## Architecture 

La plateforme est construite autour des classes principales suivantes :

- **Event** : Représente un événement, avec des propriétés telles que le titre, la description, la date et le lieu...
- **Comment** : Représente un commentaire, avec des propriétés telles que le nom de l'auteur, le contenu du commentaire, la date de plublication...
- **Collaborator** : Représente un collaborateur de l'entreprise, avec des informations d'identification et un rôle.
- **Admin** : Représente les administrateurs de la plateforme avec des méthodes en plus de la classe collaborateur comme la gestion des collaborteurs et des permissions supplémentaires comme la possibilité de supprimer n'importe quel événement ou commentaire. 
- **EventManager** : Gère la création, modification et suppression des événements en s'assurant des permissions des utilisateurs.
- **CommentManager** : Gère la création, modification et suppression des commentaires associés aux événements en s'assurant des permissions des utilisateurs.
- **EventRepository** et **CommentRepository** : Gèrent la persistance des données pour les événements et les commentaires.

### Le groupe Ozone Reptiles 

- [@EnguerranSGG](https://github.com/EnguerranSGG)
- [@gabrielluthun](https://github.com/gabrielluthun)