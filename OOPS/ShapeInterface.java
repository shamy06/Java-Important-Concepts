interface shape{
	double getArea();
	double getPerimeter();
}
class Circle implements shape{
	
	private double radius;
	
	public Circle(double radius) {this.radius=radius;}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
}

public class ShapeInterface{
	public static void main(String args[]) {
		Circle circle = new Circle(5.0);
		System.out.println("Area of circle is "+ circle.getArea());
		System.out.println("Perimeter of circle is "+ circle.getPerimeter());
	}
}