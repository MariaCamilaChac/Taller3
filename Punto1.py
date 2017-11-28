import random

import end as end

matriz = []

filas = int(input("Tamano del arreglo: \n"))  ##write the length of array
columnas = filas

for f in range(0, filas):
 matriz.append([0] * columnas)  ##create the matrix using list

for f in range(0, filas):
 for c in range(0, filas):
     matriz[f][c] = random.randint(1, 9)  ##create the matrix with random numbers
print()

for f in matriz:
    for c in f:
      print(c, end)
      print("")
    print()
    mt = (filas // 2)

 if filas % 2 != 0:  ##create de conditional for pair number for the length

      for f in range(0, filas):
         for c in range(0, filas):
           if f + c >= mt and f + mt >= c and c + mt >= f and f + c <= mt + filas - 1:  ##create the conditional for create diagonals
            print [matriz[f][c], end]
           else:
            matriz[f][c] = " "  ##new matrix for print empty when the conditional be false
            print(matriz[f][c], end)
            print("")
else:  ##create de conditional for pair number for the length
     for f in range(0, filas):
        for c in range(0, filas):
          if  f + c >= mt - 1 and f + mt >= c and c + mt >= f and f + c <= mt + filas - 1:  ##create the conditional for create diagonals
           print(matriz[f][c], end)
          else:
            matriz[f][c] = " "  ##new matrix for print empty when the conditional be false
            print(matriz[f][c], end)
            print("")