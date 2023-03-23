package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {

    private CalculadoraService calculadoraService;
    private int a;
    private int b;

    @Before
    public void before() {
        calculadoraService = new CalculadoraService();
        a = 4;
        b = 2;
    }

    @Test
    public void deveSomarCorretamente() {
        //WHEN: método somar é chamado e são passados 2 números inteiros como argumentos
        int soma = calculadoraService.somar(a, b);

        //THEN: deve somar a e b
        Assert.assertEquals(6, soma);
    }

    @Test
    public void deveSubtrairCorretamente() {
        //WHEN: método subtrair é chamado e são passados 2 números inteiros como argumentos
        int subtracao = calculadoraService.subtrair(a, b);

        //THEN: deve subtrair b de a
        Assert.assertEquals(2, subtracao);
    }

    @Test
    public void deveDividirCorretamente() {
        //WHEN: método dividir é chamado e são passados 2 números inteiros como argumentos
        int divisao = calculadoraService.dividir(a, b);

        //THEN: deve dividir a por b
        Assert.assertEquals(2, divisao);
    }

    @Test
    public void deveMultiplicarCorretmente() {
        //WHEN: método multiplicar é chamado e são passados 2 números inteiros como argumentos
        int multiplicacao = calculadoraService.multiplicar(a, b);

        //THEN: deve multiplicar a por b
        Assert.assertEquals(8, multiplicacao);

    }



}
