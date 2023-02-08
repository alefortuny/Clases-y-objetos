package exam;

public class Examen 
{
	public String exam;
	
	public Examen(String exam)
	{
		this.exam = exam;
	}
	
	public String primeraMayuscula()
	{
		String primeraLetra = exam.substring(0,1);
		primeraLetra = primeraLetra.toUpperCase();
		String mayuscula = primeraLetra + exam.substring(1,exam.length());
		return mayuscula;
	}
	
	public String invertirCadena()
	{
		String invertida = "";
		String[] invertir = exam.split("");
		for (int i = invertir.length - 1; i >= 0; i--) 
		{
			invertida = invertida + invertir[i];
			if (i > 0) 
			{
		    invertida = invertida + "";
			}
		}
		return invertida;
	}
	
	public String vocalesMayuscula()
	{
		String vocalesMayusculas = "";
		for (int i = 0; i < exam.length(); i++) 
		{
		      char vocal = exam.charAt(i);
		      if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') 
		      {
		        vocal = Character.toUpperCase(vocal);
		      }
		      vocalesMayusculas = vocalesMayusculas + vocal;
		 }
		return vocalesMayusculas;
	}
	
	public void fizzBuzz()
	{
		for(int i = 1; i <= 100; i++)
		{
			if (i % 3 == 0 && i % 5 == 0) 
			{
		        System.out.println("FizzBuzz");
		    } 
			else if (i % 3 == 0) 
			{
				System.out.println("Fizz");
		    } 
			else if (i % 5 == 0) 
			{
		        System.out.println("Buzz");
		    } 
			else 
			{
		        System.out.println(i);
		    }
		}
	}
	
	public Boolean palindromo()
	{
		Boolean esPalindromo = true;
		String fraseSinEspacios = exam.replace(" ", "");
		System.out.println(fraseSinEspacios);
		int longitudDeArreglo = fraseSinEspacios.length();
		for (int i = 0; i < longitudDeArreglo / 2; i++) 
		{
			if (fraseSinEspacios.charAt(i) != fraseSinEspacios.charAt(longitudDeArreglo - i - 1))
			{
				esPalindromo = false;
		        break;
			}
		}
		return esPalindromo;
	}
	
}
