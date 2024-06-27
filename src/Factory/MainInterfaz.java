package Factory;

public class MainInterfaz {
    public static void main(String[] args) {
        Pato pato1= new Pato();
        pato1.volar();

        animal animal1=new gato();
        animal1.formaDeHacerSonidos();

        animal1=new Perro();
        animal1.formaDeHacerSonidos();


    }
}
