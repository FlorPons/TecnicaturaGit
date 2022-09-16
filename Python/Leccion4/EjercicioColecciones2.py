# Ejercicio 2: Operaciones de conjuntos con listas
# Escribe un programa que tenga 2 listas y que a continuacion
# cree las siguientes listas (en las que no debe haber repeticion)
# 1 Lista de palabras que aparecen en las listas
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aparecen en ambas listas

#Creamos las listas

lista1 = ['Juan', 'caramenlo', 'Lucas', 'camion', 'mesa','carrera']
lista2 = ['Lorena', 'Camila', 'Juan', 'vaca', 'casa', 'mesa', 'Lucas']

# Eliminar los elementos repetidos de ambas listas con conjuntos

conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1| conjunto2) #Unimos los dos conjuntos
solo1 = list(conjunto1 - conjunto2)#Solo muestra el conjunto2
solo2 = list(conjunto2 - conjunto1) #Solo muestra el conjunto2
interseccion = list(conjunto1 & conjunto2) #Mostramos ambas listas

print(f'Lista de palabras que aparecen  en las listas: {union}')
print(f'Lista de palabras que aparecen en la primera lista, pero no en la segunda:{solo1}')
print(f'Lista de palabras que aparecen en la segunda lista, pero no en la primera:{solo2}')
print(f'Lista de palabras que aparecen en ambas listas:{interseccion}')
