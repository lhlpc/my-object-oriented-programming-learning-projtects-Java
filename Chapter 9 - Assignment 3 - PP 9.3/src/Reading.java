
public abstract class Reading {
	
	private int pages;
	private String title;
	
	public Reading(String title, int pages){		
		this.title = title;
		this.pages = pages;
	}
	
	//Modifiers
	
	public void setPages(int pages){
		this.pages = pages;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	//Gets
	
	public String getTitle(){
		return this.title;
	}
	
	public int getPages(){
		return this.pages;
	}
}
