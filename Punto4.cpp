#include<iostream>
#include <string>
#include <sstream>

using namespace std;

string NumberToString(int Number)
{
 ostringstream oOStrStream;
 oOStrStream << Number;
 return oOStrStream.str();
}

int main (int argc, char* argv[]){ //the statements that we going to use

int m = 0 ;
cout << "ingrese el tamaño de la matriz: ";
cin >> m ;
int matriz [m][m]; 
int matrix [m][m];

	for (int i=0;i<m;i++){  //iteration for create the array
		for(int j=0;j<m;j++){
		cout << "ingrese el dato, recuerde separar por comas: ";
		cin >> matriz[i][j];
		}
	}
	
	string vacio;
	
	for (int i=0;i<m ;i++){ //print the matrix 
		vacio = "";
		for (int j= 0 ;j<m ;j++){
			vacio = vacio + "[" + NumberToString(matriz[i][j])+ "]"; //call the function
		}
		cout << vacio + "\n";	
	}
	
	for (int i=0;i<m;i++){
		for(int j=0;j<m;j++){
	    	matrix [j][i]=matriz[j][i]; // fill the new matrix with the values of the old
		}
	}
	
	cout << "\n\n Matrix : \n\n";
	
	for (int i=0;i<m ;i++){
		vacio = "";
		for (int j= 0 ;j<m ;j++){
			vacio = vacio + "[" + NumberToString(matrix[j][i])+ "]"; //print the matrix with cross values
		}
		cout << vacio + "\n";	
	}
}


