public class Theatre {

	// instance variables
	private String title;
	private int rating;


	// constructors
	public Theatre(String aTitle, int aRating) {
		this.setTitle(aTitle);
		this.setRating(aRating);
	}


	public Theatre(Theatre toCopy) {
		this.setTitle(toCopy.getTitle());
		this.setRating(toCopy.getRating());
	}


	// methods
	public String getTitle() {
		return this.title;
	}


	public void setTitle(String aTitle) {
		this.title = aTitle.toUpperCase();
	}


	public String getCategory() {
		if ((this.rating == 10) || (this.rating == 9)) {
			return "A";
		}


		else if ((this.rating == 8) || (this.rating == 7)) {
                        return "B";
                }

		
		else if ((this.rating == 6) || (this.rating == 5)) {
                        return "C";
                }

		else if ((this.rating == 4) || (this.rating == 3)) {
                        return "D";
                }

		else {
			return "F";
		}

	}


	
	public int getRating() {
		return this.rating;
	}


	public void setRating(int aRating) {
		if ((aRating >= 0) && (aRating <= 10)) {
			this.rating = aRating;
		}

		
	}






}
