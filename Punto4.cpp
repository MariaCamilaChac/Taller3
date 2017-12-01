#include <vector>
#include <string>
#include <sstream>
#include <iostream>

 using namespace std;

 int main(){

	 	int x;
	  	string Cadena;
	    vector<int> vect;
	    cout <<"ingrese el tamano del arreglo: " << endl;
	    cin >> x;
	    int matriz[x*x];
	    int matriz2[100][100];
	    int tamain = (sizeof matriz/sizeof * matriz);
	    cout << "Tamano es " << tamain << endl;
	    cout << "Digite los numeros separado por comas: \n";
	    cin >> Cadena;
	    stringstream Separated(Cadena);

	    int i;

	    while (Separated >> i){
	         	 vect.push_back(i);
	         if (Separated.peek() == ',')
	        	 Separated.ignore();
	    }

	    int T = vect.size();
	    cout << "Tamaño del vector " << T << endl;

	    for (i=0; i< T; i++){

	     	matriz[i] = vect.at(i);

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

	    for (int i = 0; i < x; i++) {
	    	    	for (int j = 0; j < x; j++) {
	    	    		cout << "["<<matriz2[j][i]<<"]";

	    	    			}

	    	    	cout<<endl;

	    	    	}

	    system("PAUSE");
	    return 0;

 }

