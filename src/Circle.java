public class Circle {

	double radius = 1.0;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (Math.PI * radius) * (Math.PI * radius);
	}

	public double getCircomference() {
		return 2.0 * Math.PI * radius;
	}

	public String toString() {
		return "Circke[radius " + radius + " ]";
	}

}
