""" created on 28 nov. 2017
@author: CamilaCh
version: 1"""

import random  # import library

matriz = []

filas = int(input("Length of array: \n"))   # write the length of array
columnas = filas

for f in range(0, filas):
    matriz.append([0] * columnas)  # create the matrix using list

for f in range(0, filas):
    for c in range(0, filas):
        matriz[f][c] = random.randint(1, 9)  # create the matrix with random numbers
    #print()

for f in matriz:
    for c in f:
        print(c, end="")
    print("")
print()
 
mt = (filas // 2)

if filas % 2 != 0:

    for f in range(0, filas):
        for c in range(0, filas):
            if (f + c >= (mt) and f + (mt) >= c and c + (mt) >= f and f + c <= (mt) + filas - 1):  # create the conditional for create diagonals
                print(matriz[f][c],end="")
            else:
                matriz[f][c] = " "
                print(matriz[f][c],end="")  # new matrix for print empty when the conditional be false
        print("")
else:  ##create de conditional for no pair number for the length
    for f in range(0, filas):
        for c in range(0, filas):
            if (f + c >= (mt) - 1 and f + (mt) >= c and c + (mt) >= f and f + c <= (mt) + filas - 1):  # create the conditional for diagonals
                print(matriz[f][c],end="")
            else:
                matriz[f][c] = " "   ##new matrix for print empty when the conditional be false
                print(matriz[f][c],end="")
        print("")