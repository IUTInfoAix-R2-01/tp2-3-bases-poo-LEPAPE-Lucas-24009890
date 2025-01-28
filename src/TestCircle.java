
public class TestCircle {
	public static void main(String[] args) {
		Circle cercle1 = new Circle();
		System.out.println(cercle1.getRadius());
		System.out.println(cercle1.getArea());
		System.out.println(cercle1.getColor());
		cercle1.setColor("blue");
		System.out.println(cercle1.getColor());
		System.out.println(cercle1.toString());
	}
}
