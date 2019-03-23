package pkgShape;

public class Cuboid extends Rectangle {
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) throws Exception {
		super(iWidth, iLength);
		if(iDepth < 0) {
			throw new IllegalArgumentException("Invalid Depth");
		}
		else {
			this.iDepth = iDepth;
		}
	}
	
	public int getiDepth() {
		return this.iDepth;
	}
	
	public void setiDepth(int depth) {
		this.iDepth = depth;
	}
	
	public double volume() {
		return getiLength() * getiWidth() * this.iDepth;
	}
	
	@Override
	public double area() {
		return super.area() * this.iDepth;
	}
	
	//Throws an exception if this method is attempted to be called
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter does not apply to a cuboid");
	}
	
	//Because the class hierarchy already implements a Comparable, must use nested class's
	//to add more comparable methods.
	class SortByArea implements Comparable<Cuboid> {
		@Override
		public int compareTo(Cuboid o) {
			Cuboid cube = (Cuboid) o;
			return (int) (area() - cube.area());
			}
		}
	
	//sorts Cuboids by volume, sub classes are default as per instructions.
	class SortByVolume implements Comparable<Cuboid> {
		@Override
		public int compareTo(Cuboid o) {
			Cuboid cube = (Cuboid) o;
			return (int) (volume() - cube.volume());
		}
	}
}
