public class Point {

	// instance variables
	private int xcoord;
	private int ycoord; 

	// constructors
	
	
	public Point(Point p) {                  // copy constructor
		this.xcoord = p.getXCoord();
		this.ycoord = p.getYCoord();
	}

	
	public Point(int x, int y) {
		this.setXCoord(x);
		this.setYCoord(y);
	}

	// getter methods
	
	public int getXCoord() {
		return this.xcoord;
	}

	public int getYCoord() {
		return this.ycoord;
	}

	// setter methods
	
	public void setXCoord(int x) {
		if (x >= 0) 
			this.xcoord = x;
	}

	public void setYCoord(int y) {
		if (y >= 0)
			this.ycoord = y;
	}

	public void moveUp(int y) {
		int n = this.ycoord - y;
		this.setYCoord(n);
	}

	public void moveDown(int y) {
		int n = this.ycoord + y;
		this.setYCoord(n);
	}

	public void moveLeft(int x) {
		int n = this.xcoord - x;
		this.setXCoord(n);

	}

	public void moveRight(int x) {
		int n = this.xcoord + x;
		this.setXCoord(n);

	}

	public double distance(Point p) {
		double x1 = this.getXCoord();
		double y1 = this.getYCoord();

		double x2 = p.getXCoord();
		double y2 = p.getYCoord();

		double firstPart = (x1 - x2) * (x1 - x2);
		double secondPart = (y1 - y2) * (y1 - y2);
		double thirdPart = firstPart + secondPart;

		return Math.sqrt(thirdPart);
	}

	public boolean equals(Point p) {
		if ((this.getXCoord() == p.getXCoord()) && (this.getYCoord() == p.getYCoord())) {
			return true;
		}
		else {
			return false;
		}
	}



}
