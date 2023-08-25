/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class IMSERCION {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int arreglo[],nElementos,pos,aux;
         
         nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
         
         
         arreglo = new int[nElementos];
         
         System.out.println("digite el arreglo: ");
         for(int i=0;i<nElementos;i++){
             System.out.println((i+1)+". digite un numero: ");
             arreglo[i] = entrada.nextInt();
         }
         
         //ordenamiento por insercion
         
         for(int i=0;i<nElementos;i++){
             pos = i;
             aux = arreglo[i];
         while((pos>0) &&  (arreglo[pos-1] > aux))
             arreglo[pos] = arreglo[pos-1];
         pos--;
         
         
         arreglo[i] = aux;
         }
         
         System.out.print("/nOrden Ascendente: ");
         for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+ " - ");
         }
         System.out.println("");
         
      
    }
}
