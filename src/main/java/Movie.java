public class Movie {
    private String movieName;
    private String year;
    private String director;
    private int rate;

    public Movie(String movieName, String year, String director, int rate) {
        this.movieName = movieName;
        this.year = year;
        this.director = director;
        this.rate = rate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getMovieDetail() {
        return String.format("movieName:%-4s year:%-4s director:%-4s rating:%d", movieName, year, director, rate);
    }
}
