package practicas_uni;

import javax.swing.*;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

//EJERCICIOS DE LA DOCENTE ANGELICA GARZON INTRO
public class Practicas {
    public static void main(String[] args) {
        //System.out.println(ejer1(5));
    }

    //1. ELABORAR UN ALGORITMO, PARA LEER N NUMEROS Y MOSTRAR EL PROMEDIO DE LOS
    // N PRIMEROS NUMEROS PARES. EJ : n = 5  --> numeros : 20,1,4,7,13  --> 24/2=12
    public static float ejer1(int numero) {
        int c = 0, cPares = 0;
        float sumaPares = 0;
        while (c < numero) {
            int numerosDeUsuario = Integer.parseInt(JOptionPane.showInputDialog("digite un numero : "));
            if (numerosDeUsuario % 2 == 0) {
                cPares++;
                sumaPares = (sumaPares + numerosDeUsuario) / cPares;
            }
            c++;
        }
        return sumaPares;
    }

    //2. GENERAR LOS N PRIMEROS NUMEROS PARES
    // EJ : n = 5 --> 2,4,6,8,10
    public static void ejer2(int cantidadDeNumeros) {
        int contadorPares = 2, contador = 0;
        while (contador < cantidadDeNumeros) {
            System.out.println(contadorPares);
            contadorPares += 2;
            contador++;
        }
    }

    // probando para recordar
    public static void generaNPrimerosNumerosNaturales(int cantidadDeNumeros) {
        int contador = 1;
        while (contador <= cantidadDeNumeros) {
            System.out.println(contador);
            contador++;
        }
    }

    //3. ELABORAR UN ALGORITMO PARA LEER N NUMEROS POR TECLADO Y MOSTRAR LA CANTIDAD
    // DE NUMEROS POSITIVOS Y NUMEROS NEGATIVOS
    // EJ : n = 5 , numeros = 12,-4,21,-3,-100 --> pos= 2,neg = 3
    public static void ejer3(int cantidadDeNumeros) {
        int contador = 0, contadorPos = 0, contadorNeg = 0;
        while (contador < cantidadDeNumeros) {
            int numIntroducidosUsuario = Integer.parseInt(JOptionPane.showInputDialog("digite un numero : "));
            if (numIntroducidosUsuario >= 0) {
                contadorPos++;
            } else {
                contadorNeg++;
            }
            contador++;
        }
        System.out.println("Pos: " + contadorPos + " Neg: " + contadorNeg);
    }

    //leer un numero y mostrar su cuadrado , repetir el proceso hasta que se introduzca un numero
    //negativo
    public static void mostarCuadrado(int numero) {
        while (numero >= 0) {
            System.out.println(numero * numero);
//            System.out.println(Math.pow(numero,2));
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introdusca otro numero: "));
        }
    }

    //leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que
    // se introduza un 0
    public static void repetirPosNeg(int numero) {
        while (numero != 0) {
            if (numero >= 0) {
                System.out.println("Pos");
            } else {
                System.out.println("Neg");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introdusca otro numero: "));
        }
    }

    //leer un numero hasta que se introduzca un 0.Para cada uno indicar si es par o impar
    public static void repetirParImpar(int numero) {
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introdusca otro numero: "));
        }
    }

    /*
     * Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio entre
     * 0-100, y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea mayor
     * o menor con respecto a N. El proceso termina cuando el usuario acierta y mostrar el
     * numero de intentos
     * */
    public static int generaNumeroRandom(int max, int min) { //funcion que genera un numero randm entre x valores
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    //No usare la funcion externa porque tardaria mas el juego y se busca eficiencia y el
    // tiempo de la funcion del juego se haria cuadratica
    public static void juegoAdivinarNUmero() {
        int contadorIntentos = 0, numeroAleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
        int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numeroUsuario != numeroAleatorio) {
            if (numeroUsuario >= numeroAleatorio) {
                System.out.println("Es mayor al numero aleatorio, digite un numero menor");
            } else {
                System.out.println("Es menor al numero aleatorio, digite un numeor mayor");
            }
            contadorIntentos++;
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        System.out.println("El numero aleatorio es: " + numeroAleatorio);
        System.out.println("El numero usuario es: " + numeroUsuario);
        System.out.println("El numero de intentos es: " + contadorIntentos);
    }

    //pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
    public static int sumarNumerosIntroducidos(int numero) {
        int sumaNumeros = 0;
        while (numero != 0) {
            sumaNumeros = sumaNumeros + numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        return sumaNumeros;
    }

    //pedir numeros hasta que se introduza uno negativo, y calcular la media
    public static float calcularMediaNumerosIntroducidos(int numero) {
        int sumaNumeros = 0, contadorNumerosIntroducidos = 0;
        float media = 0;
        while (numero >= 0) {
            contadorNumerosIntroducidos++;
            sumaNumeros = sumaNumeros + numero;
            media = (float) sumaNumeros / contadorNumerosIntroducidos;
            numero = numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        if (contadorNumerosIntroducidos == 0) {
            System.out.println("La division entre numeros no es posible");
        }
        return media;
    }

    // escribir todos los numeros del 100 al 0 de 7 en 7
    public static void numeroN() {
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
    }

    //diseñar un programa que muestre el producto de los N numeros impares


}


