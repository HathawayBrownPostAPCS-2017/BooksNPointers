/** Implements a list of books as an ArrayList  
 * 
 * @author mbuescher
 *
 */
 import java.util.*;
 
public class BookListArrayList {
	 
	public static void main(String[] args) {
		List<Book> myList = new ArrayList<Book> ();
		myList.add(new Book("To Kill a Mockingbird", "Lee", "Harper", 336, 1960));
		myList.add(new Book("1984", "Orwell", "George", 328, 1949));
		myList.add(new Book("Harry Potter and the Sorcerer's Stone", "Rowling", "J.K.", 309, 1997));
		for (Book b : myList)
			System.out.println(b);
	}

}
