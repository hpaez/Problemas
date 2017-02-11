import java.util.Scanner;

public class C2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		int numMatrices = sc.nextInt();
		
		// 1.- Leer tantas matrices desde el teclado como sea necesario.
		while(numMatrices > 0)
		{		
			// 2.- Leer las dimensiones de la matriz a procesar.
			int numFilas = sc.nextInt();
			int numCols  = sc.nextInt();
			
			int[][] matDatos = new int[numCols][numFilas];		
			
			// 3.- Generar la transposición en la matriz.
			for(int fil=0; fil < numFilas; fil++)
				for(int col=0; col < numCols; col++)
				{
					matDatos[col][fil] = sc.nextInt();
				}
				
			// 4.- Imprimir la matriz transpuesta de la original en pantalla.
			for(int fil=0; fil < numFilas; fil++)
			{
				for(int col=0; col < numCols; col++)
				{
					System.out.print( matDatos[col][fil] + " " );
				}
				System.out.println();
			}
			System.out.println();
			
			numMatrices--;
		}
	}
}