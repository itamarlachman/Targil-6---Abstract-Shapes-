
public class Box extends Square {

	public Box(int x) {
		super("Box", x, x);
	}

	@Override
	public void getWidth() {
		width =   4 * x;
	}

	@Override
	public void getArea() {
		area =  x*x;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
