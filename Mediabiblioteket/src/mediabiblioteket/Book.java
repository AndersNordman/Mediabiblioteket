package mediabiblioteket;

public class Book extends Media
{
	String Author;

	/**
	 * 
	 * @param mediaType. Mediatypen
	 * @param title. Titeln till boken
	 * @param objectID. Det unika ID:t kopplat till boken
	 * @param year. Året boken publicerades
	 * @param author. Författaren till boken
	 */
	public Book(String mediaType, String title, String objectID, int year, String author)
	{
		super(mediaType, title, objectID, year);
		Author = author;
	}

	public String getAuthor()
	{
		return Author;
	}

	public void setAuthor(String author)
	{
		Author = author;
	}
	
	public String toString()
	{
		String borrowed="";
		if(isBorrowed())
		{
			borrowed += "Borrowed\n";
		}
		else
			borrowed += "Free\n";
					
		return mediaType + " - " + borrowed + " - " + title + " - " + getYear() + " - " + Author;
	}
	
	/**
	 * Slå ihop alla attribut för en viss Bok i en sträng
	 * @return Konkatenerad sträng med all info rörande en viss Bok
	 */
	public String listInfo()
	{
		String theInfoString = "Title: " + title + " \n";
		
		theInfoString += "Year: " + getYear() + "\n";
		theInfoString += "Author: " + Author + "\n";
		theInfoString +="Type: " + mediaType + "\n";
		
		if(isBorrowed())
		{
			theInfoString += "Taken\n";
			theInfoString += "Borrower: " + getThisMediaBorrower().getName() + "\n";
		}
		else
			theInfoString += "Free\n";
		
		theInfoString += "ID: " +  getObjectID() + "\n";
		
		return theInfoString;
	}
	
}
