public class Square extends Shape{
	// if you have a sublcass that extends an abstract class... you must do one of 2 things
	// 1) implement methods that are abstract
	// 2) make the class abstract also
	private double side;
	
	public Square(double side){
		this.side = side;
	}//end of constructor

	public double getSide() {
		return side;
	}// end of getSide()

	public void setSide(double side) {
		this.side = side;
	}//end of setSide(double side)
	
	public double area(){
		return this.side * this.side;
	}//end of area()
}//end of Square class