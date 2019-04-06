
public class Circle extends Shape {

	private float radius;
	private double PI = (double) Math.PI;
	
	public Circle(float radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public void getWidth() {
		width = 2 * PI * radius;

	}

	@Override
	public void getArea() {
		area = PI * Math.pow(radius,2);
	}

	@Override
	public String toString() {
		return super.toString() + ",radius: " + radius;
	}
}
