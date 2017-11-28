import java.io.*;

public class Punto2 {
	
	public static int[][] cargarArray(int array[][], int minRandom, int maxRandom) {
	    for (int fil = 0; fil < array.length; fil++) {
	        for (int col = 0; col < array[fil].length; col++) {
	            array[fil][col] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
	        }
	    }
		return array;
	}
	public static void imprimeArray(int array[][]){
		for (int fil = 0; fil < array.length; fil++) {
			System.out.println("");
		        for (int col = 0; col < array[fil].length; col++) {
	                System.out.print("[" + array[fil][col] + "]");
		            }
		        }
		    }
	
	public static void RecorrerArray( int array[][]){
		int x = 0; //Para manejar las filas
	      int y = 0; //Para manejar las columnas
	      int flag = 0;  //Bandera para saber que recorrido se debe realizar
	      int n = 0;
	      int elementos=array.length*array.length;
		  while (n < elementos) {
		        
		         switch (flag) {
		         case 0: // Recorrido de izquierda a derecha
		            for (int m = x; m < array[0].length - y; m++) {
		               System.out.print(" " + array[x][m]);
		               n++;
		            }
		            flag++;
		            break;
		 
		         case 1: //Recorrido de arriba abajo
		            for (int m = x + 1; m < array.length - x; m++) {
		               System.out.print(" " + array[m][array[0].length - 1 - y]);
		               n++;
		            }
		            flag++;
		            break;
		 
		         case 2: //Recorrido de derecha a izquierda
		            for (int m = array[0].length - 2 - y; m >= y; m--) {
		               System.out.print(" " + array[array.length - 1 - x][m]);
		               n++;
		            }
		            flag++;
		            break;
		 
		         case 3: //Recorrido de abajo a arriba
		            for (int m = array.length - 2 - x; m >= x + 1; m--) {
		               System.out.print(" " + array[m][y]);
		               n++;
		            }
		            flag = 0;
		            //Se aumentan las filas y las columnas para un subnivel en el espiral
		            x++;
		            y++;
		            break;
		         } 
		 
		  }
	}
		 
	

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
			
		
		bw.write("ingrese el tamaño de la matriz");
		bw.flush();
		int Tamaño=Integer.parseInt(br.readLine() );
		
		int [][] Array = new int [Tamaño][Tamaño];
		
		Punto2.cargarArray(Array, 0, 100);
		Punto2.imprimeArray(Array);
		bw.write("\n"+"Espiral");
		bw.flush();
		Punto2.RecorrerArray(Array);
	
	
		
	}

}
