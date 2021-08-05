public class Movie extends StreamingMedia {

	// instance variables
	private int rating;


	// constructors
	public Movie(String aTitle, int aLength, int aRating) {
		// we must invoke the super constructor first
		super(aTitle, aLength);
		this.setRating(aRating);
	}


	public Movie(Movie toCopy) {
		super(toCopy);
		this.rating = toCopy.getRating();
	}

	// methods
	
	@Override
	public int getRating() {
		return this.rating;
	}

	
	public void setRating(int aRating) {
		if ((aRating >= 0) && (aRating <= 10)) {
			this.rating = aRating;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " Rating: " + this.getRating();
	}





















}
