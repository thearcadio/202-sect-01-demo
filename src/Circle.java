public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}//end of constructor

	public double getRadius() {
		return radius;
	}//end of getRadius()

	public void setRadius(double radius) {
		this.radius = radius;
	}//end of setRadius(double radius)
	
	public double area(){
		return Math.PI * this.radius * this.radius;
	}//end of area
}//end of class Circle