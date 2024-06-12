package EjemploFactory;

import factory2.FormaGeomterica;

public class FabricaArchivos2 {
    public fabricaDeArchvos fabricaArchivos(String nombreArchivos){
        switch (nombreArchivos.toLowerCase()){
            case "word":
                return new word();
            case "excel":
                return new excel();
            case "pdf":
                return new pdf();
            default:
                return new fabricaDeArchvos() {
                    @Override
                    public void crear() {
                        System.out.println("el archvio creado no esta disponble");
                    }
                };

        }
    }
}





