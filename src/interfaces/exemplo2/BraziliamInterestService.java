package interfaces.exemplo2;

public class BraziliamInterestService implements InterestService{
    private double interestrate;

    public BraziliamInterestService(double interestrate) {
        this.interestrate = interestrate;
    }

    @Override
    public double getInterestRate() {
        return 0;
    }

}
