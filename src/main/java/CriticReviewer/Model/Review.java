package CriticReviewer.Model;

public class Review {
    private int reviewId;
    private int userId;
    private int movieId;
    private String reviewText;
    private double rating;

    public Review(int reviewId, int userId, int movieId, String reviewText, double rating) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.movieId = movieId;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public int getReviewId() { return reviewId; }
    public int getUserId() { return userId; }
    public int getMovieId() { return movieId; }
    public String getReviewText() { return reviewText; }
    public double getRating() { return rating; }
}
