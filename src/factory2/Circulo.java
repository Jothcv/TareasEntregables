package factory2;

public class Circulo implements FormaGeomterica{
    @Override
    public void dibujar() {
        System.out.println("dibujando " + FormaGeomterica.NOMBRE_FIGURA + this.getClass().getSimpleName());
    }
}
