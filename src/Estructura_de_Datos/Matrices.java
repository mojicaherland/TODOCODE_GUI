package Estructura_de_Datos;

import java.util.Formattable;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        //carga manual
        cargarMatrizManual2(matriz);
    }

    //Mostrar cualquier tipo de matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(" " + matriz[fila][columna] + " ");
            }
            System.out.println("|");
        }
    }

    //carga manual
    public static void cargarMatrizManual(int[][] matriz) { //como aprendi
        Scanner eleMatriz = new Scanner(System.in);
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("ingrese datos: ");
                matriz[fila][columna] = eleMatriz.nextInt();
            }
        }
    }

    public static void cargarMatrizManual2(int[][] matriz) { //como encontre ayuda
        Scanner eleMatriz = new Scanner(System.in);
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("ingrese datos: ");
                matriz[fila][columna] = eleMatriz.nextInt();
            }
        }
        mostrarMatriz(matriz);
    }
    //carga randomicamente
    public static void cargarMatrizRandomicamente(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = Vectores.generaNumeroRandom(30,1);
            }
        }
        mostrarMatriz(matriz);
    }

}
