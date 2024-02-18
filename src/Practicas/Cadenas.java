package Practicas;

import java.security.PublicKey;
import java.security.Signature;
import java.sql.SQLOutput;

public class Cadenas {
    public static void main(String[] args) {
        System.out.println(cadenaDuplicada("hola"));
    }

    //1. Crear una función que reciba una cadena y devuelva la misma cadena en mayúsculas.
    public static String cadenaMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    //2. Crear una función que reciba una cadena y devuelva la misma cadena en minúsculas.
    public static String cadenaMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    //3. Crear una función que reciba una cadena y devuelva la longitud de la cadena.
    public static int longCad(String cadena) {
        return cadena.length();
    }

    //4. Crear una función que reciba una cadena y devuelva la cadena invertida.
    public static StringBuilder cadInv(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadenaInvertida;
    }

    //version recursiva
    public static String cadInvRec(String cadena) { // cadena = "hola"
        String cadenaY;
        if (cadena.isEmpty()) {
            cadenaY = "";
        } else {
            char z = cadena.charAt(0); // h
            cadenaY = cadInvRec(cadena.substring(1)); // cadenaY = " alo"
            cadenaY = cadenaY + z;
        }
        return cadenaY;
    }

    //5. Crear una función que reciba una cadena y un carácter, y devuelva el número de veces que aparece el carácter en la cadena.
    public static int numVecesCaracter(String cadena, char caracter) {
        int contador = 0;
        char[] vecCaracteres = cadena.toCharArray();
        for (int i = 0; i < vecCaracteres.length; i++) {
            if (vecCaracteres[i] == caracter) {
                contador++;
            }
        }
        return contador;
    }

    // mas optimizado el codigo
    public static int numVecesCaracter2(String cadena, char carcater) {
        int c = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == carcater) {
                c++;
            }
        }
        return c;
    }

    //6. Crear una función que reciba una cadena y devuelva la cadena sin espacios en blanco.

    public static String cadenaEspBlanco(String cadena) {
        return cadena.replace(" ", "");
    }

    //7. Crear una función que reciba una cadena y devuelva la cadena con la primera letra de cada palabra en mayúsculas.
    public static String cadPalMayus(String cadena) {
        String[] palabras = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
        }
        return String.join(" ", palabras);
    }

    // 8. Crear una función que reciba una cadena y devuelva true si la cadena es un palíndromo y false en caso contrario.
    public static boolean palindromo(String cadena) { //usando un proceso recursivo
        String cadenaInvertida = cadInvRec(cadena);
        if (cadenaInvertida.equals(cadena)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean palindroma(String cadena) {
        StringBuilder cadenaInvertida = cadInv(cadena);
        if (cadena.equals(cadenaInvertida.toString())) {
            return true;
        } else {
            return false;
        }
    }

    //9. Crear una función que reciba una cadena y
    // devuelva la cadena con todas las vocales reemplazadas por asteriscos.
    //Funcion auxiliar
    public static boolean esVocal(char vocal) {
        final String esVoca = "aeiou";
        return esVoca.contains(Character.toString(Character.toLowerCase(vocal)));
    }

    public static String cadenaSinVocales(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                cadena = cadena.replace(cadena.charAt(i), '*');
            }
        }
        return cadena;
    }
    // 10. Crear una función que reciba una cadena
    // y devuelva la cadena con todas las consonantes reemplazadas por guiones.

    //Metodo aux
    public static boolean esConsonante(char letra) {
        final String consonantes = "bcdfghjklmnpqrstvxyzwy";
        return consonantes.contains(Character.toString(Character.toLowerCase(letra)));
    }

    public static String cadenaSinConsonantes(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (esConsonante(cadena.charAt(i))) {
                cadena = cadena.replace(cadena.charAt(i), '-');
            }
        }
        return cadena;
    }

    //11. Crear una función que reciba una cadena
    // y devuelva la cadena con todas las letras reemplazadas por su posición en el alfabeto.
    public static String cadenaNumeros(String cadena) {
        StringBuilder cadenaAux = new StringBuilder();
        for (char caracter : cadena.toCharArray()) {
            if (Character.isLetter(caracter)) {
                int pos = Character.toLowerCase(caracter) - 'a' + 1;
                cadenaAux.append(pos);
            } else {
                cadenaAux.append(caracter);
            }
        }
        return cadenaAux.toString();
    }

    //12. Crear una función que reciba una cadena
    // y devuelva la cadena con todas las letras duplicadas.
    public static String cadenaDuplicada(String cadena) {
        StringBuilder cadAux = new StringBuilder();//es como la clase string sin limitaciones
        for (char caracter : cadena.toCharArray()) {
            if (Character.isLetter(caracter)) {
                cadAux.append(caracter);
                cadAux.append(caracter);
            }
        }
        return cadAux.toString();
    }

    //13. Crear una función que reciba una cadena
    // y devuelva la cadena con todas las letras en orden alfabético.
    public static String cadenaAlfabeticamentes(String cadena) {
        StringBuilder cadAux = new StringBuilder();
        char[] vecCaracteres = cadena.toCharArray();
        for (int i = 0; i < vecCaracteres.length; i++) {

        }
        return "";
    }
    // 14. Crear una función que reciba una cadena
    // y devuelva la cadena con todas las palabras en orden alfabético.

    // 15. Crear una función que reciba una cadena y devuelva
    // la cadena con todas las palabras de longitud par en mayúsculas
    // y las palabras de longitud impar en minúsculas.

    // 16. Crear una función que reciba una cadena y devuelva
    //  la cadena con todas las palabras de longitud par invertidas.

    //17. Crear una función que reciba una cadena y devuelva la cadena con todas las palabras de longitud impar invertidas.
    //18. Crear una función que reciba una cadena y devuelva la cadena con todas las palabras que comienzan con una vocal en mayúsculas.
    //           19. Crear una función que reciba una cadena y devuelva la cadena con todas las palabras que comienzan con una consonante en minúsculas.
    //          20. Crear una función que reciba una cadena y devuelva la cadena con todas las palabras que terminan con una vocal duplicadas.
}
