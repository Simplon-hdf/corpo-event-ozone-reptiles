public class Main {
    public static void main(String[] args) {
        // Créles collaborateurs
        Collaborator collaborator1 = new Collaborator("1", "Doe", "John", "johndoe@gmail.com", "Developer", "password", true);
        Collaborator collaborator2 = new Collaborator("2", "Smith", "Jane", "smithjane@gmail.com", "Designer", "password", false);

        // Affichez les informations des collaborateurs
        collaborator1.getAllCollaboratorInformation();
        collaborator2.getAllCollaboratorInformation();

        // Créez le dépôt d'événements
        EventRepository eventRepository = new EventRepository();

        // Ajoutez des événements
        Event event1 = new Event("2", "2", "Jane Smith", "Workshop", "A hands-on workshop", "5678 Workshop Ave", "2021-02-01", "2021-02-02");
        eventRepository.addEvent(event1);

        Event event2 = new Event("3", "3", "Alice Johnson", "Seminar", "An informative seminar", "9101 Seminar Blvd", "2021-03-01", "2021-03-02");
        eventRepository.addEvent(event2);

        // Modifiez un événement
        Event updatedEvent = new Event("2", "2", "Jane Smith", "Updated Workshop", "Updated description", "New Address", "2021-02-01", "2021-02-02");

        EventManager eventManager = new EventManager(eventRepository);
        // Modifier un événement en tant qu'auteur
        eventManager.modifyEvent(updatedEvent, collaborator2.getCollaborator_id());
        // Supprimer un événement en tant qu'auteur
        eventManager.removeEvent(event1.getEvent_id(), event1.getAuthor_id(), collaborator2.getCollaborator_id());
        // Affichez tous les événements
        eventRepository.getAllEvents();
    }
}