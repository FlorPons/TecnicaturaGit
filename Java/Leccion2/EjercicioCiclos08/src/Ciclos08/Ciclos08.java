/*
Ejercicio 8: Perdir un numetro N, y mostrar todos los numeros
del1 al N.
*/
package Ciclos08;

import java.util.Scanner;

public class Ciclos08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;
        while(i<=numero){
            System.out.println(i);
            i++;
        }
    }
}
