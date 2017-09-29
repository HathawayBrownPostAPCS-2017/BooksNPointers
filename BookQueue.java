import java.util.*;

public class BookQueue {

		public static void main(String[] args) 
		{
			Queue<Book> myBookQueue = new LinkedList<Book>();
			
			if (myBookQueue.isEmpty()) {
				System.out.println("No Books yet!");
			}
			else {
				System.out.println("For some reason, there are Books in the Queue!");
			}
			
			myBookQueue.add(new Book("To Kill a Mockingbird", "Lee", "Harper", 336, 1960));
			myBookQueue.add(new Book("1984", "Orwell", "George", 328, 1949));
			myBookQueue.add(new Book("Harry Potter and the Sorcerer's Stone", "Rowling", "J.K.", 309, 1997));
			myBookQueue.add(new Book("Un Pappilon dans le Cite", "Pineau", "Giselle", 125, 1992));
			
			if (myBookQueue.isEmpty()) {
				System.out.println("Whoa! There aren't any Books!");
			}
			else
			{
				while (!myBookQueue.isEmpty())
				{
					System.out.println(myBookQueue.remove());
				}
			}
			


		}

	}

