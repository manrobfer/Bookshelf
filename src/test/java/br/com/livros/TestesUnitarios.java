package br.com.livros;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestesUnitarios {


    private Calculadora calc;

    @BeforeEach
    public void initVars(){
        calc = new Calculadora();
    }


    @Test
     void shouldOlnlyTest(){
        Assertions.assertEquals(11, 11);
        Assertions.assertFalse(12 > 13);
    }

    @Test
    void shouldSumValues(){
        int expected  = 21;
        int totalInt = calc.sum(10,11);
        Assertions.assertEquals(totalInt, expected,"Teste rodou");
    }


}
