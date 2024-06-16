package observadorr;
import java.util.ArrayList;
import java.util.List;

public class EstacionClima implements sujeto{
    private List<observer> observers;
    private double temperatura;
    private double humedad;
    private double presion;

    public EstacionClima(){
        observers=new ArrayList<>();
    }

    @Override
    public void registrarObservar(observer o) {
        observers.add(o);

    }

    @Override
    public void removerObservador(observer o) {
    observers.remove(o);
    }

    @Override
    public void notificaObservador() {
        for (observer observar:observers){
            observar.actualizarClima(temperatura,humedad,presion);
        }
    }

    public void establecerValoresClima(double temperatura, double humedad, double presion) {
        this.temperatura=temperatura;
        this.humedad=humedad;
        this.presion=presion;
    }

}
