class InvalidRatingException extends Exception { public InvalidRatingException(String m){super(m);} }
class EmptyReviewException extends Exception { public EmptyReviewException(String m){super(m);} }

public class ProductReview {
    public static void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5) throw new InvalidRatingException("Invalid rating! Must be 1–5.");
        if (comment == null || comment.isEmpty()) throw new EmptyReviewException("Review comment cannot be empty!");
        System.out.println("Review submitted: " + rating + "⭐ - " + comment);
    }

    public static void main(String[] args) {
        try {
            submitReview(6, "");
        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println(e.getMessage());
        }
    }
}
