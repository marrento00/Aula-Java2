package interfaces.exemplo4.service;

public class ImpostoBrasilService implements ImpostoService{
    @Override
    public double imposto(double quantia) {
        if(quantia<=100.0){
            return quantia*0.2;
        }else{
            return quantia*0.15;
        }
    }
}
