#include <vector>
#include <string>
#include <sstream>
#include <iostream>

 /**Param:array
 * Author: Maria Camila CHacon
 * Date:27/11/2017
 */


 using namespace std;

 int main(){

	 	int x;
	  	string Cadena;
	    vector<int> vect;  // call the functio vector
	    cout <<"ingrese el tamano del arreglo: " << endl; // ask the length
	    cin >> x;
	    int matriz[x*x];  
	    int matriz2[100][100];  
	    int tamain = (sizeof matriz/sizeof * matriz); //The number of elements contained in the array object.
	    cout << "Tamano es " << tamain << endl;
	    cout << "Digite los numeros separado por comas: \n";
	    cin >> Cadena;
	    stringstream Separated(Cadena); //  this library allows any type of data, even if they are mixed 

	    int i;

	    while (Separated >> i){
	         	 vect.push_back(i); // Value to be copied (or moved) to the new element.
	         if (Separated.peek() == ',') //Returns the next character in the input sequence, without extracting it
	        	 Separated.ignore(); //Extracts characters from the input sequence and discards them
	    }

	    int T = vect.size(); // tamain of the new vector
	    cout << "Tamaño del vector " << T << endl; 

	    for (i=0; i< T; i++){  

	     	matriz[i] = vect.at(i); // assign the new chay in array without comas/The element at the specified position in the container.

	    }

	    cout<<endl;
	    int c = 0;
	    do{
	    for (int i = 0; i < x; i++){

			for (int j = 0; j < x ; j++) {

				matriz2[i][j] = matriz[c];
				c++;
			}

		}

	  }while(c<tamain);

	    for (int i = 0; i < x; i++) {
	    	for (int j = 0; j < x; j++) {
	    		cout << "["<<matriz2[i][j]<<"]";

	    			}

	    	cout<<endl;

	    	}

	    cout << endl;
	 
	 // Print the matrix with its ends changed

	    for (int i = 0; i < x; i++) {
	    	    	for (int j = 0; j < x; j++) {
	    	    		cout << "["<<matriz2[j][i]<<"]"; 

	    	    			}

	    	    	cout<<endl;

	    	    	}

	    system("PAUSE");
	    return 0;

 }

