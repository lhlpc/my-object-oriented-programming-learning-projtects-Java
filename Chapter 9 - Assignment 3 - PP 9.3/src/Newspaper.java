
public class Newspaper extends Reading{
	
	private String releaseDate;
	
	public Newspaper(String title, int pages, String releaseDate){
		super(title, pages);
		this.releaseDate = releaseDate;
	}
	
	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}
	
	public String getReleaseDate(){
		return this.releaseDate;
	}
	
	public String toString(){
		return "Title: " + getTitle() + "\nPages: " + getPages() + "\nRelease Date: " + getReleaseDate();
		
	}
}
