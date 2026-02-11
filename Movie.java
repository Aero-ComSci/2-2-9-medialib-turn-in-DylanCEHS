public class Movie {
    private String title;
    private double duration;
    private int rating;

    public Movie(String title, double duration){
        this.title = title;
        this.duration = duration;
        this.rating = 0;
    }

    public String getTitle(){
        return title;
    }

    public double getDuration(){
        return duration;
    }

    public int getRating(){
        return rating;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDuration(double duration){
        this.duration = duration;
    }

    public int adjustRating(int r){
        int newRating = rating + r;
        if (newRating >= 0 && newRating <=10){
            rating = newRating;
        }
        return rating;
    }

    public boolean equals(Movie m){
        if (m == null){
            return false;
        }
        return this.title.equals(m.title) && Double.compare(this.duration, m.duration) == 0;
    }

    public String toString(){
        return "\n Title: " + title + " \n Duration: " + duration + " \n Rating: " + rating;
    }
}
