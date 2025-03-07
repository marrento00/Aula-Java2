package heranca.exemplo2;

public class Empregado extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String rua, String cidade, String bairro, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, rua, cidade, bairro, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double calcularImposto(){
        return salarioBase - (salarioBase*imposto/100);
    }
}
