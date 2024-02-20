package a1;

public class ejercicio5{
    String nombre;
    String dirección;
    String telefono;

    class Producto {
        int codigo;
        String nombre;
        Tipo tipo;
        Fecha fechaexp;
        String fabricante;
        int q_inventario;
        double precio_uni;
    }
}

enum Tipo {
    LACTEO, CARNICO, FRUTA, ENLATADO
}
