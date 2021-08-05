import java.util.ArrayList;
public class BallPit {

	// instance variables
	
	private String name;
	private ArrayList<Ball> ballList = new ArrayList<Ball>();

	// getters
	
	public String getName() {
		String copyName = new String(this.name);
		return copyName;
	}

	public ArrayList<Ball> getBallList() {
		ArrayList<Ball> copyList = new ArrayList<Ball>();
		for (Ball eachBall : ballList) {
			Ball copyBall = new Ball(eachBall);
			copyList.add(copyBall);
		}
		return copyList;
	}

	// no setters

	// constructors
	
	public BallPit(String n) {
		this.name = n;
	}


	// methods
	public void addBall(Ball b) {
		Ball copyBall = new Ball(b);
		ballList.add(copyBall);
	}

	public Ball getBallWithMostBounces() {
		if (ballList.isEmpty()) {
			return null;
		}
		else {

			ArrayList<Ball> copyList = this.getBallList();
			for (int i = 0; i <= copyList.size(); i++) {
				for (int j = 0; j < (copyList.size()-1); j++) {
					if (copyList.get(j).numberOfBounces() < copyList.get(j+1).numberOfBounces()) {
						Ball copyBall = new Ball(copyList.get(j+1));
						copyList.remove(j+1);
						copyList.add(j, copyBall);
					}
				}
			}
			return copyList.get(0);
		}
	}

























}
