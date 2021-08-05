public class Song extends StreamingMedia {

	// instance variables
	private int numOfLikes;


	// constructors
	public Song(String aTitle, int aLength) {
		// we must envoke the parent constructor first
		super(aTitle, aLength);
		// actually, even if we dont manually envoke the constructor, the paameters of the parent and child constructors match, so it will be all right
		// the numOfLikes should be initialized to 0
	}

	
	public Song(Song toCopy) {
		super(toCopy);
		this.numOfLikes = toCopy.getNumOfLikes();

	}

	// methods
	public void addLikes(int amount) {
		if (amount >= 0) {
			this.numOfLikes += amount;
		}
	}

	public int getNumOfLikes() {
		return this.numOfLikes;
	}

	@Override
	public int getRating() {
		if (this.numOfLikes >= 5000) {
			return 9;
		}
		else if (numOfLikes >= 500) {
			return 7;
		}
		else if (numOfLikes >= 50) {
			return 5;
		}
		else if (numOfLikes >= 10) {
			return 3;
		}
		else {
			return 1;
		}
	}

	
	public String toString() {
		return super.toString() + " Likes: " + this.getNumOfLikes();
	}



















}
