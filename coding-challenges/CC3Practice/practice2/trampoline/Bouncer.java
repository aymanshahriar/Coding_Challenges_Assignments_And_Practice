public class Bouncer {

	// instance variables
	private int height;
	private double bounciness;


	// constructors
	
	
	public Bouncer(double bounciness, int height) {
		this.setHeight(height);
		this.setBounciness(bounciness);
	}

	// copy constructor
	public Bouncer(Bouncer toCopy) {
		this.height = toCopy.getHeight();
		this.bounciness = toCopy.getBounciness();
	}


	// methods
	public void setHeight(int height) {
		if (height <= 0) {
			this.height = 1;
		}
		else {
			this.height = height;
		}	
	
	}

	
	public int getHeight() {
		return height;
	}


	public void setBounciness(double bounciness) {
		if ((bounciness > 0.0) && (bounciness < 1.0)) {
			this.bounciness = bounciness;
		} else {
			this.bounciness = 0.5;
		}
	}

	public double getBounciness() {
		return this.bounciness;
	}

	public void bounce() {
		this.height = (int) (this.getHeight() * this.getBounciness());
	}

	public int numberOfBounces() {
		int testHeight = this.getHeight();
		int count = 0;
		while (testHeight > 0) {
			testHeight = (int) (testHeight * this.getBounciness());
			count ++;
		}
		return count;
	
	}

	
	public boolean equals(Bouncer other) {
		if ((this.height == other.getHeight()) && (this.getBounciness() == other.getBounciness())) {
			return true;
		}
		else {
			return false;
		}
	}






}
