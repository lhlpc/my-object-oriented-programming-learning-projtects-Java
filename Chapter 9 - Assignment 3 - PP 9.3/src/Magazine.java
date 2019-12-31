
public class Magazine extends Reading {

	private String edition;
	private String periodicity;
	
	public Magazine(String title, String edition, int pages, String periodicity){
		super(title, pages);
		this.edition = edition;
		this.periodicity = periodicity;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public String toString() {
		return "Title: " + getTitle() + "\nEdition: " + getEdition() + "\nPages: " + getPages() + "\nPeriodicity: " + getPeriodicity();
	}	
	
	
}
