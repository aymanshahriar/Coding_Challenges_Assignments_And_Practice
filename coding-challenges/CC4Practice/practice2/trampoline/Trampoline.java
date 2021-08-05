public class Trampoline extends Bouncer {

	// instance variables
	private int weightOfJumper;	


	// constructors
	public Trampoline(int weightOfJumper, double height) {
		super(height);
		this.setWeightOfJumper(weightOfJumper);
	}

	public Trampoline(Trampoline toCopy) {
		super(toCopy);
		this.weightOfJumper = toCopy.weightOfJumper;
	}


	// methods
	public int getWeightOfJumper() {
		return this.weightOfJumper;
	}

	public void setWeightOfJumper(int weight) {
		if ((weight >= 50) && (weight <= 300)) {
			this.weightOfJumper = weight;
		}
		else {
			this.weightOfJumper = 140;
		}
	}


	public double heightAfterBounces(int numOfBounces) {
		double testHeight = this.getHeight();
		for (int x = 1; x <= numOfBounces; x++) {
			testHeight *= (((double) this.weightOfJumper + testHeight) / (3.5 * testHeight)) / 100.0;
			if (testHeight < 1.0) {
				testHeight = 0;
			}
		}
		return testHeight;
	}





	public String toString() {
		return "[Trampoline] " + super.toString();
	}














}
