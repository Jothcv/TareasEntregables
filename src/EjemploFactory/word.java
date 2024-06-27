package EjemploFactory;
public class word implements fabricaDeArchvos{
    @Override
    public void crear() {
        System.out.println("cargando.. se ha creado " + fabricaDeArchvos.NOMBRE_ARCHIVOS+ this.getClass().getSimpleName());
    }
}
