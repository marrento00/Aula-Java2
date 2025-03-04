package interfaces.exemplo3;

public class Laptop implements Computador{
    @Override
    public void ligar() {
        System.out.println("Ligando computador...");
    }

    @Override
    public void desligar() {
        System.out.println("desligando laptop");
    }
}
