#include<iostream>
#include <string>
#include <stdlib.h>
#include <sstream>

using namespace std;

string NumberToString(int pNumber) //function to change number to string
{
 stringstream SS;
 SS << pNumber;
 return SS.str();
}

int main(int argc, char* argv[]){ 
int m = 0 ;
int nPar = 0 ;
int nImpar = 0;
int nPos = 0;
int nNeg = 0 ;

string x, cPar, cImpar, cPos, cNeg;

cout << "ingrese las dimenciones de la Matriz: ";// the length for the matrix
cin >> m ;
int matriz [m][m];
cout <<"los numeros aleatorios son: \n\n";


	for (int i= 0 ;i<m ;i++){  // fill all the msytrix with random numbers
		for (int j= 0 ;j<m ;j++){
			matriz[i][j] = rand()% 200 - 100;
		}
	}
	
	for (int i=0;i<m ;i++){  //print the matrix
		x = "";
		for (int j= 0 ;j<m ;j++){
			x = x + "[" + NumberToString(matriz[i][j])+ "]";
		}
		cout << x + "\n";	
	}
		
	
// create the iteration and define the conditional for each case	
	for(int i = 0;i<m;i++){ 
		for(int j = 0; j<m;j++){
			if(matriz[i][j]%2 == 0){
				nPar++;
				cPar = cPar + NumberToString(matriz[i][j]) + ",";
			}
			else if (matriz[i][j]%2 != 0){
				nImpar ++ ;
				cImpar = cImpar+ NumberToString(matriz[i][j]) + ",";	
			}
			if(matriz[i][j]< 0 ){
				nNeg ++;
				cNeg = cNeg + NumberToString(matriz[i][j]) + ",";
			}
			else if(matriz[i][j]>= 0){
				nPos++;
				cPos = cPos + NumberToString(matriz[i][j]) + ",";			
			}
		}
	}
	
	// print all conditionals 
	
	cout <<"\n\nla cantidad de numeros pares es: " + NumberToString(nPar )+ "\n\n";
	cout <<"la cantidad de numeros impares es: " + NumberToString(nImpar) + "\n\n";
	cout <<"la cantidad de numeros negativos es: " + NumberToString(nNeg) + "\n\n";
	cout <<"la cantidad de numeros positivos es: " + NumberToString(nPos) + "\n\n";
	cout <<"los numeros pares son: "+ cPar + "\n\n";
	cout <<"los numeros impares son:" + cImpar + "\n\n";
	cout <<"los numeros negativos son:" + cNeg + "\n\n";
	cout <<"los numeros positivos son:" + cPos + "\n\n";
	
}

