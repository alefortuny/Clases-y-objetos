package Actividad;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba 'cuadrado' o 'circulo' dependiendo de la figura que desee crear");
		String cuadradoOCirculo = scan.nextLine();
		if (cuadradoOCirculo.contains("cuadrado"))
		{
			System.out.println("Introduzca la longitud del lado");
			float lado = scan.nextFloat();
			Cuadrado uno = new Cuadrado();
			uno.longitud = lado;
			System.out.println("Escriba 'diagonal', 'perimetro' o 'area' dependiendo de lo que desee obtener");
			scan.nextLine();
			String valorAObtener = scan.nextLine();
			if(valorAObtener.contains("diagonal"))
			{
				System.out.println("La diagonal es: " + uno.getDiagonal());
			}
			else if(valorAObtener.contains("perímetro"))
			{
				System.out.println("El perímetro es: " + uno.getPerimeter());
			}
			else if(valorAObtener.contains("area"))
			{
				System.out.println("El área es: " + uno.getArea());
			}
		}
		else if(cuadradoOCirculo.contains("circulo"))
		{
			System.out.println("Introduzca la longitud del radio");
			float rad = scan.nextFloat();
			Circulo first = new Circulo();
			first.radio = rad;
			System.out.println("Escriba 'circunferencia' o 'area' dependiendo de lo que desee obtener");
			scan.nextLine();
			String valorAObtener = scan.nextLine();
			if(valorAObtener.contains("circunferencia"))
			{
				System.out.println("El perímetro es: " + first.getCircunference());
			}
			else if(valorAObtener.contains("area"))
			{
				System.out.println("El área es: " + first.getArea());
			}
		}
		scan.close();
	}
}
