public class Line {

	// instance variables
	private Point start;	
	private Point end;

	// getters
	
	public Point getStart() {
		Point copyStart = new Point(this.start);
		return copyStart;
	}

	public Point getEnd() {
		Point copyEnd = new Point(this.end);
		return copyEnd;
	}

	
	// setters 
	public void setStart(Point p) {
		Point copyPoint = new Point(p);
		this.start = copyPoint;
	}

	public void setEnd(Point p) {
		Point copyPoint = new Point(p);
		this.end = copyPoint;
	}
	
	// length method
	public double length() {
		return this.start.distance(this.end);
	}


	// constructor
	
	public Line(Point start, Point end) {
		Point copyStart = new Point(start);
		//this.setStart(copyStart);
		this.start = copyStart;

		Point copyEnd = new Point(end);
		//this.setEnd(copyEnd);
		this.end = copyEnd;
	}

























}
