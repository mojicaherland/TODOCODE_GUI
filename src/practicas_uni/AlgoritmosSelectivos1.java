package practicas_uni;

public class AlgoritmosSelectivos1 {
    public static void main(String[] args) {
        System.out.println(ejer9(-1));
    }

    //1. leer 2 números diferentes y encontrar el número mayor.
    public static void ejer1(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    //2.Leer 2 números diferentes y encontrar el número menor.
    public static void ejer2(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    //3.Obtener le valor absoluto de un numero
    public static int ejer3(int numero) {
        return Math.abs(numero);
    }

    //4.Determinar si un numero es multiplo de 6 y 9 a la vez
    public static boolean ejer4(int numero) {
        return (numero % 6 == 0 && numero % 9 == 0);
    }

    //5. Intercambiar dos variables a y b en caso de que a sea mayor a b
    public static void ejer5(int a, int b) {
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }
        System.out.println("Despues : " + a + b);

    }

    //6. Determinar el mayor de 3 numeros
    public static void ejer6(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }
    }

    //7. Deducir si un numero N leido desde teclado es positivo , negativo o cero
    public static void ejer7(int numero) {
        if (numero >= 0) {
            System.out.println("pos");
        } else if (numero == 0) {
            System.out.println("cero");
        } else {
            System.out.println("neg");
        }
    }

    //8.Leer un numero del 1 al 7 y luego escribir el dia que le coreesponde
    //Ej : n=2 --> martes
    public static String ejer8(int numero) {
        String dia = "";
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                System.out.println("No existe el dia que introdujo");
        }
        return dia;
    }

    //Version Mejorada
    public static String ejer8Mejorado(int numero) {
        String diasSemana[] = {"", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String resultado;
        if (numero >= 1 && numero <= 7) {
            resultado = diasSemana[numero];
        } else {
            resultado = "No existe el dia que introdujo";
        }
        return resultado;
    }

    /*  Ejercicio 9
     *  La alcaldía ofrece subsidios a las familias de bajos recursos bajo las siguientes condiciones:
        a) Si la familia tiene un hijo, un subsidio de Bs. 50
        b) Si la familia tiene más de 1 hijo y menos de 5 hijos, por cada hijo ofrece un subsidio de Bs. 40
        c) Si la familia tiene 5 o más hijos ofrece un subsidio de Bs. 35 por hijo
        Calcular el subsidio total
     */
    public static int ejer9(int numeroDeHijos) {
        int subTotal = 0;
        if (numeroDeHijos == 1) {
            subTotal = 50;
        } else if (numeroDeHijos > 1 && numeroDeHijos < 5) {
            subTotal = 40 * numeroDeHijos;
        } else if (numeroDeHijos>=5) {
            subTotal = 35 * numeroDeHijos;
        }else{
            System.out.println("Numero de hijos incorrecto");
        }
        return subTotal;
    }

}
