public class Ball {

	// instance variables
	private double bounciness;
	private int height;

	// getters
	
	public double getBounciness() {
		return this.bounciness;
	}

	public int getHeight() {
		return this.height;
	}

	// setters
	
	public void setBounciness(double n) {
		if ((n > 0) && (n < 1)) {
			this.bounciness = n;
		} else {
			this.bounciness = 0.5;
		}
	}


	public void setHeight(int n) {
		if (n > 0) {
			this.height = n;
		} else {
			this.height = 1;
		}
	}


	// constructors
	
	public Ball(double b, int h) {
		this.setBounciness(b);
		this.setHeight(h);
	}

	public Ball(Ball b) {
		this.setBounciness(b.getBounciness());
		this.setHeight(b.getHeight());
	}


	// methods
	public int numberOfBounces() {
		int testHeight = this.getHeight();
		int count = 0;
		while (testHeight > 0) {
			testHeight = (int) (testHeight * this.bounciness);
			count++ ;
		}
		return count;
	}


	public void bounce() {
		this.height = (int) (this.height * this.bounciness);
	
	}


	public boolean equals(Ball b) {
		if ((this.getBounciness() == b.getBounciness()) && (this.getHeight() == b.getHeight())) {
			return true;
		} else {
			return false;
		}
	}












}
