package Practicas;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        int[] vector = new int[10];
        //cargarVecRan(vector);
        cargarVecMan(vector);
        mostarVec(vector);
        buscarEle(vector,5);
    }

    //----Metodos auxiliares----

    //cargar vector manualemnte
    public static void cargarVecMan(int[] vector) {
        Scanner elementosVec = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("digite los elementos: ");
            vector[i] = elementosVec.nextInt();
        }
    }

    //cargar vector randomicamente
    public static void cargarVecRan(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 20) + 1;
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

    //1. sumar todos los elementos de un array
    public static int sumarElementos(int[] vector) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        return suma;
    }

    //2. Encontrar el promedio de los elementos de un array.
    public static float promedioVec(int[] vector) {
        float prom = 0, suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
            prom = suma / vector.length;
        }
        return prom;
    }

    //3. Encontrar el elemento máximo y mínimo en un array.
    public static int eleMaximo(int[] vector) {
        int max = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        return max;
    }

    public static int eleMin(int[] vector) {
        int min = vector[0];
        for (int i = 0; i < vector.length;i++){
            if (vector[i] < min){
                min = vector[i];
            }
        }
        return min;
    }
    //4. Buscar un elemento específico en un array.

    //forma mia
    public static void buscarEle(int[] vector,int eleABuscar){
        for (int i = 0; i < vector.length;i++){
            if (vector[i] == eleABuscar){
                System.out.println(vector[i]);
            }
        }
    }
    //algoritmo de busqueda --> x
}
