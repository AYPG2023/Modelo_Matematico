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

        boolean esperado = true;
        boolean obtenido = lista.estaVacia();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testInsertarAlFrenteEnListaVacia() {
        lista.insertarAlFrente(10);
        String esperado = "Lista{ini=Nodo(data=10, sig=null), fin=Nodo(data=10, sig=null), nombre='gaby bañate'}";
        String obtenido = lista.toString();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testInsertarAlFinalEnListaVacia() {
        lista.insertarAlfinal(40);
        String esperado = "Lista{ini=Nodo(data=40, sig=null), fin=Nodo(data=40, sig=null), nombre='gaby bañate'}";
        String obtenido = lista.toString();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testEliminarDelFrente() throws ExceptionListaVacia {
        lista.insertarAlFrente(20);
        Object eliminado = lista.eliminarDelFrente();
        String esperado = "Lista{ini=null, fin=null, nombre='gaby bañate'}";
        String obtenido = lista.toString();
        assertEquals(20, eliminado);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testEliminarDelFinal() throws ExceptionListaVacia {
        lista.insertarAlFrente(30);
        lista.insertarAlfinal(50);
        Object eliminado = lista.eliminarDelFinal();
        String esperado = "Lista{ini=Nodo(data=30, sig=null), fin=Nodo(data=30, sig=null), nombre='gaby bañate'}";
        String obtenido = lista.toString();
        assertEquals(50, eliminado);
        assertEquals(esperado, obtenido);
    }
}

