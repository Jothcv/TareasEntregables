package TareasEntregables_Inventario;

public class ArticuloIntentarioEjecutable {
    public static void main(String[] args) {
        ArticuloInventario producto1 = new ArticuloInventario("Laptop lenovo", "Laptop de alto rendimiento y economica", "Electronica", "computadora portatil ", 1200, "urlFoto1.jpg");
        ArticuloInventario producto2 = new ArticuloInventario("Samsung galaxy a17", "telefono de alto rendimiento para juegos", "Electronica", "telefono moivil", 1500, "urlFoto2.jpg");
        ArticuloInventario producto3 = new ArticuloInventario("Auriculares logitech", "mause de alto nivel con mas de 10m de pulsasiones de vida", "Electronica", "mause gamer", 200, "urlFoto3.jpg");
        ArticuloInventario producto4 = new ArticuloInventario("Tablet applo", "Tablet de 10 pulgadas con pantalla HD", "Electronica", "Tablet applo", 300, "urlFoto4.jpg");
        ArticuloInventario producto5 = new ArticuloInventario("Reloj rolex", "solo para gente fina", "Electronica", "relojes y demas", 150, "urlFoto5.jpg");
        producto1.mostrarDetalles();
        System.out.println();
        producto2.mostrarDetalles();
        System.out.println();
        producto3.mostrarDetalles();
        System.out.println();
        producto4.mostrarDetalles();
        System.out.println();
        producto5.mostrarDetalles();
    }
}
