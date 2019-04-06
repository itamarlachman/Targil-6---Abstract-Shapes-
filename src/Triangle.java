
public class Triangle extends Shape {

	private float[] lines;
	private float height;
	
	public Triangle(float[] lines,float height) {
		super("Triangle");
		this.lines = lines;
		this.height = height;
	}

	@Override
	public void getWidth() {
		width = 0;
		for(float line: lines) {
			width += line;
		}
	}
	@Override
	public void getArea() {
		area = lines[0] * height;

	}
	
	@Override
	public String toString() {
		String result =  super.toString();
		result += ", lines:";
		for(float line: lines) {
			result += line + "," ;
		}
		result += " height: " + height;
		
		return result;
	}
}
