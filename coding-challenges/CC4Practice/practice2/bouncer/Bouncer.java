public abstract class Bouncer {

	// instance variables
	private double height;

	// constructors
	public Bouncer(double height) {
		this.setHeight(height);
	}

	public Bouncer(Bouncer toCopy) {
		this.height = toCopy.getHeight();
	}

	// methods
	protected double getHeight() {
		return this.height;
	}


	protected void setHeight(double height) {
		if (height > 0.0) {
			this.height = height;
		}
		else {
			this.height = 1.0;
		}
	}


	public void bounce() {
		this.height = this.heightAfterBounces(1);
	}

	public int numberOfBounces() {
		double testHeight = this.height;
		int numBounces = 0;

		while (testHeight >= 1.0) {
			numBounces++;			
			testHeight = this.heightAfterBounces(numBounces);			
		}
		return numBounces;
	}

	public abstract double heightAfterBounces(int numOfBounces);	


	public String toString() {
		return "Height: " + this.height + " Number of bounces: " + this.numberOfBounces();
	}
















}
