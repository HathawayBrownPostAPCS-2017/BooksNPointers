/** 
 * Represents a node in a singly-linked list.
 * See also: Code in Litvin & Litvin "Java Methods" page 505
 */

public class BookNode {

	private Book thisBook;
	private BookNode next;
	
	// ---------  Constructors ------------------------
	public BookNode (Book b)
	{
		thisBook = b;
		next = null;
	}
	
	public BookNode (Book b, BookNode nxt)
	{
		thisBook = b;
		next = nxt;
	}
	
	public Book getValue ()  
	{  return thisBook; }
	
	public BookNode getNext ()
	{  return next;  }
	
	public void setValue (Book b)
	{  thisBook = b;  }
	
	public void setNext (BookNode n)
	{  next = n;  }
}
