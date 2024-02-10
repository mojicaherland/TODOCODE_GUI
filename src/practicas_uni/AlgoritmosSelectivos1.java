package practicas_uni;

public class AlgoritmosSelectivos1 {
    public static void main(String[] args) {
        ejer21("Apple Wacht", (byte) 01, 500);
    }

    // 1. leer 2 números diferentes y encontrar el número mayor.
    public static void ejer1(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    // 2.Leer 2 números diferentes y encontrar el número menor.
    public static void ejer2(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    // 3.Obtener le valor absoluto de un numero
    public static int ejer3(int numero) {
        return Math.abs(numero);
    }

    // 4.Determinar si un numero es multiplo de 6 y 9 a la vez
    public static boolean ejer4(int numero) {
        return (numero % 6 == 0 && numero % 9 == 0);
    }

    // 5. Intercambiar dos variables a y b en caso de que a sea mayor a b
    public static void ejer5(int a, int b) {
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }
        System.out.println("Despues : " + a + b);

    }

    // 6. Determinar el mayor de 3 numeros
    public static void ejer6(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }
    }

    // 7. Deducir si un numero N leido desde teclado es positivo , negativo o cero
    public static void ejer7(int numero) {
        if (numero >= 0) {
            System.out.println("pos");
        } else if (numero == 0) {
            System.out.println("cero");
        } else {
            System.out.println("neg");
        }
    }

    // 8.Leer un numero del 1 al 7 y luego escribir el dia que le coreesponde
    // Ej : n=2 --> martes
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

    // Version Mejorada
    public static String ejer8Mejorado(int numero) {
        String diasSemana[] = { "", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        String resultado;
        if (numero >= 1 && numero <= 7) {
            resultado = diasSemana[numero];
        } else {
            resultado = "No existe el dia que introdujo";
        }
        return resultado;
    }

    /*
     * Ejercicio 9
     * La alcaldía ofrece subsidios a las familias de bajos recursos bajo las
     * siguientes condiciones:
     * a) Si la familia tiene un hijo, un subsidio de Bs. 50
     * b) Si la familia tiene más de 1 hijo y menos de 5 hijos, por cada hijo ofrece
     * un subsidio de Bs. 40
     * c) Si la familia tiene 5 o más hijos ofrece un subsidio de Bs. 35 por hijo
     * Calcular el subsidio total
     */
    public static int ejer9(int numeroDeHijos) {
        int subTotal = 0;
        if (numeroDeHijos == 1) {
            subTotal = 50;
        } else if (numeroDeHijos > 1 && numeroDeHijos < 5) {
            subTotal = 40 * numeroDeHijos;
        } else if (numeroDeHijos >= 5) {
            subTotal = 35 * numeroDeHijos;
        } else {
            System.out.println("Numero de hijos incorrecto");
        }
        return subTotal;
    }

    // 10.. A un trabajador le pagan según sus horas y una tarifa de pago por horas.
    // si la cantidad de horas
    // trabajadas es mayor a 40 horas. la tarifa se incrementa en un 50% para las
    // horas extras. calcular el
    // salario del trabajador dadas las horas trabajadas y la tarifa
    public static float ejer10(int cantidadHoras, float tarifaHora) {
        float sueldoTotal;
        if (cantidadHoras > 40) {
            // sueldo sin horas + sueldo con horas extras
            sueldoTotal = (cantidadHoras - (cantidadHoras - 40)) + (1);
        } else {
            sueldoTotal = cantidadHoras * tarifaHora;
        }
        return sueldoTotal;
    }

    // 11. A un trabajador A un trabajador le descuentan de su sueldo el 10% si su
    // sueldo es menor o igual a 1000. por
    // encima de 1000 y hasta 2000 el 5% del adicional, y por encima de 2000 el 3%
    // del adicional. calcular
    // el descuento y sueldo neto que recibe el trabajador dado su sueldo.
    public static float ejer11(float sueldoTrabajador) {
        if (sueldoTrabajador < 1000) {
            sueldoTrabajador = sueldoTrabajador - (sueldoTrabajador * 0.10f);
        } else if (sueldoTrabajador > 1000 && sueldoTrabajador <= 2000) {
            sueldoTrabajador = sueldoTrabajador - (sueldoTrabajador * 0.05f);
        } else if (sueldoTrabajador > 2000) {
            sueldoTrabajador = sueldoTrabajador - (sueldoTrabajador * 0.03f);
        }
        return sueldoTrabajador;
    }

    // 12.Dado un monto calcular el descuento considerando que por encima de 100 el
    // descuento es el 10% y
    // por debajo de 100 el descuento es el 2%.
    public static float ejer12(int monto) {
        float descuento;
        if (monto >= 100) {
            descuento = monto * 0.10f;
        } else {
            descuento = monto * 0.02f;
        }
        return descuento;
    }

    // 13. Hacer un algoritmo que calcule el total a pagar por la compra de camisas.
    // Si se compran tres camisas
    // o mas, se aplica un descuento del 20% sobre el total de la compra y si son
    // menos de tres camisas
    // un descuento del 10%
    public static float ejer13(int cantidadCamisas, float montoTotalCamisas) {
        if (cantidadCamisas >= 3) {
            montoTotalCamisas = montoTotalCamisas - (montoTotalCamisas * 0.20f);
        } else {
            montoTotalCamisas = montoTotalCamisas - (montoTotalCamisas * 0.10f);
        }
        return montoTotalCamisas;
    }

    // 14. Se trata de escribir el algoritmo que permita emitir la factura
    // correspondiente a una compra de un
    // artículo determinado, del que se adquieren una o varias unidades. El IVA es
    // del 15% y si el precio
    // bruto (precio venta mas IVA) es mayor de 500 Bs. se debe realizar un
    // descuento del 5%.
    public static void ejer14(String nombreArticulo, float precioArticulo, int cantidadArticulo) {
        float montoSinIva, montoConIva, descuento = 0;
        montoSinIva = cantidadArticulo * precioArticulo; // 600
        montoConIva = (cantidadArticulo * precioArticulo) + (cantidadArticulo * precioArticulo) * 0.15f; // preciobruto
        if (montoConIva >= 500) {
            descuento = (montoConIva) - (montoConIva * 0.05f);
        }
        System.out.println("----------------FACTURA--------------------");
        System.out.println("Nombre del articulo : " + nombreArticulo);
        System.out.println("Cantidad del articulo : " + cantidadArticulo);
        System.out.println("Precio del articulo : " + precioArticulo);
        System.out.println("Monto Total sin Iva : " + montoSinIva);
        System.out.println("Monto Total con Iva : " + montoConIva);
        System.out.println("Monto Total con Iva y Descuento : " + descuento);
        System.out.println("-------------------------------------------");
    }

    // 15. Hacer un programa que permita calcular el peso promedio de una persona,
    // si el usuario selecciona el
    // sexo e introduce el peso, calcular con cuanto está excedido de peso si lo
    // normal para sexo masculino
    // es 90 kg. y para sexo femenino lo normal es 75 Kg
    public static float ejer15(float pesoUsuario, char sexoUsuario) {
        final int pesoNormalHombre = 90;
        final int pesoNormalMujer = 75;
        float pesoExceso = 0, pesoProm;
        if ((pesoUsuario >= 0) && (sexoUsuario == 'M' || sexoUsuario == 'm')) {
            pesoProm = (pesoUsuario + pesoNormalHombre) / 2;
            pesoExceso = pesoUsuario - pesoProm;
        } else if ((pesoUsuario >= 0) && (sexoUsuario == 'F' || sexoUsuario == 'f')) {
            pesoProm = (pesoUsuario + pesoNormalMujer) / 2;
            pesoExceso = pesoUsuario - pesoProm;
        }
        return pesoExceso;
    }
    // 16. Hacer un programa para introducir 3 números por teclado y mostrar el
    // número mayor o si son iguales

    // 17.. Un hombre desea saber cuánto dinero se genera por concepto de intereses
    // sobre la cantidad que
    // tiene en inversión en el banco. El decidirá reinvertir los intereses siempre
    // y cuando estos excedan
    // a $7000, y en ese caso desea saber cuánto dinero tendrá finalmente en su
    // cuenta
    public static float ejer17(float dineroUsuario) {
        return 0;
    }

    // 18. En un almacén se hace un 20% de descuento a los clientes cuya compra
    // supere los $1000 ¿Cuál
    // será la cantidad que pagara una persona por su compra?
    public static float ejer18(float cantidadCompra) {
        if (cantidadCompra >= 1000) {
            cantidadCompra = cantidadCompra - (cantidadCompra * 0.20f);
        }
        return cantidadCompra;
    }

    // 19.Un obrero necesita calcular su salario semanal, el cual se obtiene de la
    // sig. manera: Si trabaja 40
    // horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga
    // $16 por cada una
    // de las primeras 40 horas y $20 por cada hora extra

    // 20. Una persona enferma, que pesa 70 kg, se encuentra en reposo y desea saber
    // cuántas calorías
    // consume su cuerpo durantetodo el tiempo que realice una misma actividad. Las
    // actividades que
    // tiene permitido realizar son únicamente dormir o estar sentado en reposo. Los
    // datos que tiene
    // son que estando dormido consume 1.08 calorías por minuto y estando sentado en
    // reposo
    // consume 1.66 calorías por minuto.

    // Metodo Auxiliar --> convertir horas en minutos
    public static int convertir(int cantidadHoras) {
        return cantidadHoras * 60;
    }

    public static float ejer20(String estadoPersona, int cantidadMinutos) {
        float cantidadTotalCaloriasGastadas = 0;
        if (estadoPersona.toLowerCase().equals("dormir")) {
            cantidadTotalCaloriasGastadas = 1.08f * cantidadMinutos;
        } else if (estadoPersona.toLowerCase().equals("sentado")) {
            cantidadTotalCaloriasGastadas = 1.66f * cantidadMinutos;
        }
        return cantidadTotalCaloriasGastadas;
    }

    // 21.. Hacer un algoritmo que imprima el nombre de un artículo, clave, precio
    // original y su precio con
    // descuento. El descuento lo hace en base a la clave, si la clave es 01 el
    // descuento es del 10% y si
    // la clave es 02 el descuento en del 20% (solo existen dos claves).
    public static void ejer21(String nombreArticulo, byte clave, int precio) {
        float precioDescuento = 0;
        if (clave == 01) {
            precioDescuento = precio - (precio * 0.10f);
        } else if (clave == 02) {
            precioDescuento = precio - (precio * 0.20f);
        }
        System.out.println("--------------------------");
        System.out.println("Nombre Articulo: " + nombreArticulo);
        System.out.println("Clave: " + clave);
        System.out.println("Precio Original: " + precio);
        System.out.println("Precio con Descuento: " + precioDescuento);
        System.out.println("---------------------------");
    }

    // 22. Hacer un algoritmo que calcule el total a pagar por la compra de camisas.
    // Si se compran tres
    // camisas o mas se aplica un descuento del 20% sobre el total de la compra y si
    // son menos de tres
    // camisas un descuento del 10%
    public static void ejer22(int cantidadCamisas, float precioCamisa) {
        float montoTotal = cantidadCamisas * precioCamisa;
        if (cantidadCamisas >= 3) {
            montoTotal = montoTotal - (montoTotal * 0.20f);
        } else {
            montoTotal = montoTotal - (montoTotal * 0.10f);
        }
        System.out.println("Monto Total a Pagar: " + montoTotal);
    }

}
