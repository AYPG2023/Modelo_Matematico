package services;

import lombok.Data;

@Data
public class Nodo {

    public Object data;
    public Nodo sig;

    public Nodo(Object data, Nodo sig) {
        setData( data ); setSig ( sig );
    }

    public Nodo(Object data) {
        this( data, null );
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "data=" + data +
                ", sig=" + sig +
                '}';
    }
}
