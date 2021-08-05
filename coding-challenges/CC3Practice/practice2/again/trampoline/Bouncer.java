public class Bouncer {

	// instance variables
	private int height;
	private double bounciness;


	// constructors
	public Bouncer(double bounciness, int height) {
		this.setBounciness(bounciness);
		this.setHeight(height);
	
	}

	public Bouncer(Bouncer toCopy) {
		this.setBounciness(toCopy.getBounciness());
		this.setHeight(toCopy.getHeight());
	}


	// methods
	public void setHeight(int height) {
		if (height > 0) {
			this.height = height;
		}
		else {
			this.height = 1;
		}
	}


	public int getHeight() {
		return this.height;
	}


	public void setBounciness(double bounciness) {
		if ((bounciness > 0) && (bounciness < 1)) {
			this.bounciness = bounciness;
		}
		else {
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
		if ((this.height == other.getHeight()) && (this.bounciness == other.getBounciness())) {
			return true;
		}
		else {
			return false;
		}
	}








}
