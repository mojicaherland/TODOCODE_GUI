package Practicas;

// AQUI IRAN TODOS LOS EJERCICIOS PARA REALIZAR CON NUMEROS

public class Numeros {
    public static void main(String[] args) {
        System.out.println(suma(10, 30));
    }

    // Ejercicio 1: Suma dos números ingresados por el usuario.
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    // Ejercicio 2: Resta dos números ingresados por el usuario.
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    // Ejercicio 3: Multiplica dos números ingresados por el usuario.
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    // Ejercicio 4: Divide dos números ingresados por el usuario,
    // teniendo en cuenta la posibilidad de división por cero.
    public static float division(float num1, float num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    // Ejercicio 5: Calcula el módulo de dos números ingresados por el usuario.
    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }

    // Ejercicio 6: Calcula el factorial de un número ingresado por el usuario.

    // Ejercicio 7: Calcula la potencia de un número ingresado por el usuario.

    // Ejercicio 8: Calcula la raíz cuadrada de un número ingresado por el usuario.

    // Ejercicio 9: Verifica si un número ingresado por el usuario es par o impar.

    // Ejercicio 10: Verifica si un número ingresado por el usuario es primo.

    // Ejercicio 11: Genera una secuencia de Fibonacci hasta un número ingresado por
    // el usuario.

    // Ejercicio 12: Encuentra el número mayor entre tres números ingresados por el
    // usuario.

    // Ejercicio 13: Encuentra el número menor entre tres números ingresados por el
    // usuario.

    // Ejercicio 14: Calcula el promedio de tres números ingresados por el usuario.

    // Ejercicio 15: Verifica si tres números ingresados por el usuario pueden
    // formar los lados de un triángulo.

    // Ejercicio 16: Calcula el área de un triángulo utilizando los tres lados
    // ingresados por el usuario (fórmula de Herón).

    // Ejercicio 17: Verifica si un número ingresado por el usuario es un número de
    // Armstrong.

    // Ejercicio 18: Verifica si un número ingresado por el usuario es un número
    // perfecto.

    // Ejercicio 19: Calcula el interés compuesto para un capital, tasa de interés y
    // tiempo ingresados por el usuario.

    // Ejercicio 20: Convierte un número decimal ingresado por el usuario a binario.
}
