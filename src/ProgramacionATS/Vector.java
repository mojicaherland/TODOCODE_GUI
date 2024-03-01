package ProgramacionATS;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        int[] vec1 = new int[5];
        int[] vec2 = new int[5];
        cargarManTradicional(vec1);
        cargarManTradicional(vec2);
        mostarVec(vec1);
        mostarVec(vec2);
        mesclarArreglos(vec1,vec2);
        System.out.println("Cambios para comprobar si hace un pull");
    }

    //cargar manual un vector dependiendo de una cantidad
    public static void cargarManualVector(int cantidad) {
        int[] vector = new int[cantidad];
        Scanner datoEntrada = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese dato para el vector: ");
            vector[i] = datoEntrada.nextInt();
        }

    }

    //cargar manual de forma tradicional
    public static void cargarManTradicional(int[] vector) {
        Scanner datoEntrada = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite dato: ");
            vector[i] = datoEntrada.nextInt();
        }
    }

    //cargar randomicamente un vector
    public static void cargarRandomVector(int cantidad) {
        int[] vector = new int[cantidad];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) ((Math.random() * 20) - 1);
        }
    }

    //mostrar vector
    public static void mostarVec(int[] vector) {
        StringBuilder vectorForm = new StringBuilder("[");
        for (int i = 0; i < vector.length; i++) {
            vectorForm.append(vector[i]);
            if (i != vector.length - 1) {
                vectorForm.append(", ");
            }
        }
        vectorForm.append("]");
        System.out.println(vectorForm.toString());
    }

    //1.Leer cinco numeros, guardarlos en un arreglo y mostrarlos en el mismo orden
    public static void ejer1(int cantidad) {
        int[] vector = new int[cantidad];
        Scanner datoEntrada = new Scanner(System.in);
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese dato: ");
            vector[i] = datoEntrada.nextInt();
        }
        mostarVec(vector);
    }

    //3. Mesclar dos arreglos
    public static void mesclarArreglos(int[] vec1, int[] vec2) {
        int[] vec3 = new int[vec1.length + vec2.length];
        int j = 0;
        for (int i = 0; i < vec1.length; i++) {
            vec3[j++] = vec1[i];
            if (i < vec2.length) {
                vec3[j++] = vec2[i];
            }
        }
        mostarVec(vec3);
    }
}
