package services;

import lombok.Data;
import lombok.Setter;

@Data
public class Lista {

    private Nodo ini;
    private Nodo fin;
    @Setter
    private String nombre;

    public Lista(String nombre) {
        ini = fin = null;
        setNombre(nombre);
    }

    public Lista(){
        this("gaby bañate");
    }

    public boolean estaVacia () {
        return null == ini;
    }

    // Funcion para insetar Adelante
    public void insertarAlFrente(Object d){
        if (estaVacia())
            ini = fin = new Nodo(d);
        else
            ini = new Nodo(d, ini);
    }
    // Funcion para Insertar al final
    public void insertarAlfinal(Object d ){
        if (estaVacia())
            ini = fin = new Nodo (d);
        else
            fin = new Nodo(d, fin);
    }

    //Funcion para eliminar al frente
    public Object eliminarDelFrente() throws ExceptionListaVacia {
        if (estaVacia())
            throw new ExceptionListaVacia( nombre ); // Lanza excepción si la lista está vacía
        Object delete = ini.data;
        if (ini == fin)
            ini = fin = null;
        else
            ini = ini.sig;
        return delete;
    }

    public Object eliminarDelFinal() throws ExceptionListaVacia {
        if (estaVacia()) {
            throw new ExceptionListaVacia(nombre);
        }

        Object delete = fin.data;

        if (ini == fin) { // Si hay un solo elemento en la lista
            ini = fin = null;
        } else {
            Nodo actual = ini;
            while (actual.sig != fin) { // Recorremos hasta el penúltimo nodo
                actual = actual.sig;
            }
            fin = actual; // El penúltimo nodo se convierte en el último
            actual.sig = null; // Eliminamos la referencia al antiguo último nodo
        }
        return delete;
    }


    @Override
    public String toString() {
        return "Lista{" +
                "ini=" + ini +
                ", fin=" + fin +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
