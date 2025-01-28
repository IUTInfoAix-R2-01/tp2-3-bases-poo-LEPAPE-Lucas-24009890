
public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}
	
	public Rectangle(float l, float w) {
		length = l;
		width = w;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float getArea() {
		return length*width;
	}
	
	public float getPerimeter() {
		return 2*(length+width);
	}
	
	public void setLength(float l) {
		length = l;
	}
	
	public void setWidth(float w) {
		width = w;
	}
	
	public String toString() {
		return "Rectangle[lenght=" + length + " width =" + width + "]";
	}
	
}