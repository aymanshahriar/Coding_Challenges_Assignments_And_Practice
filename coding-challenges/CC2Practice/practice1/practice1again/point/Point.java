public class Point {

	private int xcoord;
	private int ycoord;

	// constructors
	
	// copy constructor
	public Point(Point p) {
		this.xcoord = p.getXCoord();
		this.ycoord = p.getYCoord();
	}

	public Point(int x, int y) {
		this.setXCoord(x);
		this.setYCoord(y);
	}

	
	// getter and setter methods
	
	public int getXCoord() {
		return this.xcoord;
	}

	public int getYCoord() {
		return this.ycoord;
	}

	public void setXCoord(int n) {
		if (n >= 0) {
			this.xcoord = n;
		}
	}

	public void setYCoord(int n) {
		if (n >= 0) {
			this.ycoord = n;
		}
	}
	
	// methods
	public void moveUp(int y) {
		int newY = this.ycoord - y;
		this.setYCoord(newY);		
	}

	public void moveDown(int y) {
		int newY = this.ycoord + y;
                this.setYCoord(newY);
	}

	public void moveRight(int x) {
		int newX = this.xcoord + x;
                this.setXCoord(newX);
	}

	public void moveLeft(int x) {
		int newX = this.xcoord - x;
                this.setXCoord(newX);
	}

	public double distance(Point p) {
		double first = (this.xcoord - p.getXCoord()) * (this.xcoord - p.getXCoord());
		double second =(this.ycoord - p.getYCoord()) * (this.ycoord - p.getYCoord());
		return Math.sqrt(first + second);
	}

	public boolean equals(Point p) {
		if ((this.xcoord == p.getXCoord()) && (this.ycoord == p.getYCoord())) {
			return true;
		} else {
			return false;
		}
		
	}















}
