
public abstract class Shape {
	protected String name;
	protected double width;
	protected double area;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return name + ", width=" + width + ", area=" + area;
	}

	public abstract void getWidth();
	public abstract void getArea();	

}
