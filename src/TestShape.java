public class TestShape {
	public static void main(String[] args) {
		Shape[] myShapes = new Shape[3];
		myShapes[0] = new Triangle(2.0, 3.0);
		myShapes[1] = new Rectangle(2.0, 4.0);
		myShapes[1] = new Circle(10.0);
		for(int i = 0; i < myShapes.length; i++){
			System.out.println(myShapes[i]);
		}//end of for loop
	}//end of main method
}//end of TestShape