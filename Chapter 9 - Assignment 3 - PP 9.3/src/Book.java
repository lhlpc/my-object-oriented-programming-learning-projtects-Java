
public class Book extends Reading{
	
	private String author;
	private String synopsis;
	
	public Book(String title, int pages, String author, String synopsis){
		super(title, pages);
		this.author = author;
		this.synopsis = synopsis;
	}
	
	//Modifiers
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setSynopsis(String synopsis){
		this.synopsis = synopsis;
	}
	
	//Gets
	
	public String getAuthor(){
		return this.author;
	}
	
	public String getSynopsis(){
		return this.synopsis;
	}
	
	public String toString(){
		String result = "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPages: " + getPages() + "\nSynopsis: " + getSynopsis();
		
		return result;
	}
	
	
	
}
