package services;

import lombok.Data;
import lombok.Setter;

@Data
public class Lista {

    private  Nodo ini;
    private  Nodo fin;
    @Setter
    private String nombre;

    public Lista(String nombre) {
        ini = fin = null;
        setNombre(nombre);
    }

    public Lista() {
        this("gaby bañate");
    }

    public  boolean estavacia (){
       return null == ini ;

    }

    @Override
    public String toString() {
        return "Lista{" +
                "ini=" + ini +
                ", fin=" + fin +
                '}';
    }
}
