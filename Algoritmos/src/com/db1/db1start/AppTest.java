package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void deveRetornar5(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(2,3);
        Assert.assertEquals(expected,response);
   }
    @Test
    public void deveRetornar10(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.subtracao(20,10);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornar20(){
        Application application = new Application();
        Integer expected = 20;
        Integer response = application.multiplicacao(2,10);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornar100(){
        Application application = new Application();
        Integer expected = 100;
        Integer response = application.divisao(200,2);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarEhPar(){
        Application application = new Application();
        String expected = "é par";
        String response = application.retornaParOuNao(10);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornaroMaior(){
        Application application = new Application();
        Integer expected = 20;
        Integer response = application.retornaMaior(20,10);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarNumerosImpares(){
        Application application = new Application();
        Integer expected = 25;
        Integer response = application.retornaQtdNumerosImpares(50);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarLetrasMaiusculas(){
        Application application = new Application();
        String expected = "TERCIO";
        String response = application.retornaMaiusculo("tercio");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarMinusculas(){
        Application application = new Application();
        String expected = "tercio";
        String response = application.retornaMinusculo("TERCIO");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarQtdLetras(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.retornaQtdLetras("DB1START");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarPalavraSemespaco(){
        Application application = new Application();
        String expected = "DB1START";
        String response = application.retornaPalavrasemespaco(" DB1START ");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarQtdLetrasSemEspaco(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.retornaQtdletrassemespaco(" DB1START ");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarAs4primeirasLetras(){
        Application application = new Application();
        String expected = "Terc";
        String response = application.retornaAs4primeiras("Tercio Gabriel Correa Rodrigues");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarApartirdaTerceiraLetra(){
        Application application = new Application();
        String expected = "cio Gabriel Correa Rodrigues";
        String response = application.retornaApartir3("Tercio Gabriel Correa Rodrigues");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarAs4UltimasLetras(){
        Application application = new Application();
        String expected = "gues";
        String response = application.retornaAs4ultimas("Tercio Gabriel Correa Rodrigues");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarcomAlunonaFrente(){
        Application application = new Application();
        String expected = "Aluno Gabriel Correa Rodrigues";
        String response = application.retornaComaluno("Tercio Gabriel Correa Rodrigues");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveContarasVogais(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.retornaContandovogais("Contando as Vogais");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarInvertido(){
        Application application = new Application();
        String expected = "retrevni";
        String response = application.retornarInvertido("inverter");
        Assert.assertEquals(expected,response);
    }


    @Test
    public void deveRetornarMenor(){
        Application application = new Application();
        Double expected = 1.99;
        Double response = application.retornaMenorValor(1.99,9.99);
        Assert.assertEquals(expected,response);

    }

    @Test
    public void deveRetornarMenorDeTodos(){
        Application application = new Application();
        Double expected = 1.99;
        Double response = application.retornaMenorValorDeTodos(1.99,9.99,29.99);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarMedia(){
        Application application = new Application();
        Double expected = 20.0;
        Double response = application.retornaMedia(10.0,20.0,30.0);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveCalcularAreaDeTriangulo(){
        Application application = new Application();
        Double expected = 25.0;
        Double response = application.calculaAreaTringulo(10.0,5.0);
        Assert.assertEquals(expected,response);
    }

}







