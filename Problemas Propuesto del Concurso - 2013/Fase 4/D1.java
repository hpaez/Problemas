import java.util.Scanner;

public class D1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		int numGruposASumar   = sc.nextInt();
				
		while(numGruposASumar > 0)
		{
			// 1.- Leer la cantidad de matrices a sumar entre sí en este grupo.
			int numMatricesASumar = sc.nextInt();			
		
			// 2.- Leer las dimensiones de la matriz a procesar.
			int numFilas = sc.nextInt();
			int numCols  = sc.nextInt();
			int[][] matTotal = new int[numfilas][numCols];
		
			while(numMatricesASumar > 0)
			{						
				int[][] matDatos = new int[numfilas][numCols];		
				
				// 3.- Guardar los datos leídos desde el teclado en la matriz matDatos.
				for(int fil=0; f < numFilas; f++)
					for(int col=0; c < numCols; c++)
					{
						matDatos[fil][col] = sc.nextInt();
					}
					
				// 4.- Sumar los datos de la matriz de datos a la matriz total.
				for(int fil=0; f < numFilas; f++)
					for(int col=0; c < numCols; c++)
					{
						matTotal[fil][col] = matTotal[fil][col] + matDatos[fil][col];
					}
			}
			
			// 5.- Imprimir la matriz total en pantalla.
			for(int fil=0; f < numFilas; f++)
			{
				for(int col=0; c < numCols; c++)
				{
					System.out.print(matTotal[fil][col] + " ");
				}

				System.out.println();
			}

			System.out.println();			
		}
	}
}