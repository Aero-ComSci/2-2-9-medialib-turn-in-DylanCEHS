/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }

  public int adjustRating(int r) {
    int newRating = rating + r;

    if (newRating >=0 && newRating <=10){
      rating = newRating;
    }

    return rating;
  }

  public boolean equals (Book b){
    if (b == null){
      return false;
    }
    return this.title.equals(b.title) && this.author.equals(b.author);
  }

  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String title){
    this.title = title;
  }

  public void setAuthor(String author){
    this.author = author;
  }
}
