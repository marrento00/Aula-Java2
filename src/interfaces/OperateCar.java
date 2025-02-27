package interfaces;

public interface OperateCar {
    int direcao(Direcao direcao, double raio, double velocidadeInicial, double velocidadeFinal);
    int changeLanes(Direcao direcao, double velocidadeInicial, double velocidadeFinal);
    int signalTurn(Direcao direcao, boolean sinalOn);
    int getRadarFront(double distanciaDoCarro, double velocidadeDoCarro);
    int getRadarRear(double distanciaDoCarro, double velocidadeDoCarro);
}
