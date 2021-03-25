/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_7;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Actividad_7 {
    private static final int MAX = 1000;
    private static long[] fibonacci;
    
    
    private static void arreglo() {
       fibonacci[1] = 0;
       fibonacci[2] = 1;
        for (int i = 3; i <= MAX; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }
    
    public static void main(String[] args) {
        //Numero primos
        System.err.println("Numero primos");
        Scanner sc = new Scanner(System.in);
        boolean Primo;
        int n = 0;
        int cantidad;
        int[] numero = new int[10000];
        System.out.print("Escriba un número: ");
        cantidad = sc.nextInt();     
        for (int i=2; n < cantidad; i++){
            Primo = true;
            for (int j=2; j <= Math.sqrt(i) && Primo; j++) {
                if ((i % j) == 0) {
                    Primo = false;
                }
            }
            if (Primo) {
                numero[n] = i;
                n ++;
            } 
        }
        for (int i=0; i <= n - 1; i++){
            System.out.print(numero[i] + ", ");
        }
        
        //fibonacci
        int n1, i;
        Scanner scfibonacci = new Scanner(System.in);
        System.out.println();
        System.err.println("fibonacci");
        System.out.printf("Escriba un número: ");
        n1 = scfibonacci.nextInt();

        if(n1 <= 0){
            System.out.printf("Debe ingresar un número mayor que cero");
        } 
        else{
            fibonacci = new long[MAX+1];
            arreglo();
            for (i = 1; i <= n1; i++) {
                System.out.printf("%d,", fibonacci[i]);
            }
        }
    }
}
