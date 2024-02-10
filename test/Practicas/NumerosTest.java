package Practicas;

import Practicas.Numeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class NumerosTest {

    @Test
    public void testSuma() {
        assertEquals(40, Numeros.suma(10, 30));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Numeros.factorial(5));
    }

    @Test
    public void testPotencia2() {
        assertEquals(8, Numeros.potencia(2, 3));
    }

    @Test
    public void testPotencia() {
        assertEquals(8, Numeros.potencia(2, 3));
    }

    @Test
    public void testRaizCuadrada() {
        assertEquals(4, Numeros.raizCuadrada(16));
    }


}