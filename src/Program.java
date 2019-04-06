
public class Program {

	public static void main(String[] args) {
		Box box = new Box(10);
		box.getArea();
		box.getWidth();
		System.out.println(box);
		
		Rectangle rectangle = new Rectangle(3,4);
		rectangle.getArea();
		rectangle.getWidth();
		System.out.println(rectangle);
		
		Circle circle = new Circle(3);
		circle.getArea();
		circle.getWidth();
		System.out.println(circle);
		
		Triangle triangle = new Triangle(new float[] {1,4,5}, (float) 2);
		triangle.getArea();
		triangle.getWidth();
		System.out.println(triangle);

	}

}
