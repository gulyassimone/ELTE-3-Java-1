package basic;

public class Book{

  private String title;
  private String author;
  private int year;
  private boolean available;

  public Book(String title,String author,int year,boolean available){
    if(!(year > 0 && year < 2020)){
      throw new IllegalArgumentException("Invalid year");
    }
    this.title = title;
    this.author = author;
    this.year= year;
    this.available = available;
  }

  @Override
  public String toString(){
    return ((available?"Available ":"Not available " ) + title + " written by " + author + " in " + year);
  }
}