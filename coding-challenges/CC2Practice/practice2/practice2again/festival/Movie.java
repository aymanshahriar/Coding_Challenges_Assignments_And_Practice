public class Movie {

	// instance variables
	private String title;
	private int rating;

	// getters
	
	public String getTitle() {
		return this.title;
	}

	public int getRating() {
		return this.rating;
	}

	// setters
	
	public void setTitle(String t) {
		String uppercaseT = t.toUpperCase();
		this.title = uppercaseT;
	}

	public void setRating(int r) {
		if ((r >= 0) && (r <= 10)) {
			this.rating = r;
		}
	}

	// constructors
	
	public Movie(String t, int r) {
		this.setTitle(t);
		this.setRating(r);
	}

	// copy constructor
	public Movie( Movie m) {
		this.setTitle(m.getTitle());
		this.setRating(m.getRating());
	}

	// methods
	
	public char getCategory() {
		if ((this.rating == 10) || (this.rating == 9)) {
			return 'A';
		}
		else if ((this.rating == 8) || (this.rating == 7)) {
                        return 'B';
		}
		else if ((this.rating == 6) || (this.rating == 5)) {
                        return 'C';
		}
		else if ((this.rating == 4) || (this.rating == 3)) {
                        return 'D';
		}
		else {
			return 'F';
		}





	}















}
