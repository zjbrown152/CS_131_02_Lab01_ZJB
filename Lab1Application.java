
public class Lab1Application {

	public static void main(String[] args) 
	{
		//Question 1 application
		Rectangle aRectangle= new Rectangle(4,4);
		int area=aRectangle.calculateArea(10,10);
		int perimeter=aRectangle.calculatePerimeter(10, 10);
		System.out.println("The area is "+area+" and the perimeter is "+perimeter);
		
		
		//Question 2 application
		double distance=DistanceCalculator.calculateDistance(4, 7, 3, 9);
		System.out.println("The distance is between the points is "+distance);
		
		//Question 3 application
		int x=4;
		int y=3;
		int add=BasicMath.add(x, y);
		int sub=BasicMath.subtract(x, y);
		int prod=BasicMath.multiply(x, y);
		double quo=BasicMath.divide(x, y);
		BasicMath.add(x, y);
		System.out.println("Sum is "+add+". Difference is "+sub+". Product is "+prod+". Quotient is "+quo);
		
		
		//Question 4 
		DateManipulator year=new DateManipulator();
		boolean result=year.isLeapYear(1900);
		boolean t=year.isLeapYear(1600);
		System.out.println(result+" "+t);
		
		
		
		
	}

}
