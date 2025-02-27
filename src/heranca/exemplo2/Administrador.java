package heranca.exemplo2;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String nome, String rua, String cidade, String bairro, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, rua, cidade, bairro, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularImposto() {
        return super.calcularImposto() + ajudaDeCusto;
    }
}
