public abstract class StreamingMedia {

	// instance variables
	private String title;
	private int length;


	// constructors
	public StreamingMedia(String aTitle, int aLength) {
		this.setTitle(aTitle);
		this.setLength(aLength);
	}


	public StreamingMedia(StreamingMedia toCopy) {
		this.setTitle(toCopy.getTitle());
		this.setLength(toCopy.getLength());
	}

	// methods
	public String getTitle() {
		return this.title;
	}


	protected void setTitle(String aTitle) {
		this.title = aTitle.toUpperCase();
	}

	

	public int getLength() {
		return this.length;
	}


	protected void setLength(int aLength) {
		if (aLength > 0) {
			this.length = aLength;
		}
		// initializes length to 10
		else if (this.length == 0) {
			this.length = 10;
		}
	}


	public char getCategory() {
		int rating = this.getRating();
		if ((rating == 10) || (rating == 9)) {
			return 'A';
		}
		else if ((rating == 8) || (rating == 7)) {
                        return 'B';
                }
		else if ((rating == 6) || (rating == 5)) {
                        return 'C';
                }
		else if ((rating == 4) || (rating == 3)) {
                        return 'D';
                }
		else {
			return 'F';
		}


	}


	// abstract class
	public abstract int getRating();


	public String toString() {
		return "Title: " + this.title + " Length: " + this.length;
	}








}
