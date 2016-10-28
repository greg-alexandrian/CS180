
public class Square {
	private double sideLength;
	
	public Square(double initialSize){
		//sideLength = initialSize;
		this.setLength(initialSize);
	}
	/*
	 * setting  length of the square to proper value. Printing error message otherwise.
	 */
	public void setLength(double length){
		if(length > 0){
			sideLength = length;
		}else{
			sideLength = 0;
			System.out.println("Sorry cannot do that because the length should be positive");
		}
	}
	public double getPerimeter(){
		return 4*sideLength;
	}
	public double getArea(){
		return sideLength*sideLength;
	}
	public void printInfo(){
		System.out.printf("Side:%.2f\nPerimeter:%.2f\nArea:%.2f\n", sideLength, getPerimeter(), getArea());
	}
}
