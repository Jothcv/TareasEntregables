package TareasEntregables_Inventario;

public class ArticuloInventario {
    private String Nombre;
    private String Descripcion;
    private String Categoria;
    private String Etiquetas;
    private double Precio;
    private String urlFoto;

    // Constructor
    public ArticuloInventario(String Nombre,String Descripcion, String Categoria, String Etiquetas,int Precio,String urlFoto){
        this.Nombre=Nombre;
        this.Descripcion=Descripcion;
        this.Categoria=Categoria;
        this.Etiquetas=Etiquetas;
        this.Precio=Precio;
        this.urlFoto=urlFoto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getEtiquetas() {
        return Etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        Etiquetas = etiquetas;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public void mostrarDetalles() {
        System.out.println("nombre: "+Nombre);
        System.out.println("descripcion: "+Descripcion);
        System.out.println("categoria: "+Categoria);
        System.out.println("etiqqueta: "+Etiquetas);
        System.out.println("precio: "+Precio);
        System.out.println("urlFoto: "+urlFoto);
    }

}
