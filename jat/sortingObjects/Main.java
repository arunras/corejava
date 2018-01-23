package core.jat.sortingObjects;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //List<Book> books = new ArrayList<>();
  	Map<Book, Integer> books = new HashMap<>();
  		
    books.put(new Book(1,"The Lord of the Rings","J. R. R. Tolkien"), 7);
		books.put(new Book(2,"Le Petit Prince","Antoine de Saint-Exupery"), 16);
		books.put(new Book(3,"Harry Potter and the Philosopher's Stone","J. K. Rowling"), 22);
		books.put(new Book(4,"And Then There Were None","Agatha Christie"), 9);
		books.put(new Book(5,"Dream of the Red Chamber","Cao Xueqin"), 1);
		books.put(new Book(6,"The Hobbit","J. R. R. Tolkien"), 5);
		books.put(new Book(7,"She: A History of Adventure","H. Rider Haggard"), 31);
		books.put(new Book(8,"The Lion, the Witch and the Wardrobe","C. S. Lewis"), 16);
		books.put(new Book(9,"The Da Vinci Code","Dan Brown"), 22);
		books.put(new Book(10,"The Catcher in the Rye","J. D. Salinger"), 19);
		books.put(new Book(11,"The Hobbit","A. A. Milne"), 4);
  
    int result = books.get(new Book(6,"The Hobbit","J. R. R. Tolkien"));
    System.out.println(result);

    /*
    Collections.sort(books, new Comparator<Book>() {
    		@Override
    		public int compare(Book o1, Book o2) {
    			return -(o1.getId() - o2.getId());
    		}
    });
    for (Book nextBook : books) {
      System.out.println(nextBook);
    }
    */   
  }
}
