package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numeroUm = soma.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numeroDois = soma.nextDouble();

        double resultado = numeroUm + numeroDois;
        System.out.print("o seu resultado é: " + resultado);

    }

}