public class CommentManager {
    private CommentRepository commentRepository;

    public void modifyComment(Comment comment, String collaborator_id) {
        commentRepository.modifyComment(comment);
    }

    public boolean deleteComment(String comment_id, String collaborator_id, boolean isAdmin) {
        return false; //TODO
    }

    public void validateComment(Comment comment) {
        //TODO
    }
}
