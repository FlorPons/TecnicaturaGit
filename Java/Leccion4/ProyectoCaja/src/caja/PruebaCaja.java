    /*
Proyecto caja:
Ejercicio 1: Crear un proyecto segun las especificaciones 
mostradas a continuacion.
La formula es: volumen = ancho*alto*profundidad
*/
package caja;

public class PruebaCaja {

    public static void main(String args[]) { //Metodo main
     //variables locales
     int medidaAncho = 3; //Valores ingresados en codigo duro
     int medidaAlto = 2;
     int medidaProf = 6;
     
     caja caja1 = new caja(); //Instanciamos el objeto, constructor vacio
     caja1.ancho = medidaAncho;//Le pasamos los valores al objeto
     caja1.alto =medidaAlto;
     caja1.profundo = medidaProf;
     int resultado = caja1.calcularVolumen(); //Llamamos al metodo
     //Primer resultado
        System.out.println("Resultado volumen caja1: "+resultado);
        
        caja caja2 = new caja(2, 4, 6); //Llamamos al constructor 2 con nuevos argumentos
        //Llamamos con el nuevo objeto al metodo para un nuevo calculo
        System.out.println("Resultado volumen caja 2: "+caja2.calcularVolumen());
    }
    
}

