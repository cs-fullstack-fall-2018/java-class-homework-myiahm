public class Movie {


    private String movieName;
    private int rating;
    private int yearReleased;


    public void setMovieName(String movieName) {
        // If this is a movie name that passes my checks (none for this example) set the movie name
        this.movieName = movieName;
    }

    // Set the rating for the movie between 1 to 5 (stars)
    public void setRating(int rating) {
        // If this rating passes my checks, update the rating
        // Example check you might do.....
        if (rating <1 || rating >5) // stars
        {
            System.out.println("Sorry. Rating must be between 1 to 5 stars! Rating unchanged.");
        }
        else
        {
            this.rating = rating;
        }

    }

    // Set the year movie was released
    public void setYearReleased(int yearReleased) {
        // Check for valid year. Let's assume must have been released after 1900
        if (yearReleased < 1900)
        {
            System.out.println("Can only change the release year for movies released after 1900!");
        }
        else
        {
            this.yearReleased = yearReleased;
        }

    }

    // Set the name of the movie
    public Movie(String movieName, int rating, int yearReleased)
    {
        this.movieName = movieName;
        this.rating = rating;
        this.yearReleased = yearReleased;
    }
    public String getMovieName()
    {
        return movieName;
    }
    public void printMovie()
    {
        System.out.println("Movie Name: "+movieName);
        System.out.println("Movie Rating (stars): "+rating);
        System.out.println("Movie Year Released: "+yearReleased);
    }
}
//    public Movie(String movieName, int rating, int yearReleased) {
//        this.movieName = movieName;
//        this.rating = rating;
//        this.yearReleased = yearReleased;
//    }
//
//    public String getMovieName() {
//        return movieName;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//
//    public int getYearReleased() {
//        return yearReleased;
//    }
//
//    @Override
//    public String toString() {
//        String toPrint = "The Movie is: " + this.movieName + "This movie was rated: " + this.rating + "stars" + "It was released in: ";
//        return toPrint;
//    }
//}
