import java.util.Date;

public class Movie extends Theatre {

	// instance variables
	private String director;
	private Date releaseDate;


	// constructors
	public Movie(String aTitle, int aRating, String aDirector, Date aReleaseDate) {
		super(aTitle, aRating);
		
		this.setDirector(aDirector);
		this.setReleaseDate(aReleaseDate);
	}

	public Movie(Movie toCopy) {
		super(toCopy.getTitle(), toCopy.getRating());
		this.setDirector(toCopy.getDirector());
		this.setReleaseDate(toCopy.getReleaseDate());

	}
	

	// methods
	public String getCategory() {
		return this.getReleaseDate() + "-" + super.getCategory();
	}


	public String getDirector() {
		return this.director;
	}

	public void setDirector(String aDirector) {
		this.director = aDirector;
	}


	public Date getReleaseDate() {
		return this.releaseDate;
	}


	public void setReleaseDate(Date aReleaseDate) {
		Date today = new Date();

		if (((float) aReleaseDate.getTime() - (float) today.getTime()) <=  31536000000L ) {
			this.releaseDate = aReleaseDate;
		}
		else {
			this.releaseDate = today;
		}
		
	}












}
