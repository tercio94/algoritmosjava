package com.db1.db1start;

public class Application {

    public Integer soma(Integer num1, Integer num2) {
        return num1 + num2;

    }

    public Integer subtracao(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiplicacao(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Integer divisao(Integer num1, Integer num2) {
        return num1 / num2;
    }

    public String retornaParOuNao(Integer num1) {
        if (num1 % 2 == 0) {
            return "é par";
        } else {
            return "é impar";
        }
    }

    public Integer retornaMaior(Integer num1, Integer num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public Integer retornaQtdNumerosImpares(Integer qtdimpar) {
        Integer count = 0;
        Integer x;
        for (x = 0; x < qtdimpar; x++) {
            if (x % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public String retornaMaiusculo(String palavra) {
        return palavra.toUpperCase();

    }

    public String retornaMinusculo(String palavra) {
        return palavra.toLowerCase();
    }

    public Integer retornaQtdLetras(String palavra) {
        return palavra.length();
    }

    public String retornaPalavrasemespaco(String palavra) {
        return palavra.trim();
    }

    public Integer retornaQtdletrassemespaco(String palavra) {
        return palavra.trim().length();
    }

    public String retornaAs4primeiras(String palavra) {
        return palavra.substring(0, 4);
    }

    public String retornaApartir3(String palavra) {
        return palavra.substring(3, 31);
    }

    public String retornaAs4ultimas(String palavra) {
        return palavra.substring(27, 31);
    }

    public String retornaComaluno(String palavra) {
        String[] limpar = {"Tercio"};
        for (String n : limpar) {
            palavra = palavra.replaceAll(n, "Aluno");
        }
        return palavra;
    }

    public Integer retornaContandovogais(String palavra) {
        Integer count = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        return count;
    }

    public String retornarInvertido(String texto) {
        String resultado = "";
        for (Integer x = texto.length() - 1; x >= 0; x--) {
            resultado += texto.charAt(x);
        }
        return resultado;
    }

    public Double retornaMenorValor(Double num1, Double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public double retornaMenorValorDeTodos(Double num1, Double num2, Double num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num3 && num2 < num1) {
            return num2;
        } else {
            return num3;
        }
    }

    public double retornaMedia(Double num1, Double num2, Double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public double calculaAreaTringulo(Double base, Double altura) {
        return base * altura / 2;
    }

}













