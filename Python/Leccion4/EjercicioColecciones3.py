# Ejercicio 3: Agregar personajes a una lista
# Escribe un programa donde cree una lista con los siguientes personajes del Señor de los Anillos
# Nombre: Aragon
# Clase: Guerrero
# Raza: Dunadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

personajes = [] #Creamos una lista vacia

#Creamos diccionarios
P ={'Nombre':'Aragon','Clase':'Guerrero','Raza':'Dunadan del norte'}
personajes.append(P)  #Agregamos a la lista un personaje
P ={'Nombre':'Gandalf','Clase':'Mago','Raza':'Instar'}
personajes.append(P)
P ={'Nombre':'Legolas','Clase':'Arquero','Raza':'Elfo Sindar'}
personajes.append(P)
P ={'Nombre':'Galadriel','Clase':'Guardia del Bosque Dorado','Raza':'Elfo Noldor'}
personajes.append(P)
P ={'Nombre':'Arwen','Clase':'Reina Consorte','Raza':'Peredhil'}
personajes.append(P)
P ={'Nombre':'Eowyn','Clase':'Noble','Raza':'Hombre'}
personajes.append(P)
print(personajes)