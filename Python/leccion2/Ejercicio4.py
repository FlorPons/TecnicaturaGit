#Ejercicio Etapas de vida según la edad
edad = int(input("Digite su edad: "))
mensaje = None
if 0 <= edad < 10: #Sintaxis simplificada
 mensaje = "La infancia es increíble y bella"
elif 10 <= edad < 19:
 mensaje = "Tienes muchos cambios, mucho que estudiar"
elif 20 <= edad < 29:
 mensaje = "Amor y comienza el trabajo"
else:
 mensaje = "Error, etapa de vida no reconocida"
print(f"Tu edad es: {edad},{mensaje}")
