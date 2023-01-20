package Actividad;

public class Circulo 
{

	public float radio;
	
	public Circulo(float id)
	{
		radio = id;
	}
	public double getCircunference() 
	{
		return radio*2*Math.PI;
	}
	public double getArea() 
	{
		return Math.PI*Math.pow(radio, 2);
	}
}
