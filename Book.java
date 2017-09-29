/* Implements a Book.
 * From the beginning of Post-AP Computer Science
 * 
 * @author Michael Buescher mbuescher@hb.edu
 * @version 2017-08-31
 */
public class Book {
    private String title;
    private String authorFirst;
    private String authorLast;
    private int numPages;
    private int yearPublished; 
    
	public Book (String t, String aLast, String aFirst, int p, int yr)
	{
		title = t;
		authorLast = aLast;
		authorFirst = aFirst;
		numPages = p;
		yearPublished = yr;
	}

	public String toString ()
	{
		return authorLast + ", " + authorFirst + ". " +
	           title + " (" + yearPublished + "). " +
				numPages + " pages.";
	}
	
}
