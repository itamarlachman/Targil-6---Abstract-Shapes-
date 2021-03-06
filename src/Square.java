
public abstract class Square extends Shape {

	protected int x;
	protected int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Square(String name, int x, int y) {
		super(name);
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return super.toString() + " x=" + x + ",y=" + y;
	}
}
