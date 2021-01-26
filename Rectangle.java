
public class Rectangle 
{
	private int length;
	private int width;
	
	public Rectangle()
	    {
	        length=1;
	        width=1;
	    }
	public Rectangle(int l, int w)
	    {
	        length=l;
	        width=w;
	    }
	public int getLength()
	    {
	        return length;
	    }
	public int getWidth()
	    {
	        return width;
	    }
	public int calculateArea(int l, int w)
	    {
	        int area=l*w;
	        return area;
	    }
	public int calculatePerimeter(int l, int w)
	    {
	        int perimeter=(2*l)+(2*w);
	        return perimeter;
	    }
	   
	    
}	


