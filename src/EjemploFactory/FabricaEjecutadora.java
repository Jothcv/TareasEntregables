package EjemploFactory;

public class FabricaEjecutadora {
    public static void main(String[] args) {
        FabricaArchivos2 fabricaArchivos4=new FabricaArchivos2();

        fabricaDeArchvos forma1=fabricaArchivos4.fabricaArchivos("word");
        forma1.crear();

        fabricaDeArchvos forma2= fabricaArchivos4.fabricaArchivos("excel");
        forma2.crear();

        fabricaDeArchvos forma3=fabricaArchivos4.fabricaArchivos("pdf");
        forma3.crear();
    }
}
