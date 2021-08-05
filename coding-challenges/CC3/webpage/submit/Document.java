public class Document {



	// variables
	private int size;
	private String language;
	private String authors;
	private String uri;
	private double rank;


	// constructors
	public Document() {
		this.setLanguage("English");
		this.setAuthors("");
		this.setUri("");
	
	};


	public Document(int size, String authors, String uri) {
		this.setSize(size);
		this.setAuthors(authors);
		this.setUri(uri);
		
		this.setLanguage("English");
	}


	public Document(int size, String language, String authors, String uri, double rank) {
		this.setSize(size);
		this.setLanguage(language);
                this.setAuthors(authors);
                this.setUri(uri);
		this.setRank(rank);
	
	}



	// methods
	
	public int getSize() {
		return this.size;
	}


	public void setSize(int s) {
		if (s >= 0) {
			this.size = s;
		}
	}


	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String lang) {
		this.language = lang;
	}


	public String getAuthors() {
		return this.authors;
	}


	public void setAuthors(String s) {
		this.authors = s;
	}


	public String getUri() {
		return this.uri;
	}


	public void setUri(String s) {
		this.uri = s;
	}


	public double getRank() {
		return this.rank;
	}

	public void setRank(double d) {
		if (d < 0.0) {
			this.rank = 0.0;
		}
		else if (d > 1.0) {
			this.rank = 1.0;
		}
		else {
			this.rank = d;
		}


	}








}
















