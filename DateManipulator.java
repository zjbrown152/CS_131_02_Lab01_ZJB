
public class DateManipulator
{
	
	public DateManipulator() 
	{
		
		
	}//end constructor
	
	public boolean isLeapYear(int year) 
	{
		while(year<1582)
		{
			return false;
			
		
		}
		if(year%4==0&&year%100!=0)
		{
			return true;
		}
		if(year%400==0)
		{
			return true;
		}
		return false;


			
		
		
				
			
	}//end isLeapYear
	

}
