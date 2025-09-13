package com.example;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator { 

    // Multiplicación recursiva optimizada usando división CON MANEJO DE SIGNOS
    public static BigInteger multiplicar(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }
        if (b.equals(BigInteger.ONE)) { 
            return a;
        }

        // Manejar signos
        int signo = 1;
        BigInteger absA = a;
        BigInteger absB = b;
        
        if (a.compareTo(BigInteger.ZERO) < 0) {
            absA = a.negate();
            signo *= -1;
        }
        if (b.compareTo(BigInteger.ZERO) < 0) {
            absB = b.negate();
            signo *= -1;
        }

        // Divide b en dos partes
        BigInteger mitad = absB.divide(BigInteger.TWO);
        BigInteger resto = absB.mod(BigInteger.TWO);

        // Aquí ocurre la recursividad de la multiplicación
        BigInteger mitadProd = multiplicar(absA, mitad);

        // Se duplica el resultado porque b = 2*mitad (si es par)
        BigInteger resultado = mitadProd.add(mitadProd);

        // Si b es impar, se suma una vez más "a"
        if (resto.equals(BigInteger.ONE)) {
            resultado = resultado.add(absA);
        }

        // Aplicar signo
        return signo == 1 ? resultado : resultado.negate();
    }

    // Factorial recursivo usando la multiplicación anterior
    public static BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }

        // Aquí ocurre la recursividad del factorial
        return multiplicar(n, factorial(n.subtract(BigInteger.ONE)));
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        try {
            BigInteger resultado = factorial(BigInteger.valueOf(numero));
            System.out.println("El factorial de " + numero + " es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}