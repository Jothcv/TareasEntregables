package factory2;

public class FabricaEjecutora {
    public static void main(String[] args) {
        FabricaFiguraGeometrica fabricaFiguraGeometrica1 = new FabricaFiguraGeometrica();

        FormaGeomterica forma1=fabricaFiguraGeometrica1.Fabricafigura("circulo");
        forma1.dibujar();

        FormaGeomterica forma2=fabricaFiguraGeometrica1.Fabricafigura("triangulo");
        forma2.dibujar();

        FormaGeomterica forma3=fabricaFiguraGeometrica1.Fabricafigura("rectangulo");
        /*if (forma3==null){
            System.out.println("la figura no existe");
        }else {
            forma3.dibujar();
        }*/
    }
}
