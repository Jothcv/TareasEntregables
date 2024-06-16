package observadorr;

public interface sujeto {
    void registrarObservar(observer o);
    void  removerObservador(observer o);
    void  notificaObservador();
}
