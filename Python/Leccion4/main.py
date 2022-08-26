# lista = Ariel, Liliana, Natalia, Osvaldo.

nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])
print(nombres[0:2]) #Solo muestra el [indice 0, 1 pero no el indice 2
# Ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3]) #Indices a mostrar 0, 1, 2
#Desde el indice indicado hasta el final
print(nombres[1: ])
# Modificamos un valor
nombres[2] = "Liliana"
nombres[0] = "Natalia"
print(nombres)
# Iterar una lista
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

    #Preguntamos cuantos elementos tiene
    print(len(nombres)) # Pasamos como parametro la lista

    #Agregamos un lemento
    nombres.append("Marcelo")
    print(nombres)

    #Insertar un elemento en un indice espec[ifico
    nombres.insert(1, "Alberto")
    print(nombres)
    nombres.insert(3, "Debora")
    print(nombres)

    #Eliminamos un elemento
    nombres.remove("Alberto")
    print(nombres)

    #Eliminamos el ultimo elemento
    nombres.pop()
    print(nombres)

    #Eliminamos un indice especifico
    del nombres[2] # del significa delete (eliminar)
    print(nombres)

    #Eliminar, borrar o limpiar todos los elementos
    nombres.clear()
    print(nombres)

    #Eliminar la lista
    del nombres
   # print(nombres) #Aqui nos mostrara un error

    # Definimos una tupla
    cocina = ('cuchara', 'cuchillo', 'tenedor')
    print(cocina)
print(len(cocina))

#Acceder a un elemento, para esto utilixamos corchetes no parentesis
print(cocina[0])
#Mostrar la manera inversa
print(cocina[-1])

#Acceder a un rango
print(cocina[0:2])
#Ejemplo
verduras = ('papa, ') # Una tupla necesita tener aunque sea un elemento: la coma
#de lo contrario solo seria un tipo str cadena

#Recorremos los elementos de la tupla
for cocinar in cocina:#Print esta usando \n para saltos de linea
    print(cocinar, end =' ') #Usamos end= para eliminar los asaltos de linea

#cocina[0] = 'plato' #No se permiten cambios. Debemos pasarlo a lista

cocinaLista = list(cocina)
cocinaLista[0] = 'plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

#del cocina #es para eliminar una tupla