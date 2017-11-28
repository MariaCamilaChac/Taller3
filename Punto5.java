
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Punto5 {

		
	public static void cargarArray(String array[][], String [] Num2 ) {
		int mas=0;
		while (mas < Num2.length){
		
		for (int fil = 0; fil < array.length; fil++) {
	    	for (int col = 0; col < array.length; col++) {
	    		
	    		array[fil][col] = Num2[mas];
	    		System.out.print("["+ array[fil][col]+"]");
	    		mas++;
	    	 }
	   	System.out.println("");
		    }
		
		}
	}
		
	public static void ImprimirRombo(String[][] array, int T){
		
		if (T%2==0	) {
			
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length ; j++) {
				
				if ((i+j <= (T/2)-1) || (i+(T/2) <= j) || (j+(T/2) <= i) || (i+j >= (T/2)+T-1) ) {
					
					System.out.print("["+ array[i][j]+"]");
					
				}
				else { 
					String vacio [][]= new String [T][T];
					vacio[i][j]=("   ");
					System.out.print(vacio[i][j]);
					
				}
				
			}
			System.out.println("");
		}
	}
		else {
			for (int j = 0; j < array.length; j++) {
				for (int j2 = 0; j2 < array.length; j2++) {	
					if ((j+j2 <= (T/2)) || (j+(T/2) <= j2) || (j2+(T/2) <= j) || (j+j2 >= (T/2)+T-1) ){
						System.out.print("["+ array[j][j2]+"]");
					}
					else { 
						String vacio [][]= new String [T][T];
						vacio[j][j2]=("   ");
						System.out.print(vacio[j][j2]);

						
					}
				}
				System.out.println("");
			}
			
		}
	}
	
	public static void main(String[] args) throws  IOException {
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		bw.write("Digite tamaño del arreglo");
		bw.flush();
		int T = Integer.parseInt(br.readLine());


		bw.write("Escriba los numeros del arreglo, tenga en cuenta que será el doble"
				+ " del numero del tamaño del arreglo es decir"+T*T +"\n");
		bw.flush();
		String Num1 = br.readLine();
		String [] Num2 = Num1.split(",");
		String [][] Array = new String [T][T]; 

		Punto5.cargarArray(Array,Num2);
	
		System.out.println("\n");
		Punto5.ImprimirRombo(Array, T);
	}
}
