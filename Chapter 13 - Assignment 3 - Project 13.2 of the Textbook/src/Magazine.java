//********************************************************************
//  Magazine.java       Author: Lewis/Loftus
//
//  Represents a single magazine.
//********************************************************************
public class Magazine implements Comparable{
	private String title;

	// -----------------------------------------------------------------
	// Sets up the new magazine with its title.
	// -----------------------------------------------------------------
	public Magazine(String newTitle) {
		title = newTitle;
	}

	// -----------------------------------------------------------------
	// Returns this magazine as a string.
	// -----------------------------------------------------------------
	public String toString() {
		return title;
	}

	@Override
	public int compareTo(Object o) {
		int comparison = this.title.compareTo(((Magazine)o).toString());
		if(comparison < 0)
			return -1;
		if(comparison == 0)
			return 0;
		else
			return 1;

	}
}
