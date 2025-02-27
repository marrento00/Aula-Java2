package interfaces;

public class OperateBMW760i implements OperateCar{

    @Override
    public int direcao(Direcao direcao, double raio, double velocidadeInicial, double velocidadeFinal) {
        return 0;
    }

    @Override
    public int changeLanes(Direcao direcao, double velocidadeInicial, double velocidadeFinal) {
        return 0;
    }

    @Override
    public int signalTurn(Direcao direcao, boolean sinalOn) {
        return 0;
    }

    @Override
    public int getRadarFront(double distanciaDoCarro, double velocidadeDoCarro) {
        return 0;
    }

    @Override
    public int getRadarRear(double distanciaDoCarro, double velocidadeDoCarro) {
        return 0;
    }
}
