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

    @Before
    public void setUp() {
        calculadoraService = new CalculadoraService();
        a = 4;
        b = 2;
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
        assertThrows(ArithmeticException.class, () -> calculadoraService.dividir(a, b));
    }


    @Test
    public void deveCalcularAreaDoTrianguloCorretamente() {
        //GIVEN: um triângulo com base igual a 3.0 e altura igual a 5.0
        Triangulo triangulo = new Triangulo(3.0, 5.0);

        //WHEN: a área é calculada
        Double areaTriangulo = calculadoraService.calcularAreaTriangulo(triangulo);

        //THEN: a área do triângulo deve ser igual a 7.5
        assertTrue(areaTriangulo == 7.5);

    }

    @Test
    public void deveCalcularAreaDoQuadradoCorretamente() {
        //GIVEN: um quadrado com lado igual a 3.0
        Quadrado quadrado = new Quadrado(3.0);

        //WHEN: a área é calculada
        Double areaQuadrado = calculadoraService.calcularAreaQuadrado(quadrado);

        //THEN: deve calcular a área do quadrado corretamente
        assertTrue(areaQuadrado == 9.0);

    }

    @Test
    public void deveRetornarOTrianguloMenor() {
        //GIVEN: dois triângulos de áreas diferentes
        Triangulo triangulo1 = new Triangulo(3.0, 5.0);
        Triangulo triangulo2 = new Triangulo(4.0, 6.0);

        //WHEN: método para comparar dois triângulos e retornar o menor é chamado
        Triangulo trianguloMenor = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);

        //THEN: deve retornar o triângulo com menor área (neste caso, o triângulo 1)
        assertEquals(triangulo1, trianguloMenor);
    }

    @Test
    public void deveRetornarOQuadradoMenor() {
        //GIVEN: dois quadrados de áreas diferentes
        Quadrado quadrado1 = new Quadrado(3.0);
        Quadrado quadrado2 = new Quadrado(4.0);

        //WHEN: método para comparar dois quadrados e retornar o menor é chamado
        Quadrado quadradoMenor = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);

        //THEN: deve retornar o quadrado com menor área (neste caso, o quadrado 1)
        assertFalse(quadradoMenor == quadrado2);

    }

    @Test
    public void aoCompararDoisTriangulosDeMesmaAreaDeveRetornarNulo() {
        //GIVEN: dois triângulos de áreas diferentes
        Triangulo triangulo1 = new Triangulo(3.0, 5.0);
        Triangulo triangulo2 = new Triangulo(3.0, 5.0);

        //WHEN: método para comparar dois triângulos e retornar o menor é chamado
        Triangulo trianguloMenor = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);

        //THEN: deve retornar null
        assertNull(trianguloMenor);
    }

    @Test
    public void aoCompararDoisQuadradosDeMesmaAreaDeveRetornarNulo() {
        //GIVEN: dois quadrados de áreas diferentes
        Quadrado quadrado1 = new Quadrado(3.0);
        Quadrado quadrado2 = new Quadrado(3.0);

        //WHEN: método para comparar dois quadrados e retornar o menor é chamado
        Quadrado quadradoMenor = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);

        //THEN: deve retornar null
        assertNull(quadradoMenor);
    }

}
