package Estructura_de_Datos;

import javax.swing.*;
import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        int[] vector = new int[4];
//        vector[0] = 2;
//        vector[1] = 2;
//        vector[2] = 2;
//        vector[3] = 2;
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println(i + " " + vector[i]);
//            System.out.println("-------------------");
//        }
        cargarVectorRandom(vector);
    }

    // Generar un numero randomicamente
    public static int generaNumeroRandom(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    //proceso para cargar un vector dependiendo de la cantidad que desee el usuario y los datos
    public static void cargarVector(int vector[]) {
        Scanner elementosVec = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese dato para la pos: " + i);
            vector[i] = elementosVec.nextInt();
            System.out.println("Pos: " + i + " Dato: " + vector[i]);
        }
    }

    public static void cargarVectorRandom(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generaNumeroRandom(30, 1);
            System.out.println(vector[i]);
        }
    }


}
