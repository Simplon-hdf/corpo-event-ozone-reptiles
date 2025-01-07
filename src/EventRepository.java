import java.util.ArrayList;
import java.util.List;

/**
 * Repository for managing events.
 */
public class EventRepository {
    private final List<Event> events;

    /**
     * Constructs a new EventRepository.
     */
    public EventRepository() {
        this.events = new ArrayList<>();
    }

    /**
     * Adds an event to the repository.
     *
     * @param event the event to add
     */
    public void addEvent(Event event) {
        events.add(event);
    }

    /**
     * Removes an event from the repository.
     *
     * @param event_id the ID of the event to remove
     */
    public void removeEvent(String event_id) {
        for (Event event : events) {
            if (event.getEvent_id().equals(event_id)) {
                events.remove(event);
                break;
            }
        }
    }

    /**
     * Modifies an existing event in the repository.
     *
     * @param updatedEvent the updated event
     */
    public void modifyEvent(Event updatedEvent) {
        for(Event event : events) {
            if(event.getEvent_id().equals(updatedEvent.getEvent_id())) {
                event.setAuthor_name(updatedEvent.getAuthor_name());
                event.setTitle(updatedEvent.getTitle());
                event.setDescription(updatedEvent.getDescription());
                event.setAddress(updatedEvent.getAddress());
                event.setStartingDate(updatedEvent.getStartingDate());
                event.setEndingDate(updatedEvent.getEndingDate());
            }
        }
    }

    /**
     * Finds an event by its ID.
     *
     * @param event_id the ID of the event
     * @return the event if found, null otherwise
     */
    public Event getEvent(String event_id) {
        return null; //TODO
    }

    /**
     * Retrieves the events associated with a collaborator.
     *
     * @return a list of events
     */
    public List<Event> getCollaboratorEvents() {
        return null; //TODO
    }

    /**
     * Prints all events in the repository.
     */
    public void getAllEvents() {
        events.forEach(event -> System.out.println(event.getAllEventInformation()));
    }
}