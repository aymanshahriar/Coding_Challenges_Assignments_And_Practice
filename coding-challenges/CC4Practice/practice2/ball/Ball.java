public class Ball extends Bouncer {

	// instance variables
	private int bounciness;

	// constructors
	public Ball(int bounciness, double height) {
		super(height);
		this.setBounciness(bounciness);
	}

	public Ball(Ball toCopy) {
		super(toCopy);
		this.bounciness = toCopy.getBounciness();
	}


	// methods
	public int getBounciness() {
		return this.bounciness;
	}


	public void setBounciness(int bounciness) {
		if ((bounciness > 0) && (bounciness < 100)) {
			this.bounciness = bounciness;
		}
		else {
			this.bounciness = 50;
		}
	}

	@Override
	public double heightAfterBounces(int numOfBounces) {
		double bounciness = (this.bounciness / 100.0);
		double testHeight = this.getHeight();
		for (int x = 1; x <= numOfBounces; x++) {
			testHeight *= bounciness;
			if (testHeight < 1.0) {
				testHeight = 0;
			}
		}
		return testHeight;
	}


	public String toString() {
		return "[Ball] " + super.toString() + " Bounciness: " + this.bounciness + "%";
	}













}
