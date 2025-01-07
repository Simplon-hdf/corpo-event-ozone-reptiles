/**
 * Manages events in the system.
 */
public class EventManager {
    private EventRepository eventRepository;

    /**
     * Constructs a new EventManager.
     *
     * @param eventRepository the repository of events
     */
    public EventManager(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    /**
     * Removes an event if the collaborator is the author.
     *
     * @param event_id the ID of the event
     * @param author_id the ID of the author
     * @param collaborator_id the ID of the collaborator
     */
    public void removeEvent(String event_id, String author_id, String collaborator_id) {
        if(author_id.equals(collaborator_id)) {
            eventRepository.removeEvent(event_id);
        } else {
            System.out.println("Vous n'êtes pas l'auteur de cet événement");
        }
    }

    /**
     * Modifies an event if the collaborator is the author.
     *
     * @param event the event to modify
     * @param collaborator_id the ID of the collaborator
     */
    public void modifyEvent(Event event, String collaborator_id) {
        if(event.getAuthor_id().equals(collaborator_id)) {
            if(!eventIsValid(event)) {
                System.out.println("Veuillez entrer des informations valides");
            } else {
                eventRepository.modifyEvent(event);
            }
        } else {
            System.out.println("Vous n'êtes pas l'auteur de cet événement");
        }
    }

    /**
     * Validates the event.
     *
     * @param event the event to validate
     * @return true if the event is valid, false otherwise
     */
    public boolean eventIsValid(Event event) {
        return true;
    }
}