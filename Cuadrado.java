package Actividad;

public class Cuadrado 
{

	public float longitud;
	
	public Cuadrado(float id)
	{
		longitud = id;
	}
	public double getDiagonal()
	{
		return Math.sqrt(2*Math.pow(longitud, 2));
	}
	public double getArea()
	{
		return Math.pow(longitud, 2);
	}
	public float getPerimeter()
	{
		return longitud*4;
	}
}
