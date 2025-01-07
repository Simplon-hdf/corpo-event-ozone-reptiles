import java.util.List;

public class Collaborator {

    private  String collaborator_id;
    private  String lastname;
    private  String firstname;
    private  String email;
    private  String position;
    private  boolean isAdmin;


    public Collaborator(String collaborator_id, String lastname, String firstname, String email, String position, String password, boolean isAdmin) {
        this.collaborator_id = collaborator_id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.position = position;
        this.isAdmin = isAdmin;
    }

    public void getAllCollaboratorInformation() {
        System.out.println("Collaborator with ID '" + collaborator_id + "', named " + firstname + " " + lastname + ", with email " + email + ", holds the position of " + position + " and is " + (isAdmin ? "an admin." : "not an admin."));
    }

    public String getCollaborator_id() {
        return collaborator_id;
    }

    public void setCollaborator_id(String collaborator_id) {
        this.collaborator_id = collaborator_id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void getConnected(String password, String email) {
       //Code
    }

    public List<Event> getCollaborators(String collaborator_id) {
        return List.of();
    }

    public List<Comment> getCollaboratorComments(String collaborator_id) {
        return List.of();
    }




}
