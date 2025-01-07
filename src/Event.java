/**
 * Represents an event in the system.
 */
public class Event {
    private String event_id;
    private String author_id;
    private String author_name;
    private String title;
    private String description;
    private String address;
    private String startingDate;
    private String endingDate;

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    /**
     * Constructs a new Event.
     *
     * @param event_id the ID of the event
     * @param author_id the ID of the author
     * @param author_name the name of the author
     * @param title the title of the event
     * @param description the description of the event
     * @param address the address of the event
     * @param startingDate the starting date of the event
     * @param endingDate the ending date of the event
     */
    public Event(String event_id, String author_id, String author_name, String title, String description, String address, String startingDate, String endingDate) {
        this.event_id = event_id;
        this.author_id = author_id;
        this.author_name = author_name;
        this.title = title;
        this.description = description;
        this.address = address;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    // Getters and setters...

    /**
     * Returns all information about the event.
     *
     * @return a string containing all event information
     */
    public String getAllEventInformation() {
        return "Event with ID '" + event_id + "', created by " + author_name + " (ID: " + author_id + "), is titled " + title + ". It is described as: " + description + ". It will take place at " + address + " from " + startingDate + " to " + endingDate + ".";
    }
}