package com.example.calculatorjava;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void sumaDeDosNumerosPositivos() {
        int a = 1;
        int b = 2;
        int resultadoEsperado = 3;

        int resultadoReal = a + b;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void sumaDeDosNumerosNegativos() {
        int a = -1;
        int b = -2;
        int resultadoEsperado = -3;

        int resultadoReal = a + b;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void sumaDeUnNumeroPositivoYUnNumeroNegativo() {
        int a = 1;
        int b = -2;
        int resultadoEsperado = -1;

        int resultadoReal = a + b;

        assertEquals(resultadoEsperado, resultadoReal);
    }
}