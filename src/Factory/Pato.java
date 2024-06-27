package Factory;

public class Pato implements volar,nadar{
    @Override
    public void volar() {
        System.out.println("el pato esta volando");
    }

    @Override
    public void nadar() {
        System.out.println("el pato esta nadando");
    }
}
