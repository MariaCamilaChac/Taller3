/**Param:Matrix
 * Author: Maria Camila CHacon
 * Date:27/11/2017
 */

import java.io.*;

public class Punto2 {
	
	public static int[][] cargarArray(int array[][], int minRandom, int maxRandom) { //Function for load up the matrix 
	    for (int fil = 0; fil < array.length; fil++) {
	        for (int col = 0; col < array[fil].length; col++) {
	            array[fil][col] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom))); // assign random numbers
	        }
	    }
		return array;
	}
	public static void imprimeArray(int array[][]){ //Function for print the matrix
		for (int fil = 0; fil < array.length; fil++) {
			System.out.println("");
		        for (int col = 0; col < array[fil].length; col++) {
	                System.out.print("[" + array[fil][col] + "]");
		            }
		        }
		    }
	
	public static void RecorrerArray( int array[][]){
		int x = 0; //For monitor the lines
	      int y = 0; //For monitor the columns
	      int flag = 0;  //flag for know what round need to do 
	      int n = 0;
	      int elementos=array.length*array.length;
		  while (n < elementos) {
		        
		         switch (flag) {
		         case 0: // round from left to rigth
		            for (int m = x; m < array[0].length - y; m++) {
		               System.out.print(" " + array[x][m]);
		               n++;
		            }
		            flag++;
		            break;
		 
		         case 1: //round from top to bottom
		            for (int m = x + 1; m < array.length - x; m++) {
		               System.out.print(" " + array[m][array[0].length - 1 - y]);
		               n++;
		            }
		            flag++;
		            break;
		 
		         case 2: //round from right to left
		            for (int m = array[0].length - 2 - y; m >= y; m--) {
		               System.out.print(" " + array[array.length - 1 - x][m]);
		               n++;
		            }
		            flag++;
		            break;
		 
		         case 3: //round bottom up
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
		// Call the functions
		Punto2.cargarArray(Array, 0, 100);
		Punto2.imprimeArray(Array);
		bw.write("\n"+"Espiral");
		bw.flush();
		Punto2.RecorrerArray(Array);
	
	
		
	}

}
