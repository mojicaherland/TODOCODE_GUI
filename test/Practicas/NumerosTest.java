package Practicas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    @Test
    public void testSuma() {
        assertEquals(40, Numeros.suma(10, 30));
    }
}