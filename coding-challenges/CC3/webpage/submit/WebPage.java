public class WebPage extends Document{


	// instance variables
	private int visits;


	// constructors
	public WebPage(int size, String language, String authors, String uri, int visits, double rank) {
		super(size, language, authors, uri, rank);
		this.setVisits(visits);
	}


	public WebPage(WebPage copy) {
		super(copy.getSize(), copy.getLanguage(), copy.getAuthors(), copy.getUri(), copy.getRank());

		this.setVisits(copy.getVisits());
	
	
	}
	

	// methods
	@Override
	public double getRank() {
		double newRank = (1.0 - (1.0 / this.getVisits()));
		super.setRank(newRank);
		return super.getRank();


	}


	public int getVisits() {
		return this.visits;
	}


	public void setVisits(int v) {
		if ((this.visits == 0) && (v == 0)){
			this.visits = 1;
		}

		else if ((this.visits == 0) && (v < 0)){
                        this.visits = 1;
                }


		else if ((this.visits < v) && (v >= 1)) {
			this.visits = v;
		}
	
	}



}
