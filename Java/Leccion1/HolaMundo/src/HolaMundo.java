//Nuestro primer programa Hola Mundo. Comentarios de una sola linea.
/*
Comentarios mas extensivos
muchas
mas lineas
 */
public class HolaMundo {

    public static void main(String args[]) { //psvm+tab
        /*System.out.println("Hola Mundo desde Java"); //sout+tab
        
        int miVariable=10;//Asignamos un valor de tipo entero
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena ="Sigamos creciendo en programación";
        System.out.println(miVariableCadena);
         */
        //Var - inferencia de tipos Java
        /*var miVariableEntera2 = 10;
         var miVariableCadena2 = "Seguimos estudiando";
         System.out.println("miVariableEntera2 = " + miVariableCadena2);
         System.out.println("miVariableCadena2 = " + miVariableCadena2); 
         */
        //soutv + tab
        //Para ejecutar Shift + F6 es la tecla para mayuscula
        //Reglas para definir una variable en Java

        /*var opcion = 45;
         
         var usuario = "Osvaldo";
         var titulo = "Ingeniero";
         var union = titulo + " " + usuario;
         System.out.println("union = " + union);
         
         
         var a = 8;
         var b = 4;
         System.out.println(usuario + (a + b));
         //Ejercicio: Caracteres especiales con Java
         var nombre = "Natalia";
         System.out.println("\nNueva linea: \n" + nombre); // Diagonal inversa y letra n
         System.out.println("Tabulador: \t" + nombre); //Tabulador un espacio para centrar
         System.out.println("Tabulador: \t\t.:MENÚ:.");
         System.out.println("Retroceso: \b\b" + nombre); //Caracter Retroceso
         System.out.println("Comillas Simples: \'" + nombre + "\'");
         System.out.println("Comillas Dobles: \"" + nombre + "\"");*/
        //Clase Scanner
        /*Scanner entrada = new Scanner (System.in);
         System.out.println("Digite su nombre: ");
         var usuario2 = entrada.nextLine();
         System.out.println("Escriba el título: ");
         var titulo2 = entrada.nexLine ();
         System.out.println("Resultado: " + titulo2 +" " + usuario2); */
 /*byte numEnteroByte = 127;
         System.out.println("numEnteroByte = " + numEnteroByte);
         System.out.println("Valor minimo del Byte:" + Byte.MIN_VALUE);
         System.out.println("Valor maximo del Byte:" + Byte.MAX_VALUE);
         
         short numEnteroShort = 32767;
         System.out.println("numEnteroShort = " + numEnteroShort);
         System.out.println("Valor minimo del Short:" + Short.MIN_VALUE);
         System.out.println("Valor maximo del Short:" + Short.MAX_VALUE);
         
         int numEnteroInt = 2147483647;
         System.out.println("numEnteroInt = " + numEnteroInt);
         System.out.println("Valor minimo del Int:" + Integer.MIN_VALUE);
         System.out.println("Valor maximo del Int:" + Integer.MAX_VALUE);
         
         long numEnteroLong = 9223372036854775807L;
         System.out.println("numEnteroLong = " + numEnteroLong);
         System.out.println("Valor minimo del Long:" + Long.MIN_VALUE);
         System.out.println("Valor maximo del Long:" + Long.MAX_VALUE);
         
         float numFloat = 3.4028235E38F;
         System.out.println("numFloat = " + numEnteroLong);
         System.out.println("Valor minimo de Float:" + Float.MIN_VALUE);
         System.out.println("Valor maximo del Float:" + Float.MAX_VALUE);
         
         Double numDouble = 1.7976931348623157E308D;
         System.out.println("numDouble = " + numEnteroLong);
         System.out.println("Valor minimo de Double:" + Double.MIN_VALUE);
         System.out.println("Valor maximo de Double:" + Double.MAX_VALUE);*/
        //Inferencia de tipos var y tipos primitivos
        /*var numEntero = 20; //Las literales sin punto automáticamente son de tipo int
         System.out.println("numEntero = " + numEntero);
         var numFloat = 10.0F; //Automáticamente con el punto se transforma en tipo double
         System.out.println("numFloat = " + numFloat);
         var numDouble = 10.0;
         System.out.println("numDouble = " + numDouble);*/
        //Tipos primitivos char
        /*char miVariableChar = 'a';
         System.out.println("miVariableChar = " + miVariableChar);
         
         char varCaracter = '\u0024'; //Indicamos a Java la asignación con el código unicode
         System.out.println("varCaracter = " + varCaracter);        
         char varCaracterDecimal = 36; //Valor decimal del juego de  caracteres unicode
         System.out.println("varCaracterDecimal = " + varCaracterDecimal);        
         char varCaracterSimbolo = '$';//Un caracter especial, podemos copiar y pegar desde unicode
         System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
         
         var varCaracter1 = '\u0024'; //Indicamos a Java la asignación con el código unicode
         System.out.println("varCaracter1 = " + varCaracter1);        
         var varCaracterDecimal1 = (char) 36; //Valor entero y le un tipo int
         System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);        
         var varCaracterSimbolo1 = '$';
         System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
         
         
         int varEnteroChar = '$'; 
         System.out.println("varEnteroChar = " + varEnteroChar);
         int caracterChar = 'b';
         System.out.println("caracterChar = " + caracterChar);*/
        //Inferencia de tipos var y tipos primitivos
        /*var numEntero = 20; //Las literales sin punto automáticamente son tipo int
         System.out.println("numEntero = " + numEntero);
         var numFloat = 10.0F; //Automaticamente con el punto decimal se convierte en tipo double
         System.out.println("numFloat = " + numFloat);
         var numDouble = 10.0;
         System.out.println("numDouble = " + numDouble);*/
        //Tipos primitivos char
        /*char miVariableChar = 'a';
         System.out.println("miVariableChar = " + miVariableChar);
         
         char varCaracter = '\u0024'; //Indicamos a Java la asignacion con el c[odigo unicode
         System.out.println("varCaracter = " + varCaracter);
         char varCaracterDecimal = 36; // valor decimal del juego de caracteres unicode
         System.out.println("varCaracterDecimal = " + varCaracterDecimal);
         char varCaracterSimbolo = '$';
         System.out.println("varCaracterSinbolo = " + varCaracterSimbolo);
         
         var varCaracter1 = '\u0024'; //Indicamos a Java la asignacion con el c[odigo unicode
         System.out.println("varCaracter1 = " + varCaracter1);
         var varCaracterDecimal1 = (char) 36; // valor Entero y le asigna un tipo int
         System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
         var varCaracterSimbolo1 = '$';
         System.out.println("varCaracterSinbolo1 = " + varCaracterSimbolo1);
             
         int varEnteroChar = '$';
         System.out.println("varEnteroChar = " + varEnteroChar);
         int caracterChar = 'b';
         System.out.println("caracterChar = " + caracterChar);*/
        //Tipos primitivos tipos booleanos
        /*var varBool = false;
         System.out.println("varBool = " + varBool);
         
         if (varBool){
             System.out.println("La bandera es verde");   
         }
         else {
             System.out.println("La bandera es roja");
         }
         
         //Algoritmo: ¿Es mayor de edad?
         var edad = 15;//Literal tener presente la inferencia de tipos
         //var adulto = edad >= 18; // Esta es una expresion booleana
         if (edad >= 18){
             System.out.println("Eres mayor de edad");
         }
         else{
             System.out.println("Eres menor de edad");
         }*/
        //Conversion de tipos primitivos
        /*var edad = Integer.parseInt("20"); 
         System.out.println("edad = " + (edad + 1));
         var valorPI = Double.parseDouble("3.1416");
         System.out.println("valorPI = " + valorPI);
         
         //Pedir un valor
         var entrada = new Scanner (System.in);
         System.out.println("Digite su edad: ");
         edad = Integer.parseInt(entrada.nextLine());
         System.out.println("edad = " + edad);*/
        //Conversion de tipos primitivos en Java Parte 2
        /*var edadTexto = String.valueOf(10);
         System.out.println("edadTexto = " + edadTexto);
         
         var fraseChar = "programadores".charAt(4);
         System.out.println("fraseChar = " + fraseChar);
         
         System.out.println("Digite un caracter: ");
         fraseChar = entrada.nextLine().charAt(0);
         System.out.println("fraseChar = " + fraseChar);
         */
        /*int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma = " + solucion);

        solucion = num1 - num2;
        System.out.println("Solucion de la resta = " + solucion);

        solucion = num1 * num2;
        System.out.println("Solucion de la multiplicacion = " + solucion);

        solucion = num1 / num2;
        System.out.println("Solucion de la division = " + solucion);

        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);

        solucion = num1 % num2; //Guaarda el residuo entero de la division
        System.out.println("solucion = " + solucion); // 5/4

        if (num2 % 2 == 0) {
            System.out.println("Es un número par");
        } else {
            System.out.println("Es un número impar");
        }*/
        
        /*int varNum1 = 1, varNum2 =4;
        var varNum3 = varNum1 + 6 - varNum2; //Una operación
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; // varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
//   -=    *=     /=     %=
        
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum2 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
        */
        
        //Operadores Unarios: Cambio de signo
        /*var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); //El resultado será un número negativo
        
        //Operador de Negación
        var varC = true; //Esta literal por default en Java es de tipo boolean
        var varD = !varC; //Aquí esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de Incremento: Preincremento
        var varE = 9; //Se va modificando su valor
        var varF = ++varE; //Símbolo antes de la variable
        //primero se incrementa la variable y después se usa su valor
        System.out.println("varE = " + varE);//Se incrementa en la unidad
        System.out.println("varF = " + varF); //suma uno
        
        //Postincremento (el símbolo va después de la variable)
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores unitarios de decremento: Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ " + varJ);
        
        //Postdecremento
        var varK = 8;
        var varL = varK--;//Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK);//Aquí va a decrementar en 1
        System.out.println("varL = " + varL);
        */
        
        //Operadores de igualdad y Relacionales
        /*var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB ="Hello";
        var cVar = cadenaA.equals(cadenaB);
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum != bNum; //> >= < <= == !=
        System.out.println("gVar = " + gVar);
        
        if (bNum % 2 == 0) {
        System.out.println("El número es Par");
    } else {
        System.out.println("El número es Impar");   
        }
        
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }*/
        
        //Operador Condicional And
        /*var valorA = 0;
        var valorMinimo = 0;//Rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        
        if(respuesta)
            System.out.println("Esta dentro del rango establecido");
        else {
            System.out.println("Esta fuera del rango establecido");
        }
          
        var vacaciones = true;
        var diaLibre = false;
        if (vacaciones || diaLibre)
            System.out.println("papá puede asistir al juego de su hijo");
        else
            System.out.println("Papá no puede asistir al juego de su hijo");
        */
        
        //Operador Ternario
        /*
        var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT =4;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);
        */
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; //4+((5*6)/3)=30/3+10+4=14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3; //4 +5=9*6=54/3=18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
                
                    
        
        
        
       
    }
        
        
        
            
}
