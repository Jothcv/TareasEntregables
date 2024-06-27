package factory2;

import java.util.Locale;

public class FabricaFiguraGeometrica {
    public FormaGeomterica Fabricafigura(String nombreFigura){
        switch (nombreFigura.toLowerCase()){
            case "circulo":
                return new Circulo();
            case "cuadrado":
                return new Cuadrado();
            default:
                return new FormaGeomterica() {
                    @Override
                    public void dibujar() {
                        System.out.println("el producto"+nombreFigura+"aun no esta disponible");
                    }} ;
        }
    }
}
