
public class Rectangle extends Square {

	public Rectangle(int x, int y) {
		super("Rectangle", x, y);
	}

	@Override
	public void getWidth() {
		width =  2 * (x + y );
	}

	@Override
	public void getArea() {
		area =  x *y;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
