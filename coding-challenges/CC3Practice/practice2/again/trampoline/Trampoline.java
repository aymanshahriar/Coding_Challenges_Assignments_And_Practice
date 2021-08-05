public class Trampoline extends Bouncer{


	// instance variables
	private int weightOfJumper;


	// constructors
	public Trampoline(int weightOfJumper, double bounciness, int height) {
		super(bounciness, height);
		this.setWeightOfJumper(weightOfJumper);
	}

	public Trampoline(Trampoline toCopy) {
		super(toCopy.getBounciness(), toCopy.getHeight());
		this.setWeightOfJumper(toCopy.getWeightOfJumper());
	
	}

	// methods
	public void setWeightOfJumper(int weight) {
		if ((weight >= 50) && (weight <= 300)) {
			this.weightOfJumper = weight;
		}
		else {
			this.weightOfJumper = 140;
		}
	}


	public int getWeightOfJumper() {
		return this.weightOfJumper;
	}

	public double getBounciness() {
			
		if (this.weightOfJumper < 100) {
			double b = 0.75 * super.getBounciness();
			this.setBounciness(b);
		}
		else if (this.weightOfJumper > 200) {
                        double b = 1.2 * super.getBounciness();
                        if (b >= 0.99) {
                                this.setBounciness(0.99);
                        }
                        else {
				this.setBounciness(b);
			}
                }
		else if (this.weightOfJumper > 150) {
                        double b = 1.1 * super.getBounciness();
                        if (b >= 0.99) {
                                this.setBounciness(0.99);
                        }
                        else {
                                this.setBounciness(b);
                        }

                }
		else {
			return super.getBounciness();
		}
		return super.getBounciness();


                

	}












}
