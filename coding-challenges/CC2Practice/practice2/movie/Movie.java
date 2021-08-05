public class Movie {

	// instance variables
	private String title;
	private int rating;

	// constructors
	public Movie(String t, int r) {
		this.setTitle(t);
		this.setRating(r);
	}

	public Movie(Movie m) {
		this.title = m.getTitle();
		this.rating = m.getRating();
	}

	// getters
	public String getTitle() {
		String copyTitle = new String(this.title);
		return copyTitle;
	}

	public int getRating() {
		return this.rating;
	}

	// setters
	public void setTitle(String t) {
		String copyt = new String(t);
		this.title = copyt.toUpperCase();
	}

	public void setRating(int r) {
		if ((r >= 0) && (r <= 10)) {
			this.rating = r;
		}
	}

	// getCategory() method
	public char getCategory() {
		if ((rating == 10) || (rating == 9))
			return 'A';
		else if ((rating == 8) || (rating == 7))
                        return 'B';
		else if ((rating == 6) || (rating == 5))
                        return 'C';
		else if ((rating == 4) || (rating == 3))
                        return 'D';
		else
			return 'F';
	}









}
