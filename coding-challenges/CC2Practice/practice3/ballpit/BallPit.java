import java.util.ArrayList;
public class BallPit {

	// instance variables
	private String name;
	private ArrayList<Ball> ballList = new ArrayList<Ball>();

	// constructors
	public BallPit(String n) {
		String copyN = new String(n);
		this.name = copyN;
	}

	// getters
	
	public String getName() {
		String n = new String(this.name);
		return n;
	}

	public ArrayList<Ball> getBallList() {
		ArrayList<Ball> copyList = new ArrayList<Ball>();
		for (Ball eachBall : this.ballList) {
			Ball c = new Ball(eachBall);
			copyList.add(c);
		}
		return copyList;
	}

	// methods
	
	public void addBall(Ball b) {
		Ball copyB = new Ball(b);
		ballList.add(copyB);
	}

	public Ball getBallWithMostBounces() {
		if (this.ballList.isEmpty()) {
			return null;
		} else {
			ArrayList<Ball> copyList = this.getBallList();    // no privacy leaks
			for (int i = 0; i < copyList.size(); i++) {
				for (int j = 0; j < (copyList.size() - 1); j++) {
					if ((copyList.get(j).numberOfBounces()) < (copyList.get(j+1).numberOfBounces())) {
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
