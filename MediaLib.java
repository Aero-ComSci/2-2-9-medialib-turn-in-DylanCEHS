public class MediaLib
{

  public static String owner = "Dylan";
  private static int numEntries = 0; 
  private static int numBooks = 0; 
  private static int numMovies = 0; 
  private static int numSongs = 0; 


  private Book book;
  private Movie movie;
  private Song song;

  public static String getOwner(){
    return owner;
  }

  public static void changeOwner(String newOwner){
    owner = newOwner;
  }

  public static int getNumEntries(){
    return numEntries;
  }

  public static int getNumBooks(){
    return numBooks;
  }

  public static int getNumMovies(){
    return numMovies;
  }

  public static int getNumSongs(){
    return numSongs;
  }


  public void addBook(Book b){
    if (book == null){
      book = b;
      numEntries++;
      numBooks++;
    }
    else{
      System.out.println("Book already exists");
    }
  }

  public void addMovie(Movie m){
    if (movie == null){
      movie = m;
      numEntries++;
      numSongs++;
    }
    else{
      System.out.println("Movie already exists");
    }
  }

  public void addSong(Song s){
    if (song == null){
      song = s;
      numEntries++;
      numSongs++;
    }
    else{
      System.out.println("Song already exists");
    }
  }

  public String toString() {
    String info = "";

    if (book != null){
      info += book;
    }
    if (movie != null){
      info += movie;
    }
    if (song != null){
      info += song;
    }

    return info;
  }
}
