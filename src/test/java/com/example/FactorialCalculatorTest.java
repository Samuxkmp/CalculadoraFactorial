package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;

public class FactorialCalculatorTest {

    // ------------------ PRUEBAS PARA multiplicar ------------------
    @Test
    void testMultiplicarPorCero() {
        assertEquals(BigInteger.ZERO, FactorialCalculator.multiplicar(BigInteger.valueOf(5), BigInteger.ZERO));
    }

    @Test
    void testMultiplicarPorUno() {
        assertEquals(BigInteger.valueOf(7), FactorialCalculator.multiplicar(BigInteger.valueOf(7), BigInteger.ONE));
    }

    @Test
    void testMultiplicarSimetria() {
        assertEquals(
            FactorialCalculator.multiplicar(BigInteger.valueOf(3), BigInteger.valueOf(4)),
            FactorialCalculator.multiplicar(BigInteger.valueOf(4), BigInteger.valueOf(3))
        );
    }

    @Test
    void testMultiplicarNumerosGrandes() {
        BigInteger a = new BigInteger("123456789");
        BigInteger b = new BigInteger("987654321");
        assertEquals(a.multiply(b), FactorialCalculator.multiplicar(a, b));
    }

    @Test
    void testMultiplicarNegativos() {
        BigInteger a = BigInteger.valueOf(-5);
        BigInteger b = BigInteger.valueOf(6);
        assertEquals(a.multiply(b), FactorialCalculator.multiplicar(a, b));
    }

    // ------------------ PRUEBAS PARA factorial ------------------
    @Test
    void testFactorialDeCero() {
        assertEquals(BigInteger.ONE, FactorialCalculator.factorial(BigInteger.ZERO));
    }

    @Test
    void testFactorialDeUno() {
        assertEquals(BigInteger.ONE, FactorialCalculator.factorial(BigInteger.ONE));
    }

    @Test
    void testFactorialDeCinco() {
        assertEquals(new BigInteger("120"), FactorialCalculator.factorial(BigInteger.valueOf(5)));
    }

    @Test
    void testFactorialDeDiez() {
        assertEquals(new BigInteger("3628800"), FactorialCalculator.factorial(BigInteger.valueOf(10)));
    }

    @Test
    void testFactorialDeVeinte() {
        assertEquals(new BigInteger("2432902008176640000"), FactorialCalculator.factorial(BigInteger.valueOf(20)));
    }

    @Test
    void testFactorialNegativo() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(BigInteger.valueOf(-1)));
    }

    @Test
    void testFactorialNumeroGrande() {
        assertDoesNotThrow(() -> FactorialCalculator.factorial(BigInteger.valueOf(50)));
    }

    // ------------------ PRUEBAS ADICIONALES PARA LLEGAR A 30 ------------------
    @Test
    void testMultiplicarDosPorDos() {
        assertEquals(BigInteger.valueOf(4), FactorialCalculator.multiplicar(BigInteger.valueOf(2), BigInteger.valueOf(2)));
    }

    @Test
    void testMultiplicarDiezPorDiez() {
        assertEquals(BigInteger.valueOf(100), FactorialCalculator.multiplicar(BigInteger.valueOf(10), BigInteger.valueOf(10)));
    }

    @Test
    void testMultiplicarCeroPorCero() {
        assertEquals(BigInteger.ZERO, FactorialCalculator.multiplicar(BigInteger.ZERO, BigInteger.ZERO));
    }

    @Test
    void testMultiplicarUnoPorCero() {
        assertEquals(BigInteger.ZERO, FactorialCalculator.multiplicar(BigInteger.ONE, BigInteger.ZERO));
    }

    @Test
    void testFactorialDeDos() {
        assertEquals(BigInteger.valueOf(2), FactorialCalculator.factorial(BigInteger.valueOf(2)));
    }

    @Test
    void testFactorialDeTres() {
        assertEquals(BigInteger.valueOf(6), FactorialCalculator.factorial(BigInteger.valueOf(3)));
    }

    @Test
    void testFactorialDeCuatro() {
        assertEquals(BigInteger.valueOf(24), FactorialCalculator.factorial(BigInteger.valueOf(4)));
    }

    @Test
    void testFactorialDeSeis() {
        assertEquals(BigInteger.valueOf(720), FactorialCalculator.factorial(BigInteger.valueOf(6)));
    }

    @Test
    void testFactorialDeSiete() {
        assertEquals(BigInteger.valueOf(5040), FactorialCalculator.factorial(BigInteger.valueOf(7)));
    }

    @Test
    void testFactorialDeOcho() {
        assertEquals(BigInteger.valueOf(40320), FactorialCalculator.factorial(BigInteger.valueOf(8)));
    }

    @Test
    void testFactorialDeNueve() {
        assertEquals(BigInteger.valueOf(362880), FactorialCalculator.factorial(BigInteger.valueOf(9)));
    }

    @Test
    void testFactorialDeQuince() {
        assertEquals(new BigInteger("1307674368000"), FactorialCalculator.factorial(BigInteger.valueOf(15)));
    }

    @Test
    void testMultiplicarNumerosNegativos() {
        BigInteger a = BigInteger.valueOf(-3);
        BigInteger b = BigInteger.valueOf(-4);
        assertEquals(BigInteger.valueOf(12), FactorialCalculator.multiplicar(a, b));
    }

    @Test
    void testMultiplicarNegativoPorPositivo() {
        BigInteger a = BigInteger.valueOf(-5);
        BigInteger b = BigInteger.valueOf(3);
        assertEquals(BigInteger.valueOf(-15), FactorialCalculator.multiplicar(a, b));
    }

    @Test
    void testMultiplicarPositivoPorNegativo() {
        BigInteger a = BigInteger.valueOf(7);
        BigInteger b = BigInteger.valueOf(-2);
        assertEquals(BigInteger.valueOf(-14), FactorialCalculator.multiplicar(a, b));
    }

    @Test
    void testFactorialDeDoce() {
        assertEquals(new BigInteger("479001600"), FactorialCalculator.factorial(BigInteger.valueOf(12)));
    }

    @Test
    void testFactorialDeTrece() {
        assertEquals(new BigInteger("6227020800"), FactorialCalculator.factorial(BigInteger.valueOf(13)));
    }

    @Test
    void testFactorialDeCatorce() {
        assertEquals(new BigInteger("87178291200"), FactorialCalculator.factorial(BigInteger.valueOf(14)));
    }

    @Test
    void testMultiplicarMaximoValor() {
        BigInteger a = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger b = BigInteger.valueOf(2);
        assertEquals(a.multiply(b), FactorialCalculator.multiplicar(a, b));
    }

    @Test
    void testFactorialEdgeCase() {
        assertDoesNotThrow(() -> FactorialCalculator.factorial(BigInteger.valueOf(100)));
    }
}