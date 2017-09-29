import java.util.*;

public class BookStack {

	public static void main(String[] args) {
		Stack<Book> myBookStack = new Stack<Book>();
		
		if (myBookStack.isEmpty()) {
			System.out.println("No Books yet!");
		}
		else {
			System.out.println("For some reason, there are Books in the stack!");
		}
		
		myBookStack.push(new Book("To Kill a Mockingbird", "Lee", "Harper", 336, 1960));
		myBookStack.push(new Book("1984", "Orwell", "George", 328, 1949));
		myBookStack.push(new Book("Harry Potter and the Sorcerer's Stone", "Rowling", "J.K.", 309, 1997));
		myBookStack.push(new Book("Un Pappilon dans le Cite", "Pineau", "Giselle", 125, 1992));
		
		if (myBookStack.isEmpty()) {
			System.out.println("Whoa! There aren't any Books!");
		}
		else
		{
			while (!myBookStack.isEmpty())
			{
				System.out.println(myBookStack.pop());
			}
		}
		


	}

}

/*
new Book("To Kill a Mockingbird", "Lee", "Harper", 336, 1960));
myList.add(new Book("1984", "Orwell", "George", 328, 1949));
myList.add(new Book("Harry Potter and the Sorcerer's Stone", "Rowling", "J.K.", 309, 1997));
myList.add(2,new Book("Un Pappilon dans le Cite", "Pineau", "Giselle", 125, 1992));
*/