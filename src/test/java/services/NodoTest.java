package services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodoTest {

    public  Nodo n;

    @Before
    public void setUp() throws Exception {
        n = new Nodo(1 , null);
    }

    @Test
    public void testToString() {

        String esperado = "nodo{data=1, sig=null}";
        String obtenido = n.toString().toLowerCase();
        assertEquals( esperado, obtenido);
    }
}