package Day5;

import java.util.ArrayList;
import java.util.Iterator;

import Day3.MyConsole;

class Book
{
	private int BookId;
	private String title;
	private double amount;
	
	Book(int BookId,String title,double amount)
	{
		this.BookId=BookId;
		this.title=title;
		this.amount=amount;
	}
	public int getBookId() {
		return BookId;
	}

	public String getTitle() {
		return title;
	}

	public double getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return "The Book:"+title+" Costs:"+amount;
	}
}
class BookStore implements Iterable<Book>
{
	private ArrayList<Book> books=new ArrayList<Book>();

	//------------------------------------NEW BOOK
	public void AddBook(Book bk) 
	{
		books.add(bk);
	}

	//----------------------------------UPDATE BOOK
	public String UpdateBook(Book bk) throws Exception
	{
		for(int i=0;i<books.size();i++) 
		{
			if(books.get(i).getBookId()==bk.getBookId()) 
			{
				books.remove(i);
				books.add(i, bk);
				return "Book Updated";
			}
		}
		throw new Exception("Book Not Found");
	}
	
	//-----------------------------------REMOVE BOOK
	public String RemoveBook(int id) throws Exception
	{
		for(int i=0;i<books.size();i++) 
		{
			if(books.get(i).getBookId()==id) 
			{
				books.remove(i);
				return "Book Removed";
			}
		}
		throw new Exception("Book Not Found");
	}
	
	//--------------------------------------FIND BOOK
	public ArrayList<Book> Find(String title)
	{
		ArrayList<Book> temp=new ArrayList<Book>();
		for(Book bk:books)
		{
			if(bk.getTitle().contains(title))
				temp.add(bk);
		}
		return temp;
	}

	//------------------------------------ITERATE THE ALL BOOKS
	@Override
	public Iterator<Book> iterator() 
	{
		return books.iterator();
	}
	
}
public class BookStoreArrayList 
{
	static BookStore lib=new BookStore();
	public static void main(String[] args) 
	{
		boolean run=true;
		do 
		{
			int choice=MyConsole.GetInt(GetMenu());
			if(choice<=5 && choice!=0) 
				ProcessMenu(choice);
			else
				run=false;
		}
		while(run);	
	}

	private static void UpdateBook() 
	{
		try 
		{
			int id=MyConsole.GetInt("Enter the Book Id:");
			String title=MyConsole.GetString("Enter the Book Name:");
			double amount=MyConsole.GetDouble("Enter the Book Price:");
			String newmessage=lib.UpdateBook(new Book(id,title,amount));
			System.out.println(newmessage);	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void DisplayAllBoks() 
	{
		Iterator<Book> it=lib.iterator();
		while(it.hasNext())
			MyConsole.Print(it.next());
	}

	private static void DeleteBook() 
	{
		try 
		{
			int id=MyConsole.GetInt("Enter the Book Id To Delete:");
			String message=lib.RemoveBook(id);
			System.out.println(message);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void ProcessMenu(int choice) 
	{
			switch(choice)
			{
				case 1:
					CreateNewBook();
					break;
				case 2:
					UpdateBook();
					break;
				case 3:
					DeleteBook();
					break;
				case 4:
					FindBook();
					break;
				case 5:
					DisplayAllBoks();
					break;
				default:
					break;
			}
	}
	private static void FindBook()
	{
		String title=MyConsole.GetString("Enter the Book Name You Want:");
		ArrayList<Book> temp=lib.Find(title);
		for(Book tp:temp )
		{
			MyConsole.Print(tp);
		}
	}
	private static void CreateNewBook() 
	{
		int id=MyConsole.GetInt("Enter the Book Id:");
		String title=MyConsole.GetString("Enter the Book Name:");
		double amount=MyConsole.GetDouble("Enter the Book Price:");
		lib.AddBook(new Book(id,title,amount));
		System.out.println("Book Added Successfully");
	}

	private static String GetMenu() 
	{
		String menu="PRESS 1-------------------->ADD BOOK \n";
		menu+="PRESS 2-------------------->UPDATE BOOK \n";
		menu+="PRESS 3-------------------->REMOVE BOOK \n";
		menu+="PRESS 4-------------------->FIND BOOK \n";
		menu+="PRESS 5-------------------->DISPLAY ALL BOOKS \n";
		menu+="ENTER YOUR CHOICE ANY OTHER WILL BE CONSIDERED AS EXIT";
		return menu;
	}

}
