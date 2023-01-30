package Actividad;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Opciones:");
			System.out.println("");
			System.out.println("1. Crear cuadrado");
			System.out.println("2. Crear círculo");
			System.out.println("3. Salir");
			System.out.println("");
			System.out.println("Ingrese el número correspondiente a lo que desee hacer");
			int elección = Integer.parseInt(scan.nextLine());
			System.out.println("");
			if(elección == 1)
			{
				System.out.println("Introduzca la longitud del lado");
				float lado = Float.parseFloat(scan.nextLine());
				Cuadrado square = new Cuadrado(lado);
				while(true)
				{
					System.out.println("Acciones:");
					System.out.println("");
					System.out.println("1. Obtener diagonal");
					System.out.println("2. Obtener perímetro");
					System.out.println("3. Obtener área");
					System.out.println("4. Menú principal");
					System.out.println("5. Salir");
					System.out.println("");
					System.out.println("Ingrese el número correspondiente a la acción que desea realizar");
					int acción = Integer.parseInt(scan.nextLine());
					System.out.println("");
					if(acción == 4)
					{
						break;
					}
					else
					{
						switch(acción)
						{
						case 1:
						System.out.println("La diagonal es: " + square.getDiagonal());
						System.out.println("");
						break;
						case 2:
						System.out.println("El perímetro es: " + square.getPerimeter());
						System.out.println("");
						break;
						case 3:
						System.out.println("El área es: " + square.getArea());
						System.out.println("");
						break;
						case 5:
						System.exit(0);
						break;
						}
					}
				}
			}
			else if(elección == 2)
			{
				System.out.println("Introduzca la longitud del radio");
				float radio = Float.parseFloat(scan.nextLine());
				Circulo circle = new Circulo(radio);
				while(true)
				{
					System.out.println("Acciones:");
					System.out.println("1. Obtener circunferencia");
					System.out.println("2. Obtener área");
					System.out.println("3. Menú principal");
					System.out.println("4. Salir");
					System.out.println("Ingrese el número correspondiente a la acción que desea realizar");
					int acción = Integer.parseInt(scan.nextLine());
					System.out.println("");
					if(acción == 3)
					{
						break;
					}
					else
					{
						switch(acción)
						{
						case 1:
						System.out.println("El perímetro es: " + circle.getCircunference());
						System.out.println("");
						break;
						case 2:
						System.out.println("El área es: " + circle.getArea());
						System.out.println("");
						break;
						case 4:
						System.exit(0);
						break;
						}
					}
				}
			}
			else if(elección == 3)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Entrada inválida");
			}
		}
	}
}
