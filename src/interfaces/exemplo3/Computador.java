package interfaces.exemplo3;

public interface Computador {
    void ligar();
    default void desligar(){
        System.out.println("Desligando...");
    }
}
