import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private final List<Comment> comments;

    public CommentRepository(List<Comment> comments) {
        this.comments = new ArrayList<>(comments);
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public boolean removeComment(Comment comment) {
        return comments.remove(comment);
    }

    public void modifyComment(Comment comment) {
        //TODO
    }

    public List<Comment> getCollaboratorComments(String collaborator_id) {
        return null;
        //TODO
    }

    public List<Comment> getEventComments(String event_id) {
        return null;
        //TODO
    }

}
