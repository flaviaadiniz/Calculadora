package model;

import org.junit.Assert;
import org.junit.Test;

public class QuadradoTest {


    @Test
    public void deveCriarUmQuadrado() {
        //WHEN: um novo quadrado com lado é criado
        Quadrado quadrado = new Quadrado(5);

        //THEN: Deve criar um objeto quadrado não nulo
        Assert.assertNotNull(quadrado);
    }

}
