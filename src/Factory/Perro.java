package Factory;

public class Perro implements animal {
    @Override
    public void formaDeHacerSonidos() {
        System.out.println("el perro hace guau");
    }

    public void vigilar(){
        System.out.println("el perro esta vigilando");
    }
}
