
public class DistanceCalculator 
{
	private DistanceCalculator()
	{
		
		
	}//end empty argument constructor
	

	public static double calculateDistance(int x, int y, int a, int b) 
	{
		
		double side1=x-a;
		double side2=y-b;
		double distance=Math.sqrt(Math.pow(side1, 2)+ Math.pow(side2, 2));
		return distance;
			
			
		}//end calculateDistance
		


}
