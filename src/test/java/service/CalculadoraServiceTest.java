package service;

import model.Quadrado;
import model.Triangulo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraServiceTest {

    private CalculadoraService calculadoraService;
    private int a;
    private int b;
    private Double c;
    private Double d;

    @Before
    public void setUp() {
        calculadoraService = new CalculadoraService();
        a = 4;
        b = 2;
        c = 3.0;
        d = 5.0;
    }

    @Test
    public void deveSomarCorretamente() {
        //WHEN: método somar é chamado e são passados 2 números inteiros como argumentos
        int soma = calculadoraService.somar(a, b);

        //THEN: deve somar a e b
        assertEquals(6, soma);
    }

    @Test
    public void deveSubtrairCorretamente() {
        //WHEN: método subtrair é chamado e são passados 2 números inteiros como argumentos
        int subtracao = calculadoraService.subtrair(a, b);

        //THEN: deve subtrair b de a
        assertEquals(2, subtracao);
    }

    @Test
    public void deveDividirCorretamente() {
        //WHEN: método dividir é chamado e são passados 2 números inteiros como argumentos
        int divisao = calculadoraService.dividir(a, b);

        //THEN: deve dividir a por b
        assertEquals(2, divisao);
    }

    @Test
    public void deveMultiplicarCorretamente() {
        //WHEN: método multiplicar é chamado e são passados 2 números inteiros como argumentos
        int multiplicacao = calculadoraService.multiplicar(a, b);

        //THEN: deve multiplicar a por b
        assertEquals(8, multiplicacao);

    }

    @Test
    public void naoDeveFazerDivisaoPorZero() {
        //GIVEN: b (divisor) igual a zero
        b = 0;

        //WHEN: método dividir é chamado com b (divisor) igual a zero

        //THEN: deve lançar exceção
        assertThrows(IllegalArgumentException.class, () -> calculadoraService.dividir(a, b));
    }


    @Test
    public void deveCalcularAreaDoTrianguloCorretamente() {
        //GIVEN: um triângulo com base igual a 3.0 e altura igual a 5.0
        Triangulo triangulo = new Triangulo(c, d);

        //WHEN: a área é calculada
        Double areaTriangulo = calculadoraService.calcularAreaTriangulo(triangulo);

        //THEN: a área do triângulo deve ser igual a 7.5
        assertTrue(areaTriangulo == 7.5);

    }

    @Test
    public void deveCalcularAreaDoQuadradoCorretamente() {
        //GIVEN: um quadrado com lado igual a 3.0
        Quadrado quadrado = new Quadrado(c);

        //WHEN: a área é calculada
        Double areaQuadrado = calculadoraService.calcularAreaQuadrado(quadrado);

        //THEN: deve calcular a área do quadrado corretamente
        assertTrue(areaQuadrado == 9.0);

    }



}
