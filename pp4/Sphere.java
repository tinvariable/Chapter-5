package pp4;
import java.text.DecimalFormat;

public class Sphere 
{
	double diameter;
	double d;
	double radius;
	double volume;
	double surface;
	DecimalFormat df = new DecimalFormat("0.###");
	
	public Sphere(double d) 
	{
		diameter = d;
	}
	public double getDiameter()
	{
		
		return diameter;
	}
	public void setDiameter()
	{
		diameter = d;
		
	}
	public double radius()
	{
		radius = diameter/2;
		return radius;
	}
	public double volume()
	{
		volume = 4/3*Math.PI*Math.pow(radius, 3);
		return volume;
	}
	public double surfaceArea()
	{
		surface = 4*Math.PI*Math.pow(radius, 2);
		df.format(surface);
		return surface;
		
	}
	

	


}
