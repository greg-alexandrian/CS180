
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle mySquare = new Square(5);
		System.out.println(mySquare.getArea());
		//mySquare.setWidth(20);
		System.out.println(mySquare.getArea());
		System.out.println(mySquare.getClass().getName());
	}
}
