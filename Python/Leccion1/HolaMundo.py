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

alto = int(input("Proporciona el alto del rectángulo: "))
ancho = int(input("Proporciona el ancho del rectángulo: "))
área = alto * ancho
perímetro = (alto + ancho) * 2
print("Área: ", área)
print("Perímetro: ", perímetro)
