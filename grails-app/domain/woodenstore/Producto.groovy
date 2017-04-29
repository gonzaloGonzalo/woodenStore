package woodenstore

class Producto {

    String nombre
    String descripcion
    byte[] imagen
    String tipo
    float precio
    Categoria categoria

    static constraints = {
        imagen (nullable:true, maxSize: 1024 * 1024 * 2 /* 2MB */)
    }

    static mapping = {
        imagen sqlType:'longblob'
    }
}
