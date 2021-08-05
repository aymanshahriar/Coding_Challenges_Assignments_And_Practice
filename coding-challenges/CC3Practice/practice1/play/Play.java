public class Play extends Theatre{

	private String writer;
	private int yearWritten;



	public Play(String aTitle, int aRating, String aWriter, int yearWritten) {
		super(aTitle, aRating);
		this.setWriter(aWriter);
		this.setYearWritten(yearWritten);
	
	}


	public Play(Play toCopy) {
		super(toCopy.getTitle(), toCopy.getRating());
		this.setWriter(toCopy.getWriter());
		this.setYearWritten(toCopy.getYearWritten());
	}



	// methods
	
	public int getYearWritten() {
		return this.yearWritten;
	}

	public void setYearWritten(int year) {
		if (year < 2019) {
			this.yearWritten = year;
		}
		else {
			this.yearWritten = 2018;
		}
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String aWriter) {
		this.writer = aWriter;
	
	}


	public String getCategory() {
		if ((2019 - this.getYearWritten()) > 200) {
			return "Classic";
		}
		else if ((2019 - this.getYearWritten()) > 50) {
                        return "Contemporary";
                }
		else {
			return "Modern";
		}
	}








}
