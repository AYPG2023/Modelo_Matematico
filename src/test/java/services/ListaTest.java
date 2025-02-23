package services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListaTest {

    private Lista lista;

    @Before
    public void setUp() throws Exception {
        lista = new Lista();
    }

    @Test
    public void TestEstavacia() {

        boolean esperado = false;
        boolean obtenido = lista.estavacia();
        assertEquals(esperado, obtenido);
    }

}