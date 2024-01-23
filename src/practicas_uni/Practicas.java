package practicas_uni;

import javax.swing.*;

//EJERCICIOS DE LA DOCENTE ANGELICA GARZON INTRO
public class Practicas {
    public static void main(String[] args) {
        //System.out.println(ejer1(5));
        ejer3(5);
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

}


