/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Trabajo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        //Ingreso de los numeros
        for(int i=0; i < 5; i++){
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Algoritmo de seleccion para ordenar los numeros
        for (int i = 0; i < numeros.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < numeros.length; j++){
                if(numeros[j] < numeros[minIndex]){
                    minIndex = j;
                }
            }
        }
        
        //mostrar los numeros ordenados
        System.out.print("Ordenado de menor a mayor: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
            if (i < numeros.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        
        scanner.close();
        scanner.close();
    
    }
}
