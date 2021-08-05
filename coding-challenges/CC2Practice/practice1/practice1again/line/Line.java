public class Line {

	// instance variables
	private Point start;
	private Point end;

	// getter methods
	
	public Point getStart() {
		Point copyStart = new Point(this.start);
		return copyStart;
	}

	public Point getEnd() {
		Point copyEnd = new Point(this.end);
                return copyEnd;
	}

	// setter methods
	public void setStart(Point p) {
		this.start = new Point(p);
	}

	public void setEnd(Point p) {
		this.end = new Point(p);
	}

	
	// constructors
	
	public Line(Point s, Point e) {
		this.start = new Point(s);
		this.end = new Point(e);
	}

	
	public double length() {
		double first = (start.getXCoord() - end.getXCoord()) * (start.getXCoord() - end.getXCoord());
                double second =(start.getYCoord() - end.getYCoord()) * (start.getYCoord() - end.getYCoord());
                return Math.sqrt(first + second);

	}



















}
