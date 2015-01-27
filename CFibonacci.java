/**
 * Descripción: Clase contenedora del método para la realizacion
 * 				la sucesión de finbonacci
 * Fecha: 		27/01/2015
 */
public class CFibonacci
{
	public static int fibonacci(int numero)
	{
		if ( numero == 0 )
			return 0;
		else if ( numero == 1 )
			return 1;
		else
		{
			return CFibonacci.fibonacci(numero - 1) + fibonacci( numero - 2 );
		}

	}
}