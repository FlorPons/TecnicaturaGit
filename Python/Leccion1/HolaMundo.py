"""
print("Hola Mundo")
miVariable = 3
print(miVariable)
miVariable = "Hola a todos en Python"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x+y
print(id(x))
# Las literales se escriben x336, la variable y = x080, la variable z = x400
print(id(y))
print(id(z))
# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 10.78
print(x)
print(type(x))
x = "Hola todos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "Evanescence "
caracteristicas = "The Best Rock Band"
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

#Tipos Booleanos (bool)
miBooleano = True
print(miBooleano)
miBooleano = 2>3
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# Función input
#resultado = input("Digite un numero:")  # Regresa un dato tipo String
#1print(resultado)

# Conversión de la entrada de datos
numero1 = int(input("Escribe el primer número: "))
numero2 = int(input("Escribe el segundo número: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)

operandoA = 8
operandoB = 5
suma = operandoA + operandoB
print("Resultado de la suma: ", suma)
print(f"El resultado de la suma es: {suma}")

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

multiplicación = operandoA * operandoB
print(f"El resultado de la multiplicación es: {multiplicación}")

división = operandoA / operandoB
print(f"El resultado de la división es: {división}")
división = operandoA // operandoB
print(f"El resultado de la división (int) es: {división}")

módulo = operandoA % operandoB
print(f"El residuo de la división o módulo es: {módulo}")
potenciación = operandoA ** operandoB
print(f"El resultado de la potenciación es: {potenciación}")
"""
"""
alto = int(input("Proporciona el alto del rectángulo: "))
ancho = int(input("Proporciona el ancho del rectángulo: "))
área = alto * ancho
perímetro = (alto + ancho) * 2
print("Área: ", área)
print("Perímetro: ", perímetro)
"""
"""
miVariable3 = 10
print(miVariable3)

#Operadores de reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

#miVariable3 = miVariable3 -2
miVariable3 -= 2
print(miVariable3)

#miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

#miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

#Operadores de Comparación
d = 4
b = 2
resultado = d == b #Comprobamos si son iguales
print(resultado)

#Operador diferente
resultado = d != b
print(resultado)

#Operador mayor que
resultado = d > b
print(resultado)

#Operador menor que
resultado = d < b
print(resultado)

#Operador menor o igual que
resultado = d <= b
print(resultado)

#Operador mayor o igual que
resultado = d >= d
print(resultado)
"""
"""
a = int(input("Digite un número: "))
print(f"El residuo de la división es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un número PAR")
else:
    print(f"El valor de a es: {a} es un número impar")
 """
"""
edadAdulto = 18
edadPersona = int(input("Digite su edad: "))

if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} es mayor de edad")
else:
    print(f"Su edad es : {edadPersona} es menor de edad")
"""
"""
#Operadores lógicos

#Operador and
a = False
b = True
resultado = a and b
print(resultado)

#Operador or
resultado = a or b
print(resultado)

#Operador not
resultado = not a
print(resultado)
"""
"""
#Ejercicio Valor dentro de un rango
valor = int(input("Digite un número dentro del rango 0 al 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f"El valor {valor} esta dentro del rango")
else:
    print(f"El valor {valor} no esta dentro del rango")
"""
"""
#Ejercicio con el operador or, Operador not
vacaciones = False
diaDescanso = True
if not (vacaciones or diaDescanso):
    print("Puede asistir al juego")
else:
    print("Tiene trabajo que hacer")
"""
"""
#Ejercicio = Rango entre 20 y 30 años
edad = int(input("Digite su edad: "))
#veinte = edad >= 20 and edad , 30
#print(veinte)
#treinta = edad >= 30 and edad < 40
#print(treinta)
#Sintaxis simplificada del operador and
#if veinte or treinta:
if (20 <= edad < 30) or (30 <= edad < 40):
    print("Estas dentro del rango de los (20`0) a (30`0) años")
#    if veinte:
#        print("Estas dentro del rango de los (20\`0) años")
#    elif treinta:
#        print("Estas dentro del rango de los (30\`0) años")
#    else:
#        print("No estas dentro del rango")
else:
    print("No estas dentro del rango de los (20`0) a (30`0) años")
"""
"""
#Ejercicio: El mayor de dos números
numero1 = int(input("Digite el valor para el número1: "))
numero2 = int(input("Digite el valor para el número2: "))

if numero1 > numero2:
    print("El número 1 es mayor ")
else:
    print("El número 2 es mayor ")
"""

#Ejercicio: Tienda de libros
print("Digite los siguientes datos del libro")
nombre = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar si el envío del libro es gratuito (True/False): ")
if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"
print(f"""
  Nombre: {nombre}
  Id: {id}
  Precio: {precio}
  Envio Gratuito: {envioGratuito}
""")

