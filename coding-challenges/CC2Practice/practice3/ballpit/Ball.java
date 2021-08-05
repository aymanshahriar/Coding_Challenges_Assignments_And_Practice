public class Ball {

	// instance variables
	private double bounciness;
	private int height;

	// constructors
	public Ball(double b, int h) {
		this.setBounciness(b);
		this.setHeight(h);
	}

	public Ball(Ball b) {
		this.setBounciness(b.getBounciness());
		this.setHeight(b.getHeight());
	}

	// getters
	public double getBounciness() {
		return this.bounciness; // since it's a primitive data type,
					   // no security leak
	}

	public int  getHeight() {
		return this.height;
	}

	// setters
	public void setBounciness(double b) {
		if ((b > 0.0) && (b < 1.0)) {
			this.bounciness = b;
		} else {
			this.bounciness = 0.5;
		}
	}

	public void setHeight(int h) {
		if (h <= 0) {
                        this.height = 1;
                } else {
                        this.height = h;
                }

	}

	// methods
	public int numberOfBounces() {
		int h = this.height;
		int count = 0;
		while (h > 0) {
			h = (int) (h * this.bounciness);
			count += 1;
		}
		return count;	
		
		 
	
	}

	public void bounce() {
		this.height = (int) (this.height * this.bounciness);
	}

	public boolean equals(Ball b) {
		if ((b.getBounciness() == this.getBounciness()) && (b.getHeight() == this.getHeight())) {
			return true;
		} else {
			return false;
		}
	}



}
