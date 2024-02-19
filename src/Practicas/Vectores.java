package Practicas;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        int[] vector = new int[5];
        int[] vector2 = new int[5];
        cargarVecRan(vector);
        //cargarVecMan(vector);
        mostarVec(vector);
        mostarVec(vector2);
        ejer2_4(vector,vector2);
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

    //2.2 Leer 10 numeros enteros,guardarlos en un arreglo.
    //Debemos mostrarlo en el siguiente orden:
    // el primero,el ultimo,el segundo,el penutimo,el tercero,etc.
    public static void ejer2_2(int[] vector) {
        int[] vectorAux = new int[vector.length];
        int ini = 0, fin = vector.length - 1;
        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                vectorAux[i] = vector[ini++];
            } else {
                vectorAux[i] = vector[fin--];
            }
        }
        mostarVec(vectorAux);
    }

    //2.3 leer 5 numeos por teclado, almacenarlos en un arreglo y a continuacion realizar
    //la media de los numeros positivos, la media de los numeros negativos
    //y contar el numero de ceros
    public static void ejer2_3(int[] vector) {
        float suma_pos = 0, suma_neg = 0, media_pos = 0, media_neg = 0;
        int cont_0 = 0, cont_pos = 0, cont_neg = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                suma_pos = suma_pos + vector[i];
                cont_pos++;
            } else if (vector[i] < 0) {
                suma_neg = suma_neg + vector[i];
                cont_neg++;
            } else if (vector[i] == 0) {
                cont_0++;
            }
        }
        if (cont_pos != 0) {
            media_pos = suma_pos / cont_pos;
        } else {
            System.out.println("Error");
        }
        if (cont_neg != 0) {
            media_neg = suma_neg / cont_neg;
        } else {
            System.out.println("error");
        }
        System.out.println(media_pos + "," + media_neg + "," + cont_0);
    }

    //2.4 Leer por teclado dos arrays de 10 numeros enteros y mesclarlas en un tercer array
    // de la forma: el 1 de A,el 1 de B, el 2 de A, el 2 de B, etc..
    public static void ejer2_4(int[] vec1, int[] vec2) {
        int[] vecPrincipal = new int[vec1.length + vec2.length];
        int contAux = 0;
        for (int i = 0; i < vecPrincipal.length - 1; i++) {
            vecPrincipal[contAux] = vec1[i];
            // CORREGIR
        }
        mostarVec(vecPrincipal);
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
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        return min;
    }
    //4. Buscar un elemento específico en un array.

    //forma mia
    public static void buscarEle(int[] vector, int eleABuscar) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == eleABuscar) {
                System.out.println(vector[i]);
            }
        }
    }
    //algoritmos de ordenamiento

    //1.Burbuja
    public static void BubbleSort(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1; j++) {
                if (vector[j] > vector[j + 1]) { //v[5,2]
                    int aux = vector[j]; // aux = 5
                    vector[j] = vector[j + 1]; //vector[j] = 2
                    vector[j + 1] = aux; //vector[j+1] = 5 --> v[2,5]intercambio
                }
            }
        }
    }

    //Seleccion
    public static void SeleccionSort(int[] vector) {

    }
}
