package Practicas;

// AQUI IRAN TODOS LOS EJERCICIOS PARA REALIZAR CON NUMEROS

public class Numeros {
    public static void main(String[] args) {
        System.out.println(verifNumPerfecto(6));
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
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Ejercicio 7: Calcula la potencia de un número ingresado por el usuario.
    public static int potencia(int num, int pot) {
        int res = 1;
        for (int i = 1; i <= pot; i++) {
            res = res * num;
        }
        return res;
    }

    public static float potencia2(int numero, int potencia) {
        return (float) Math.pow(numero, potencia);
    }

    // Ejercicio 8: Calcula la raíz cuadrada de un número ingresado por el usuario.
    public static float raizCuadrada(float numero) {
        return (float) Math.sqrt(numero);
    }

    // Ejercicio 9: Verifica si un número ingresado por el usuario es par o impar.
    public static void parImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
    // Ejercicio 10: Verifica si un número ingresado por el usuario es primo.

    // Ejercicio 11: Genera una secuencia de Fibonacci hasta un número ingresado por
    // el usuario.
    public static void fibonacci(int numero) {
        int a = 0, b = 1, c;
        for (int i = 0; i < numero; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    // Ejercicio 12: Encuentra el número mayor entre tres números ingresados por el
    // usuario.
    public static int numeroMayorDeTres(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    // Ejercicio 13: Encuentra el número menor entre tres números ingresados por el
    // usuario.

    // Ejercicio 14: Calcula el promedio de tres números ingresados por el usuario.
    public static float promediNumeros(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }
    // Ejercicio 15: Verifica si tres números ingresados por el usuario pueden
    // formar los lados de un triángulo.

    // Ejercicio 16: Calcula el área de un triángulo utilizando los tres lados
    // ingresados por el usuario (fórmula de Herón).

    // Ejercicio 17: Verifica si un número ingresado por el usuario es un número de
    // Armstrong.
    public static boolean verifNumeroArmstrong(int numero) {
        int suma = 0;
        boolean e = false;
        while (numero != 0) {
            int dig = numero % 10;
            suma = suma + (int) (Math.pow(dig, 3));
        }
        if (numero == suma) {
            e = true;
        }
        return e;
    }

    // Ejercicio 18: Verifica si un número ingresado por el usuario es un número
    // perfecto.
    public static boolean verifNumPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == numero) {
            return true;
        } else {
            return false;
        }
    }

    // Ejercicio 19: Calcula el interés compuesto para un capital, tasa de interés y
    // tiempo ingresados por el usuario.

    // Ejercicio 20: Convierte un número decimal ingresado por el usuario a binario.
}
