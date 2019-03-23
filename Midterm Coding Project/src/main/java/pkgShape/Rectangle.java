package pkgShape;

public class Rectangle extends Shape implements Comparable<Rectangle> {
	private int iWidth;
	private int iLength; 
	
	public Rectangle(int width, int length) throws Exception {
		if(width < 0 || length < 0) {
			throw new IllegalArgumentException("Invalid Rectangle Dimensions.");
		}
		else {
			this.iWidth = width;
			this.iLength = length;
		}
	}
	
	public int getiWidth() {
		return this.iWidth;
	}
	
	public void setiWidth(int width) {
		this.iWidth = width;
	}
	
	public int getiLength() {
		return this.iLength;
	}
	
    public void setiLength(int length) {
		this.iLength = length;
	}

	@Override
	public double area() {
		return this.iLength * this.iWidth;
	}

	@Override
	public double perimeter() {
		return (this.iLength*2) + (this.iWidth*2);
	}

	@Override
	public int compareTo(Rectangle o) {
		Rectangle rec = (Rectangle) o;
		return (int) (this.area() - rec.area());
	}
}
