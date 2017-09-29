
public class TestLinkedListWithTail {

	public static void printList (BookNode h)
	{
		System.out.println("Head");
		for (BookNode node = h; node != null; node = node.getNext())
		{
			Book b = node.getValue();
			System.out.println(b);
		}
		System.out.println ("Tail");
	}
	
	public static void main(String[] args) {
		
		Book book1 = new Book("To Kill a Mockingbird", "Lee", "Harper", 336, 1960);
		Book book2 = new Book("1984", "Orwell", "George", 328, 1949);
		Book book3 = new Book("Harry Potter and the Sorcerer's Stone", "Rowling", "J.K.", 309, 1997);
		Book book0 = new Book("Un Pappilon dans le Cite", "Pineau", "Giselle", 125, 1992);
		Book book4 = new Book("Jurasic Park", "Crichton", "Michael", 448, 1990);
		
		
		// Start with an empty list
		BookNode head = null;
		BookNode tail = null;
		printList (head);
		
		// Add the first book.
		head = new BookNode(book1, null);
		tail = head;
		printList (head);
		
		// Add the next book - at the end
		tail.setNext(new BookNode (book2, null));
		tail = head.getNext();
		printList (head);
		
        // NOW how could you add a book at the end?
		tail.setNext(new BookNode (book3, null));
		printList (head);
		
		// How could you add a book in the middle?

	}

}
