package main;

import basic.Book;
class Main{

  public static void main(String[] args){
      Book book1 = new Book("Harry Potter and the Chamber of Secrets ","J. K. Rowling",2000,true);

      System.out.println(book1);

      Book book2 = new Book("Harry Potter and the Philosopher's Stone","J. K. Rowling",1998,false);

      System.out.println(book2);
      
      Book book3 = new Book("","",0,false);

      System.out.println(book3);
  }
}