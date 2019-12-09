package com.db1.db1start;

import java.util.Scanner;

public class App {

    public static Integer soma (Integer num1, Integer num2){
        Integer resultado;
        resultado = num1 + num2;
        return resultado;
    }

    public static Integer subtracao (Integer num1, Integer num2){
        Integer resultado;
        resultado = num1 - num2;
        return resultado;
    }

    public static String retornaMaiuscula (String palavra){
        return palavra.toUpperCase();
    }

    public static String retornaMinuscula (String palavra){
        return palavra.toLowerCase();
    }

    public static Double retornaMenor (Double numero1, Double numero2){
        if (numero1 < numero2) {
            return numero1;
        }
        return numero2;
    }

    public static Double menor (Double numero1, Double numero2, Double numero3){
        if (numero1 < numero2 && numero1 < numero3){
            return numero1;
        }else if (numero2 < numero3 && numero2 < numero1) {
            return numero2;
        }else {
            return numero3;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Integer num1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o segundo número: ");
        Integer num2 = scan.nextInt();
        scan.nextLine();

        System.out.println("O resultado da soma é: " + soma(num1,num2));
        System.out.println("O resultado da subtração é: " + subtracao(num1,num2));


        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        System.out.println("A palavra em maiusculo é: " + retornaMaiuscula(palavra));
        System.out.println("A palavra em minusculo é: " + retornaMinuscula(palavra));


        System.out.println("Digite o primeiro número: ");
        Double numero1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Digite o segundo número: ");
        Double numero2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Digite o terceiro número: ");
        Double numero3 = scan.nextDouble();
        scan.nextLine();

        System.out.println("O menor número entre os 2 primeiros é o: " + retornaMenor(numero1,numero2));
        System.out.println("O menor número de todos é o: " + menor(numero1,numero2,numero3));
    }
}